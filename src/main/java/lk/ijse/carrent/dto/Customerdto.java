package lk.ijse.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Customerdto {
    String cusID;
    String driverID;
    String name;
    String Address;
    String IDcard;
    String drivinglicence;
    int contactno;
}
