package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.dto.Damagedto;

import java.util.List;

public interface DamageService {

        void saveDamage(Damagedto dto);
        void deleteDamage(String id);
        void updateDamage(Damagedto dto);
        void  searchDamage(String id);
        List<Damagedto> getAllDamages();
}
