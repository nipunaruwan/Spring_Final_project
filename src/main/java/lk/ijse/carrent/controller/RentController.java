package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.dto.Rentdto;
import lk.ijse.carrent.service.CustomerService;
import lk.ijse.carrent.service.RentService;
import lk.ijse.carrent.utill.Responceutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Rent")
@CrossOrigin
public class RentController {
    @Autowired
    RentService rentService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SaveRent(Rentdto rentdto) {
        rentService.saveRent(rentdto);
        return new Responceutil(200, "save", null);

    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil updateRent(@RequestBody Rentdto rentdto) {
        rentService.updateRent(rentdto);
        return new Responceutil(200, "update", null);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil DeleteRent(@RequestParam String iD) {
        rentService.deleteRent(iD);
        return new Responceutil(200, "delete", null);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil getAllRent() {
        return new Responceutil(200, "all", rentService.getAllRents());
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SearchRent(@PathVariable String iD) {
        return new Responceutil(200, "search", rentService.searchRent(iD));
    }
}
