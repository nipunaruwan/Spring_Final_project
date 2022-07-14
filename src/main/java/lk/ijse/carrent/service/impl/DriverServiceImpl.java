package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.Driverdto;
import lk.ijse.carrent.entity.Driver;
import lk.ijse.carrent.repo.DriverRepo;
import lk.ijse.carrent.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveDriver(Driverdto dto) {
        if (!repo.existsById(dto.getDID())) {

            repo.save(mapper.map(dto, Driver.class));
        } else {
            throw new RuntimeException("Driver Already Exist..!");
        }
    }

    @Override
    public void deleteDriver(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Driver ID.. No Such driver..!");
        }

    }

    @Override
    public void updateDriver(Driverdto dto) {
        if (repo.existsById(dto.getDID())) {
            repo.save(mapper.map(dto, Driver.class));
        } else {
            throw new RuntimeException("No Such Driver To Update..! Please Check the ID..!");
        }
    }

    @Override
    public Driverdto searchDriver(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), Driverdto.class);
        } else {
            throw new RuntimeException("No driver For " + id + " ..!");
        }
    }

    @Override
    public List<Driverdto> getAllDrivers() {
        return mapper.map(repo.findAll(), new TypeToken<List<Driverdto>>() {
        }.getType());
    }
}
