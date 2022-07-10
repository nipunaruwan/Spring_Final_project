package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.dto.Damagedto;
import lk.ijse.carrent.dto.Driverdto;

import java.util.List;

public interface DriverService {

    void saveDriver(Driverdto dto);
    void deleteDriver(String id);
    void updateDriver(Driverdto dto);
    void  searchDriver(String id);
    List<Customerdto> getAllDrivers();
}
