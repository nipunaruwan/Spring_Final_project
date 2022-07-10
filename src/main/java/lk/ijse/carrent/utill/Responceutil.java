package lk.ijse.carrent.utill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Responceutil {
    private int code;
    private String massenge;
    private Object data;

}
