package lk.ijse.carrent.service;

import lk.ijse.carrent.dto.Bookingdto;
import lk.ijse.carrent.dto.Customerdto;

import java.util.List;

public interface BookService {
    void saveBooking(Bookingdto dto);
    void deleteBooking(String id);
    void updateBooking(Bookingdto dto);
  Customerdto searchBooking(String id);
    List<Bookingdto> getAllBooking();
}
