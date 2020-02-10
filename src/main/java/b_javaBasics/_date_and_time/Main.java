package b_javaBasics._date_and_time;

public class Main {

    public static void main(String[] args) {
// todo theory
        //1 milisekunda 10 do -3 sekundy 1/1000 s
        //1 mikrosekunda 10 do -6 sekundy 1/1000 000 s
        //1 nanosekunda 10 do -9 sekundy 1/1000 000 000 s

//  rozwiazania zadań: https://pastebin.com/6vzZPCdz

//TODO podstawy z zakresu czas i dat

        /*        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println(dateTime1);
        LocalDate date1 = dateTime1.toLocalDate();
        System.out.println(date1);
        LocalDateTime dateTime2 = date1.atStartOfDay();
        System.out.println(dateTime2);
        LocalTime time1 = LocalTime.now();
        System.out.println(date1.atTime(time1));

        System.out.println( DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now()));
        DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDateTime.now());
        DateTimeFormatter.ISO_DATE.format(LocalDateTime.now());
        DateTimeFormatter.BASIC_ISO_DATE.format(LocalDateTime.now());
        DateTimeFormatter.ISO_WEEK_DATE.format(LocalDateTime.now());
        DateTimeFormatter.RFC_1123_DATE_TIME.format(LocalDateTime.now().atOffset(ZoneOffset.UTC));

        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        System.out.println(LocalDateTime.ofEpochSecond(1121311321, 12121, ZoneOffset.ofHours(1)));*/


// TODO avalible zoneIds and counter

/*        Set<String> avalibleZoneIds = ZoneId.getAvailableZoneIds();
        Iterator<String> setIterator = avalibleZoneIds.iterator();
        int counter = 0;
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
            counter++;
        }
        System.out.println(counter);
    }*/
    }
}
