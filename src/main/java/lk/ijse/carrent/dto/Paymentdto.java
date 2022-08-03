package lk.ijse.carrent.dto;

import lk.ijse.carrent.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Paymentdto {
   String paymentID;
  String BookingID;
   String time;
   String date;
   double Discount;

}
