package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.entity.Customer;
import lk.ijse.carrent.repo.CustomerRepo;
import lk.ijse.carrent.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo repo;

    @Autowired
    private ModelMapper map;
    public void saveCustomer(Customerdto dto) {

        if (!repo.existsById(dto.getCusID())) {
            repo.save(map.map(dto, Customer.class));
        } else {
            throw new RuntimeException("This cusiD id is already exists....!!!");
        }
    }

    public void deleteCustomer(String id) {

    }

    public void updateCustomer(Customerdto dto) {

    }

    public void searchCustomer(String id) {

    }

    public List<Customerdto> getAllCustomers() {
        return null;
    }
}
