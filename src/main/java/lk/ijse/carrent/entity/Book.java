package lk.ijse.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Book {
    @Id

    String BookingID;
    String CusID;
    String DriverID;
    String pickuplocation;
    String pickupDate;
    String ReturnDate;
    String ReseveDate;
}
