package lk.ijse.carrent.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Damagedao {
   String VID;
   String DVownname;
   String VDiscription;
   String Damagetype;
   int Dvcontact;
}
