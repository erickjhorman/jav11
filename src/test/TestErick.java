package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TestErick {
    public static void main(String[] args) throws ParseException {

        String sDate= "2021-12-19T05:00:00";
        SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date1=formatter1.parse(sDate);
        System.out.println(date1);

        Date date = new Date();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(date));

        //adding a time zone to the date
        Date start = Date.from(LocalDateTime.parse("2021-12-10T00:00:00")
                .atZone(ZoneId.of("Europe/Berlin"))
                .toInstant()
        );

        Calendar nowAsiaSingapore = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        nowAsiaSingapore.setTime(date1);

        System.out.println("start date " + start);
        TimeZone.getDefault();
        System.out.println(LocalDateTime.parse("2021-12-10T00:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")));

        //Add hours using Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date1);
        calendar.add(Calendar.HOUR_OF_DAY, 5);
        System.out.println(calendar.getTime());
        formatDate(date1);

        String sDate1= "2021-12-21T19:25:00";
        SimpleDateFormat formatter2=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date2=formatter2.parse(sDate1);
        System.out.println(date2);
        formatDate(date2);

        //another way to add timezone to a date
        SimpleDateFormat myDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        myDate.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date newDate = myDate.parse("2010-05-23T09:01:02");

    }

    private static  Date formatDate(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if(calendar.get(Calendar.HOUR) == 0){
            System.out.println("here");
            calendar.add(Calendar.HOUR_OF_DAY, 5);
            return calendar.getTime();
        }
        return date;
    }
}
