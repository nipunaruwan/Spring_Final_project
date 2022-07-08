package lk.ijse.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Vehicle {
    @Id
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
