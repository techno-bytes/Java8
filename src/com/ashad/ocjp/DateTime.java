package com.ashad.ocjp;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2010, Month.OCTOBER, 23);
        LocalTime localTime = LocalTime.of(12, 34);
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime );

        Period period = Period.ofWeeks(2);
        LocalDate minus = localDate.minus(period);
        System.out.println("localDat= "+minus.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("localTime= "+localTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("localDateTime= "+localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("localDateTime= "+localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));


    }
}
