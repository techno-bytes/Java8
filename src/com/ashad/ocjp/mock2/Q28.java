package com.ashad.ocjp.mock2;


import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Q28 {
    public static void main(String [] args) {
        LocalDateTime date = LocalDateTime.of(2012, 1, 11, 12,34,34);
        Period period = Period.ofMonths(2);
        DateFormat dateFormat = DateFormat.getDateInstance();
        dateFormat.format("mm-dd-yy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm-dd-yy");
        System.out.print(formatter.format(date.minus(period)));
    }
}