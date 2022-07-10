package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.dto.Employeedto;
import lk.ijse.carrent.dto.Paymentdto;

import java.util.List;

public interface PaymentService {
    void savePayment(Paymentdto dto);
    void deletePayment(String id);
    void updatePayment(Paymentdto dto);
    void  searchPayment(String id);
    List<Paymentdto> getAllPayments();
}
