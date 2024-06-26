package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.Rentdto;

import java.util.List;

public interface RentService {
    void saveRent(Rentdto dto);
    void deleteRent(String id);
    void updateRent(Rentdto dto);
    Rentdto searchRent(String id);
    List<Rentdto> getAllRents();
}
