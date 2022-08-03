package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.dto.Driverdto;
import lk.ijse.carrent.service.CustomerService;
import lk.ijse.carrent.service.DriverService;
import lk.ijse.carrent.utill.Responceutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Driver")
@CrossOrigin
public class DriverController {
    @Autowired
    DriverService driverService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SaveDriver(Driverdto driverdto) {
        driverService.saveDriver(driverdto);
        return new Responceutil(200, "save", null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil updateDriver(@RequestBody Driverdto driverdto) {
        driverService.updateDriver(driverdto);
        return new Responceutil(200, "update", null);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil DeleteDriver(@RequestParam String id) {
        driverService.deleteDriver(id);
        return new Responceutil(200, "delete", null);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil getAllDriver() {
        return new Responceutil(200, "all", driverService.getAllDrivers());
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SearchDriver(@PathVariable String id) {
        return new Responceutil(200, "search", driverService.searchDriver(id));
    }

}