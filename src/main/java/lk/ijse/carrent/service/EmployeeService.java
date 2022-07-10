package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.dto.Driverdto;
import lk.ijse.carrent.dto.Employeedto;

import java.util.List;

public interface EmployeeService {
    void saveEmployee(Employeedto dto);
    void deleteEmployee(String id);
    void updateEmployee(Employeedto dto);
    void  searchEmployee(String id);
    List<Employeedto> getAllEmployees();
}
