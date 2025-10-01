package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;
import java.util.TimeZone;

public class Exp1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date); // Fri Sep 26 10:15:21 IST 2025

        LocalDate today = LocalDate.now();
        System.out.println(today); // YYYY-MM-DD

        LocalDate dob = LocalDate.of(2003, 12, 01);
        System.out.println(dob);

        LocalDateTime dtime = LocalDateTime.now();
        System.out.println(dtime);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        String frmt = today.format(format);
        System.out.println(frmt);

        LocalDate nexttw = today.plusDays(3);
        System.out.println(nexttw);
        // System.out.println(today.);

        System.out.println(dtime.getMonth());  // September
        System.out.println(dtime.getDayOfMonth()); //26  -> today date 26/09/2025

        ZonedDateTime ztime = ZonedDateTime.now();
        System.out.println(ztime);

        // System.out.println(ZoneId.of("Canada/Ottawa"));
        System.out.println(ztime.withZoneSameInstant(ZoneId.of("Asia/Kolkata")));

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for(String zoneId : zoneIds){
            System.out.println(zoneId);
        }

    }
    
}
