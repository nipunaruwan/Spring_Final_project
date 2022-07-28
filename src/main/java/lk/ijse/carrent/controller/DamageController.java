package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.dto.Damagedto;
import lk.ijse.carrent.service.CustomerService;
import lk.ijse.carrent.service.DamageService;
import lk.ijse.carrent.utill.Responceutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("Damage")
@CrossOrigin
public class DamageController {

    @Autowired
    DamageService damageService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SaveDamage(Damagedto damagedto) {
        damageService.saveDamage(damagedto);
        return new Responceutil(200, "save", null);

    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil Upadatedamage(@RequestBody Damagedto damagedto) {
        damageService.updateDamage(damagedto);
        return new Responceutil(200, "update", null);
    }
    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil DeleteDamage(@RequestParam String iD) {
        damageService.deleteDamage(iD);
        return new Responceutil(200, "delete", null);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil getAllDamage() {
        return new Responceutil(200, "all", damageService.getAllDamages());
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SearchCustomer(@PathVariable String iD) {
        return new Responceutil(200, "search", damageService.searchDamage(iD));
    }


}
