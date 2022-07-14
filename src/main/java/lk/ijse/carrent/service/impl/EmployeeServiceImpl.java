package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.Employeedto;
import lk.ijse.carrent.entity.Employee;
import lk.ijse.carrent.repo.EmployeeRepo;
import lk.ijse.carrent.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void saveEmployee(Employeedto dto) {
        if (!repo.existsById(dto.getEID())) {
            repo.save(mapper.map(dto, Employee.class));
        } else {
            throw new RuntimeException("Employee Already Exist..!");
        }
    }

    @Override
    public void deleteEmployee(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Employee ID.. No Such Employee..!");
        }
    }

    @Override
    public void updateEmployee(Employeedto dto) {
        if (repo.existsById(dto.getEID())) {
            repo.save(mapper.map(dto, Employee.class));
        } else {
            throw new RuntimeException("No Such Employee To Update..! Please Check the ID..!");
        }
    }

    @Override
    public Employeedto searchEmployee(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), Employeedto.class);
        } else {
            throw new RuntimeException("No Employee For " + id + " ..!");
        }
    }

    @Override
    public List<Employeedto> getAllEmployees() {
        return mapper.map(repo.findAll(), new TypeToken<List<Employeedto>>() {
        }.getType());
    }
}
