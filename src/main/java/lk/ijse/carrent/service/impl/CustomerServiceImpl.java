package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.entity.Customer;
import lk.ijse.carrent.repo.CustomerRepo;
import lk.ijse.carrent.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

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
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Customer ID.. No Such Customer..!");
        }


    }

    public void updateCustomer(Customerdto dto) {
        if (repo.existsById(dto.getCusID())) {
            repo.save(map.map(dto, Customer.class));
        } else {
            throw new RuntimeException("No Such Customer To Update..! Please Check the ID!");
        }
    }

    public Customerdto searchCustomer(String id) {
        if (repo.existsById(id)){
            return map.map(repo.findById(id).get(),Customerdto.class);
        }else {
            throw new RuntimeException("No Customer For " + id + " ..!");
        }

    }

    public List<Customerdto> getAllCustomers() {
        return null;
    }
}
