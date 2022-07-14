package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.Damagedto;

import java.util.List;

public interface DamageService {

        void saveDamage(Damagedto dto);
        void deleteDamage(String id);
        void updateDamage(Damagedto dto);
        Damagedto searchDamage(String id);
        List<Damagedto> getAllDamages();
}
