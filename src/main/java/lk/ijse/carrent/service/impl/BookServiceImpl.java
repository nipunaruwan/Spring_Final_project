package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.Bookingdto;
import lk.ijse.carrent.entity.Book;
import lk.ijse.carrent.repo.BookRepo;
import lk.ijse.carrent.service.BookService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepo repo;
    @Autowired
    private ModelMapper map;

    public void saveBooking(Bookingdto dto) {
        if (!repo.existsById(dto.getBookingID())) {
            repo.save(map.map(dto, Book.class));
        } else {
            throw new RuntimeException("this bookid already exist");
        }
    }

    public void deleteBooking(String id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new RuntimeException("Please check the Book ID.. No Such Customer..!");
        }
    }

    public void updateBooking(Bookingdto dto) {
        if (repo.existsById(dto.getBookingID())) {
            repo.save(map.map(dto, Book.class));
        } else {
            throw new RuntimeException("No Such Book To Update..! Please Check the ID..!");
        }
    }

    public Bookingdto searchBooking(String id) {
        if (repo.existsById(id)) {
            return map.map(repo.findById(id).get(), Bookingdto.class);
        } else {
            throw new RuntimeException("No Book For " + id + " ..!");
        }
    }

    public List<Bookingdto> getAllBooking() {
        return map.map(repo.findAll(), new TypeToken<List<Bookingdto>>() {
        }.getType());
    }
}
