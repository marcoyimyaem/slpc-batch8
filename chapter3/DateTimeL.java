package chapter3;
import java.time.*;
public class DateTimeL {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate XmassBonus = LocalDate.of(2023, 11, 20); 
        LocalTime midNight =  LocalTime.of(12, 0, 0); 
        LocalDateTime XmassDateTimeBonus = LocalDateTime.of(2023, 12, 14, 8, 30);
        //LocalDate plus/minus years,day,month

        System.out.println(XmassBonus.minusDays(2));
        
        //LocalTime plus/minus Hours, Minutes, Seconds,Nano
        System.out.println(midNight.plusHours(4));
        // LocalDateTime  plus/minus years,day,month & Hours, Minutes, Seconds,Nano
        System.out.println(XmassDateTimeBonus.plusHours(4).minusDays(2));
    }
}
