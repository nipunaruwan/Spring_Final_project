package lk.ijse.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Vehecledto {
  String  VID;
  String  DID;
  String  Brand;
  String  rate;
  String  fueltype;
  String  image;
  String  Distance;
  int  ownercontact;
  String  Vtype;
}
