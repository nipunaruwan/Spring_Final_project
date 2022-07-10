package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.Bookingdto;
import lk.ijse.carrent.dto.Customerdto;

import java.util.List;

public interface CustomerService {
    void saveCustomer(Customerdto dto);
    void deleteCustomer(String id);
    void updateCustomer(Customerdto dto);
   void   searchCustomer(String id);
    List<Customerdto> getAllCustomers();
}
