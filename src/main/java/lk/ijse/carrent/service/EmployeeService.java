package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.Employeedto;

import java.util.List;

public interface EmployeeService {
    void saveEmployee(Employeedto dto);
    void deleteEmployee(String id);
    void updateEmployee(Employeedto dto);
    Employeedto searchEmployee(String id);
    List<Employeedto> getAllEmployees();
}
