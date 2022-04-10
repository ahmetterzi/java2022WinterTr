package day32_dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat= LocalDateTime.now();
        System.out.println(tarihSaat);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(formatter.format(tarihSaat));

        DateTimeFormatter formatterSaat=DateTimeFormatter.ofPattern("HH : mm a");
        System.out.println(formatterSaat.format(tarihSaat));
    }
}
