package lk.ijse.carrent.service;

import lk.ijse.carrent.config.JPAConfig;
import lk.ijse.carrent.entity.Customer;
import lk.ijse.carrent.repo.CustomerRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@WebAppConfiguration
@ContextConfiguration(classes = {JPAConfig.class})
@ExtendWith(SpringExtension.class)
//@Transactional
class CustomerServiceTest {
@Autowired
    CustomerRepo repo;
    @Test
    void saveCustomer() {
       /* Customer customer=new Customer("0000144244","001","sadun","panadura","2000000","345678",07645);
        Customer customer2=new Customer("000014","002","kasun","kaluthara","3000000","345",076454534);*/
     /*   repo.save(customer);
        repo.save(customer2);*/
    }

    @Test
    void deleteCustomer() {
    }

    @Test
    void updateCustomer() {
    }

    @Test
    void searchCustomer() {
    }

    @Test
    void getAllCustomers() {
    }
}