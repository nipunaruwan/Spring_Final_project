package lk.ijse.carrent.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Vehecledao {
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
