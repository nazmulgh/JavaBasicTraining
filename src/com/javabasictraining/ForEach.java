package com.javabasictraining;

public class ForEach {

    public static void main(String[] args) {

        String[] name = {"Nazmul", "Mahmuda", "Shaad", "Nashwaa", "Maarib"};
        for (String name1 : name){
            System.out.println(name1);
        }

        int[] age = {10, 20, 30, 40, 50, 60, 70};
        for (int age1 : age){
            System.out.println(age1);
        }

    }

}

//        int[] age = {10, 20, 30, 40, 50, 60, 70};
//        System.out.println(age[0]);
//        System.out.println(age[1]);
//        System.out.println(age[2]);
//        System.out.println(age[3]);
//        System.out.println(age[4]);
//        System.out.println(age[5]);
//        System.out.println(age[6]);