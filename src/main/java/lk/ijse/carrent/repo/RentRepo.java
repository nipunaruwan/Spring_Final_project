package lk.ijse.carrent.repo;

import lk.ijse.carrent.entity.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepo extends JpaRepository<Rent,String> {
}
