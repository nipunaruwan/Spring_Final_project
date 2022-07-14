package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.dto.Employeedto;
import lk.ijse.carrent.service.EmployeeService;
import lk.ijse.carrent.utill.Responceutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SaveEmployee(Employeedto employeedto){
        employeeService.saveEmployee(employeedto);
        return new Responceutil(200, "save", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil updateEmployee(@RequestBody Employeedto employeedto) {
        employeeService.updateEmployee(employeedto);
        return new Responceutil(200, "update", null);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil DeleteEmployee(@RequestParam String iD) {
        employeeService.deleteEmployee(iD);
        return new Responceutil(200, "delete", null);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil getAllEmployee() {
        return new Responceutil(200, "all", employeeService.getAllEmployees());
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SearchEmployee(@PathVariable String iD) {
        return new Responceutil(200, "search", employeeService.searchEmployee(iD));
    }

}
