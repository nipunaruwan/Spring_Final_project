package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.dto.Vehecledto;
import lk.ijse.carrent.service.CustomerService;
import lk.ijse.carrent.service.VehicleService;
import lk.ijse.carrent.utill.Responceutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("Vehicle")
@CrossOrigin
public class VehecleController {
    @Autowired
    VehicleService vehicleService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SaveVehicle(Vehecledto vehecledto) {
        vehicleService.saveVehicle(vehecledto);
        return new Responceutil(200, "save", null);

    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil updateVehicle(@RequestBody Vehecledto vehecledto) {
        vehicleService.updateVehicle(vehecledto);
        return new Responceutil(200, "update", null);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil DeleteVehicle(@RequestParam String iD) {
        vehicleService.deleteVehicle(iD);
        return new Responceutil(200, "delete", null);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil getAllVehicle() {
        return new Responceutil(200, "all", vehicleService.getAllVehicles());
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SearchVehicle(@PathVariable String iD) {
        return new Responceutil(200, "search", vehicleService.searchVehicle(iD));
    }

}
