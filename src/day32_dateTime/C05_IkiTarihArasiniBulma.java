package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {

        LocalDate bugun = LocalDate.now();
        LocalDate dogumGunu = LocalDate.of(1993, 02, 27);

        System.out.println(Period.between(dogumGunu,bugun));

        System.out.println(Period.between(dogumGunu,bugun).getYears());

        // FIXME: 31.03.2022 
    }
}
