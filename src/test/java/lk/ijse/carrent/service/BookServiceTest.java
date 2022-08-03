package lk.ijse.carrent.service;

import lk.ijse.carrent.config.JPAConfig;
import lk.ijse.carrent.entity.Book;
import lk.ijse.carrent.repo.BookRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;
@WebAppConfiguration
@ContextConfiguration(classes = {JPAConfig.class})
@ExtendWith(SpringExtension.class)
class BookServiceTest {
@Autowired
    BookRepo repo;
    @Test
    void saveBooking() {
       /* Book book = new Book("B001","p001",""C001","D001","panadura","2022/5/3","2022/5/5","2022/5/7");
        repo.save(book);*/
    }

    @Test
    void deleteBooking() {
    }

    @Test
    void updateBooking() {
    }

    @Test
    void searchBooking() {
    }

    @Test
    void getAllBooking() {
    }
}