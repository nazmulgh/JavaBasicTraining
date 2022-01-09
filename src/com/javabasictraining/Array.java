package com.javabasictraining;

public class Array {

    public static void main(String[] args) {

        int[] number = new int[100];
        number[0] = 5;
        number[1] = 2;
        number[2] = 10;
        number[3] = 20;
        number[4] = 3;
        number[99] = 30;
        System.out.println(number[2]);

        //that is 1 way of array where you mentioned fixed length.
        String[] names = new String[5];
        names[0] = "Nazmul";
        names[1] = "Mahmuda";
        names[2] = "Shaad";
        names[3] = "Nashwaa";
        names[4] = "Maarib";
        System.out.println(names[3]);

        System.out.println("--------------");

        //That is another array where no fixed length.
        String[] name = {"Nazmul", "Mahmuda", "Shaad", "Nashwaa", "Maarib"};
        System.out.println(name[4]);

        int[] age = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(age[3]);


    }


}


//        int[] number = new int[100];
//        number[0] = 5;
//        number[1] = 2;
//        number[2] = 10;
//        number[3] = 20;
//        number[4] = 3;
//        number[99] = 30;
//
//        String[] names = new String[5];
//        names[0] = "Nazmul";
//        names[1] = "Mahmuda";
//        names[2] = "Shaad";
//        names[3] = "Nashwaa";
//        names[4] = "Maarib";
//
//        String[] name = {"Nazmul", "Mahmuda", "Shaad", "Nashwaa", "Maarib"};
//
//        System.out.println(number[2]);
//        System.out.println(names[3]);
//        System.out.println("--------------");
//        System.out.println(name[4]);

