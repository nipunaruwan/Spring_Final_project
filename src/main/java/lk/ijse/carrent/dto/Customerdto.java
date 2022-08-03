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
    String name;
    String address;
    String iDcard;
    String drivinglicence;
    int contactno;
}
