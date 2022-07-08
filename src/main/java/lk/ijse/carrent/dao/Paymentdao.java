package lk.ijse.carrent.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Paymentdao {
   String paymentID;
   String BookingID;
   String time;
   String date;
   double Discount;

}
