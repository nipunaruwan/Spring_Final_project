package lk.ijse.carrent.repo;

import lk.ijse.carrent.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment ,String> {
}
