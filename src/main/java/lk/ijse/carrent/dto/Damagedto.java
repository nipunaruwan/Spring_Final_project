package lk.ijse.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Damagedto {
   String DamageID;
   String VID;
   String DVownname;
   String VDiscription;
   String Damagetype;
   int Dvcontact;
}
