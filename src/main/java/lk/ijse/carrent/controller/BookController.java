package lk.ijse.carrent.controller;

import lk.ijse.carrent.dto.Bookingdto;
import lk.ijse.carrent.dto.Vehecledto;
import lk.ijse.carrent.service.BookService;
import lk.ijse.carrent.service.VehicleService;
import lk.ijse.carrent.utill.Responceutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Book")
@CrossOrigin
public class BookController {
    @Autowired
    BookService bookService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SaveBook(Bookingdto bookingdto) {
        bookService.saveBooking(bookingdto);
        return new Responceutil(200, "save", null);

    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil updateBook(@RequestBody Bookingdto bookingdto) {
        bookService.updateBooking(bookingdto);
        return new Responceutil(200, "update", null);
    }

    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil DeleteBook(@RequestParam String iD) {
        bookService.deleteBooking(iD);
        return new Responceutil(200, "delete", null);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil getAllBook() {
        return new Responceutil(200, "all", bookService.getAllBooking());
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Responceutil SearchBook(@PathVariable String iD) {
        return new Responceutil(200, "search", bookService.searchBooking(iD));
    }

}
