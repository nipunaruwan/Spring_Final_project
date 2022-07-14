package lk.ijse.carrent.controller;


import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.service.CustomerService;

import lk.ijse.carrent.utill.Responceutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SaveCustomer(Customerdto customerdto) {
        customerService.saveCustomer(customerdto);
        return new Responceutil(200, "save", null);

    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil updateCustomer(@RequestBody Customerdto customerdto) {
        customerService.updateCustomer(customerdto);
        return new Responceutil(200, "update", null);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil DeleteCustomer(@RequestParam String iD) {
        customerService.deleteCustomer(iD);
        return new Responceutil(200, "delete", null);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil getAllCustomer() {
        return new Responceutil(200, "all", customerService.getAllCustomers());
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SearchCustomer(@PathVariable String iD) {
        return new Responceutil(200, "search", customerService.searchCustomer(iD));
    }

}