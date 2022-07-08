package lk.ijse.carrent.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Rentdao {
   String cusID;
   String  DID;
   String VID;
   String Distance;
   String Km;
   double price ;

}
