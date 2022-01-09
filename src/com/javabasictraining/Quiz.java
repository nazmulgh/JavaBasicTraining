package com.javabasictraining;

public class Quiz {

    public static void main(String[] args) {

        String[] name = {"Nazmul", "Mahmuda", "Shaad", "Nashwaa", "Maarib"};
        for (String nam : name) {
            if (nam == "Nazmul") {
                break;
            }

            System.out.println(nam);
        }


        int[] sizes = {2, 5, 8, 9};
        for (int size : sizes) {
            if (size > 8) {
                break;
            }
            System.out.println(size);
        }

    }


}


//    int[] sizes = {4, 18, 5, 20};
//
//        for (int size : sizes) {
//                if (size > 16) {
//                break;
//                }
//
//                System.out.println("Size: " + size + ",");
//                }
