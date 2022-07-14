package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.Damagedto;
import lk.ijse.carrent.entity.Damage;
import lk.ijse.carrent.repo.DamageRepo;
import lk.ijse.carrent.service.DamageService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DamageServiceImpl implements DamageService {

    @Autowired
    private DamageRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveDamage(Damagedto dto) {
        if (!repo.existsById(dto.getDamageID())) {
            repo.save(mapper.map(dto, Damage.class));
        } else {
            throw new RuntimeException("Damage Already Exist.!");
        }
    }

    @Override
    public void deleteDamage(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Damage ID.. No Such Damage..!");
        }
    }

    @Override
    public void updateDamage(Damagedto dto) {
        if (repo.existsById(dto.getDamageID())) {
            repo.save(mapper.map(dto, Damage.class));
        } else {
            throw new RuntimeException("No Such Damage To Update..! Please Check the ID..!");
        }
    }

    @Override
    public Damagedto searchDamage(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), Damagedto.class);
        } else {
            throw new RuntimeException("No Customer For " + id + " ..!");
        }
    }

    @Override
    public List<Damagedto> getAllDamages() {
        return mapper.map(repo.findAll(), new TypeToken<List<Damagedto>>() {
        }.getType());
    }
}
