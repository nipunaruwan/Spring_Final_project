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
public class Payment {
    @Id
    String paymentID;
   /* @OneToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH })
            @JoinColumn(name = "BID",referencedColumnName = "BookingID",nullable = false)*/
    String BookingID;
    String time;
    String date;
    double Discount;
}
