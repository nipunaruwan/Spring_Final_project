package lk.ijse.carrent.repo;

import lk.ijse.carrent.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,String> {
}
