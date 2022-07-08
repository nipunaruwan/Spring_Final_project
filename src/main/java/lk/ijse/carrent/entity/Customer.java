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
public class Customer {
    @Id
    String cusID;
    String driverID;
    String name;
    String Address;
    String IDcard;
    String drivinglicence;
    int contactno;
}
