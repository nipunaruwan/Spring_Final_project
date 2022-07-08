package lk.ijse.carrent.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Employeedao {
    String EID;
    String Ename;
    String Email;
    String password;
    String Username;
    String Jobtype;
    int Contact;
}
