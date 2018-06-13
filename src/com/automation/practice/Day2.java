package com.automation.practice;

public class Day2 {

    public static void main(String[] args) {
        int[] marks = {40, 50, 45, 78, 92};
        marks[3] = 81;
        System.out.println(getNumberOfPastStudents(marks));


//        System.out.println(getSum(-100, 0));
    }

    public static int getNumberOfPastStudents(int[] array) {
        int i = 0;
        int countPositiveMarks = 0;
        for (; i < array.length; i++) {
            if(array[i] >= 50){
                countPositiveMarks++;
            }
        }
        return countPositiveMarks;
    }


//    public static int getSum(int first, int last){
//        int sum = 0;
//        for (int i = first; i <= last; i++) {
//            sum += i;
//        }
//        return sum;
//    }
}
