package com.automation.practice;

public class Homework1 {

    public static void main(String[] args) {
//        int numberRoman = 11;
//        fromRomanToArab(numberRoman);
//
        int totalPoints = 90;
      points(totalPoints);

//        System.out.println(getDayName(2, 45));
    }

    public static String getDayName(int weekDay, int days) {
        String dayOfWeek = "";
        int dayOrder = days % 7 + weekDay;

        switch (dayOrder) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 0:
                dayOfWeek = "Sunday";
                break;
        }

        return dayOfWeek;


    }


        public static void points(int score) {
        int mark;
        if (score >= 0 && score < 46)
            mark = 4;
        System.out.println("You receive score 5");
        if (score > 45 && score < 56) {
            System.out.println("You receive score 5");
        }
        if (score > 55 && score < 66){
            System.out.println("You receive score 6");
        }
        if (score > 65 && score < 76){
            System.out.println("You receive score 7");
        }
        if (score > 75 && score < 86){
            System.out.println("You receive score 8");
        }
        if (score > 85 && score < 96)
            System.out.println("You receive note 9");
        if (score > 95 && score <= 100){
            System.out.println("You receive note 10");
        }
        if (score < 0 || score > 100){
            System.out.println("The number is invalid");
        }

        }
//    public static String fromRomanToArab(int numberRoman) {
//        String result;
//        String roman1 = "I";
//        String roman2 = "II";
//        String roman3 = "III";
//        String roman5 = "V";
//        String roman10 = "X";
//        switch (numberRoman) {
//            case 1:
//                result = roman1;
//                break;
//            case 2:
//                System.out.print(roman2);
//                break;
//            case 3:
//                System.out.print(roman3);
//                break;
//            case 4:
//                System.out.print(roman1 + roman5);
//                break;
//            case 5:
//                System.out.print(roman5);
//                break;
//            case 7:
//                System.out.print(roman5 + roman2);
//                break;
//            case 8:
//                System.out.print(roman5 + roman3);
//                break;
//            case 9:
//                System.out.print(roman1 + roman10);
//                break;
//            case 10:
//                System.out.print(roman10);
//                break;
//            default:
//                System.out.println("Choose another number");
//        }
//
//        return result;
//    }
}






