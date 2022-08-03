package lk.ijse.carrent.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity

public class Book {

    @Id
    String BookingID;
   /* @OneToOne(cascade = {CascadeType.ALL})
            @JoinColumn(name = "PID",referencedColumnName = "paymentID")*/
    String PID;
    String CusID;
    String DriverID;
    String pickuplocation;
    String pickupDate;
    String ReturnDate;
    String ReseveDate;
}
