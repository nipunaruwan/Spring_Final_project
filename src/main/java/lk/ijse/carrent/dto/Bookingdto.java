package lk.ijse.carrent.dto;

import lk.ijse.carrent.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Bookingdto {
    String BookingID;
    String PID;
    String CusID;
    String DriverID;
    String pickuplocation;
    String pickupDate;
    String ReturnDate;
    String ReseveDate;

}
