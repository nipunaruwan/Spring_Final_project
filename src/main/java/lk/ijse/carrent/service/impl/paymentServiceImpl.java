package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.Paymentdto;
import lk.ijse.carrent.entity.Payment;
import lk.ijse.carrent.repo.PaymentRepo;
import lk.ijse.carrent.service.PaymentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional

public class paymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public void savePayment(Paymentdto dto) {
        if (!repo.existsById(dto.getPaymentID())) {
            repo.save(mapper.map(dto, Payment.class));
        } else {
            throw new RuntimeException("Payment Already Exist..!");
        }
    }

    @Override
    public void deletePayment(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Payment ID.. No Such Payment..!");
        }
    }

    @Override
    public void updatePayment(Paymentdto dto) {
        if (repo.existsById(dto.getPaymentID())) {
            repo.save(mapper.map(dto, Payment.class));
        } else {
            throw new RuntimeException("No Such Payment To Update..! Please Check the ID..!");
        }
    }

    @Override
    public Payment searchPayment(String id) {
        if (repo.existsById(id)) {
            return mapper.map(repo.findById(id).get(), Payment.class);
        } else {
            throw new RuntimeException("No Payment For " + id + " ..!");
        }

    }

    @Override
    public List<Paymentdto> getAllPayments() {
        return mapper.map(repo.findAll(), new TypeToken<List<Paymentdto>>() {
        }.getType());
    }
}
