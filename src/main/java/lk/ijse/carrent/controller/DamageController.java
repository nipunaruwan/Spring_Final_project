package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.dto.Damagedto;
import lk.ijse.carrent.service.CustomerService;
import lk.ijse.carrent.service.DamageService;
import lk.ijse.carrent.utill.Responceutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

public class DamageController {

    @Autowired
    DamageService damageService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SaveDamage(Damagedto damagedto) {
        damageService.saveDamage(damagedto);
        return new Responceutil(200, "save", null);

    }

}
