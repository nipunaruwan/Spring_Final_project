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
public class Damage {
    @Id
    String DamegeID;
    String VID;
    String DVownname;
    String VDiscription;
    String Damagetype;
    int Dvcontact;
}
