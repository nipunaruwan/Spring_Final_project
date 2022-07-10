package lk.ijse.carrent.service.impl;

import lk.ijse.carrent.dto.Bookingdto;
import lk.ijse.carrent.dto.Customerdto;
import lk.ijse.carrent.entity.Book;
import lk.ijse.carrent.entity.Customer;
import lk.ijse.carrent.repo.BookRepo;
import lk.ijse.carrent.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
        public void deleteBooking (String id){

        }

        public void updateBooking (Bookingdto dto){

        }

        public Customerdto searchBooking (String id){
            return null;
        }

        public List<Bookingdto> getAllBooking () {
            return null;
        }
    }
