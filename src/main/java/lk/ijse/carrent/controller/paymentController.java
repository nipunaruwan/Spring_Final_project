package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.dto.Paymentdto;
import lk.ijse.carrent.service.CustomerService;
import lk.ijse.carrent.service.PaymentService;
import lk.ijse.carrent.utill.Responceutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("Payment")
@CrossOrigin
public class paymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SavePayment(Paymentdto paymentdto) {
        paymentService.savePayment(paymentdto);
        return new Responceutil(200, "save", null);

    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil updatepayment(@RequestBody Paymentdto paymentdto) {
        paymentService.updatePayment(paymentdto);
        return new Responceutil(200, "update", null);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil Deletepayment(@RequestParam String iD) {
        paymentService.deletePayment(iD);
        return new Responceutil(200, "delete", null);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil getAllpayment() {
        return new Responceutil(200, "all", paymentService.getAllPayments());
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil Searchpayment(@PathVariable String iD) {
        return new Responceutil(200, "search", paymentService.searchPayment(iD));
    }

}
