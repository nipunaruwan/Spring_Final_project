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
public class Rent {
    @Id
    String rentID;
    String cusID;
    String  DID;
    String VID;
    String Distance;
    String Km;
    double price ;
}
