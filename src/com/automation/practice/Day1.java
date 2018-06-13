package com.automation.practice;

public class Day1 {
    public static void main(String[] args) {
//        int number = 34;
//        isOdd(number);
//
//        int number1 = 33;
//        isOdd(number1);
//        isLeapYear(-16);
        System.out.println(getSeason(5));


    }
    public static String getSeason(int month){
        String season;
        switch (month) {
        case 12: case 1: case 2:
            season = "winter";
            break;
        case 3: case 4: case 5:
            season = "spring";
            break;
        case 6: case 7: case 8:
            season = "summer";
            break;
        case 9: case 10: case 11:
            season = "autumn";
            break;
        default: season = "is not a valid month";}

        return season;
    }

    public static void isLeapYear(int year){
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println("Year is leap: " + year);
                else
                    System.out.println("Year is not leap: " + year);
            }
            else
                System.out.println("Year is leap: " + year);
        }
        else
            System.out.println("Year is not leap: " + year);
    }

    public static void isOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even: " + number);
        }
        else {
            System.out.println("The number is odd: " + number);
        }
    }
}
