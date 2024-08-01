package com.list;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Date {
    public static void main(String[] args) {
        LocalDate localDate;
        localDate = LocalDate.now();
        System.out.println("today date is:" + localDate);

        Month month;
        month = localDate.getMonth();
        int year;
        year = localDate.getYear();
        int day;
        day = localDate.getDayOfMonth();
        System.out.println("month and year and day extracted from date");
        System.out.println(month + " " + year + " " + day);

        LocalTime localTime;
        localTime = LocalTime.now();
        System.out.println("current time today is:" + localTime);
        int min = localTime.getMinute();
        int hour = localTime.getHour();
        int sec = localTime.getSecond();
        System.out.println("hours:minutes:seconds");
        System.out.printf("%d:%d:%d", hour, min, sec);
        System.out.println("hours:" + hour + " " + "minutes:" + min + " " + "seconds:" + sec);

        LocalDateTime dti = LocalDateTime.now();
        System.out.println("LocalDate and Time :" + dti);
        Date d = new Date();
        LocalDateTime dt2 = LocalDateTime.of(2911, 5, 05, 12, 45);
        System.out.println("Custom Date is:" + dt2);

    }
}

