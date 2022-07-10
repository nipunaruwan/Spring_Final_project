package lk.ijse.carrent.Advisor;

import lk.ijse.carrent.utill.Responceutil;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@CrossOrigin
@RestControllerAdvice
public class AppWideExceptionHadler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({Exception.class})
    public Responceutil exceptionHandler(Exception e) {
        return new Responceutil(500, e.getMessage(), null);
    }
}
