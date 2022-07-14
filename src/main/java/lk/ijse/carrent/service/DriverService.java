package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.Driverdto;

import java.util.List;

public interface DriverService {

    void saveDriver(Driverdto dto);
    void deleteDriver(String id);
    void updateDriver(Driverdto dto);
    Driverdto searchDriver(String id);
    List<Driverdto> getAllDrivers();
}
