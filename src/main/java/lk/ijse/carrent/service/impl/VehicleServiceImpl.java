package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.Vehecledto;
import lk.ijse.carrent.entity.Vehicle;
import lk.ijse.carrent.repo.VehecleRepo;
import lk.ijse.carrent.service.VehicleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehecleRepo repo;

    @Autowired
    private ModelMapper mapper;
    @Override
    public void saveVehicle(Vehecledto dto) {
        if (!repo.existsById(dto.getVID())) {
            repo.save(mapper.map(dto, Vehicle.class));
        } else {
            throw new RuntimeException("vehicle Already Exist..!");
        }
    }

    @Override
    public void deleteVehicle(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the vehicle ID.. No Such vehicle..!");
        }
    }

    @Override
    public void updateVehicle(Vehecledto dto) {
        if (repo.existsById(dto.getVID())) {
            repo.save(mapper.map(dto, Vehicle.class));
        } else {
            throw new RuntimeException("No Such Vehicle To Update..! Please Check the ID..!");
        }
    }

    @Override
    public Vehecledto searchVehicle(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), Vehecledto.class);
        } else {
            throw new RuntimeException("No Vehicle For " + id + " ..!");
        }
    }

    @Override
    public List<Vehecledto> getAllVehicles() {
        return mapper.map(repo.findAll(), new TypeToken<List<Vehecledto>>() {
        }.getType());
    }
}
