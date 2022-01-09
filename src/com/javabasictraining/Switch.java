package com.javabasictraining;

public class Switch {

    public static void main(String[] args) {

        String name = "Maarib";

        switch (name) {
            case "Nazmul":
                System.out.println("Nazmul learning Java");
                break;
            case "Nashwaa":
                System.out.println("Nashwaa learning Python");
                break;
            case "Maarib":
                System.out.println("Maarib learning Javascript");
                break;
            case "Shaad":
                System.out.println("Shaad learning C++");
                break;
            default:
                System.out.println("No one Learning any Programming Language");


        }


    }


}


/*Note:
        switch (condition/variables name) {
        case input:
        Programming coding
        break;
        }
         */

//    String name = "";


//    String month = "March";
//
//        switch (month) {
//                case "January":
//                System.out.println("Its Cold Winter Season");
//                break;
//                case "February":
//                System.out.println("Its Cold Mid Winter Season");
//                break;
//                case "March":
//                System.out.println("Its Cold Ending Winter Season");
//                break;
//                case "April":
//                System.out.println("Its Starting Spring Season");
//                break;
//                default:
//                System.out.println("No Season");
