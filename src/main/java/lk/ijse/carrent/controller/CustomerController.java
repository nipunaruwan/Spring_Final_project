package lk.ijse.carrent.controller;


import lk.ijse.carrent.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Customer")
@CrossOrigin
public class CustomerController {

  @Autowired
    CustomerService customerService;


}