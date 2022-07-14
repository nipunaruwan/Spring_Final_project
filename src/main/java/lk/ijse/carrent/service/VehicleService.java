package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.Vehecledto;

import java.util.List;

public interface
VehicleService {
    void saveVehicle(Vehecledto dto);
    void deleteVehicle(String id);
    void updateVehicle(Vehecledto dto);
    Vehecledto searchVehicle(String id);
    List<Vehecledto> getAllVehicles();
}
