package lk.ijse.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Rentdto {
   String rentID;
   String BookingID;
   String cusID;
   String  DID;
   String VID;
   String Distance;
   String Km;
   double price ;

}
