import sun.util.resources.LocaleData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        final ZonedDateTime input = ZonedDateTime.now();
//        System.out.println(input);
//        final ZonedDateTime startOfLastWeek = input.minusWeeks(1).with(DayOfWeek.MONDAY);
//        System.out.println(startOfLastWeek);
//        final ZonedDateTime endOfLastWeek = startOfLastWeek.plusDays(6);
//        System.out.println(endOfLastWeek);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("\nNext Friday: "+dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println("Previous Friday: "+dt.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY))+"\n");
    }
}
