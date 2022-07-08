package lk.ijse.carrent.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Bookingdao {
    String BookingID;
    String CusID;
    String DriverID;
    String pickuplocation;
    String pickupDate;
    String ReturnDate;
    String ReseveDate;

}
