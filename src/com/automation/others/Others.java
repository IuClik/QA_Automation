package com.automation.others;

public class Others {

    public static void main(String[] args) {

        int day = 34;
        getDayWeek(day);


    }

    public static String getMonth(int numberDays) {
        String month;
        switch (numberDays) {
            case 29:
            case 28:
                month = "February";
                break;

            case 31:
                month = "January, March, May, July, August, October, December";
                break;

            case 30:
                month = "April, June, September, November";
                break;

            default:
                month = "This can be any month, try again with 28, 29, 30, 31";

        }
        return month;

    }

    public static void getDayWeek(int dayWeek) {
        if (dayWeek == 1) {
            System.out.println("This is Monday");
        } else {
            System.out.println("This is not a valid number");
        }
        if (dayWeek != 1) {
            System.out.println("This is not Monday");
            if (dayWeek >= 8) {
                System.out.println("The week have only 7 days");


            }
        }
    }
}

