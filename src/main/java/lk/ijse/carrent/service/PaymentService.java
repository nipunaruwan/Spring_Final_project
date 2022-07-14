package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.Paymentdto;
import lk.ijse.carrent.entity.Payment;

import java.util.List;

public interface PaymentService {
    void savePayment(Paymentdto dto);
    void deletePayment(String id);
    void updatePayment(Paymentdto dto);
    Payment searchPayment(String id);
    List<Paymentdto> getAllPayments();
}
