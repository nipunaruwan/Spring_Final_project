package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.Rentdto;
import lk.ijse.carrent.entity.Rent;
import lk.ijse.carrent.repo.RentRepo;
import lk.ijse.carrent.service.RentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class RentServiceImpl implements RentService {
    @Autowired
    private RentRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveRent(Rentdto dto) {
        if (!repo.existsById(dto.getRentID())) {
            repo.save(mapper.map(dto, Rent.class));
        } else {
            throw new RuntimeException("Rent Already Exist..!");
        }
    }

    @Override
    public void deleteRent(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Rent ID.. No Such Rent..!");
        }
    }

    @Override
    public void updateRent(Rentdto dto) {
        if (repo.existsById(dto.getRentID())) {
            repo.save(mapper.map(dto, Rent.class));
        } else {
            throw new RuntimeException("No Such Rent To Update..! Please Check the ID..!");
        }
    }

    @Override
    public Rentdto searchRent(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), Rentdto.class);
        } else {
            throw new RuntimeException("No Rent For " + id + " ..!");
        }
    }

    @Override
    public List<Rentdto> getAllRents() {
        return mapper.map(repo.findAll(), new TypeToken<List<Rentdto>>() {
        }.getType());
    }
}
