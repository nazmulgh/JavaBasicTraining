package com.javabasictraining;

public class Calculate {

    int number1 = 50;
    int number2 = 10;

    public void addition() {
        System.out.println("This is void Method=" + (number1 + number2));
    }

    public int addition1() {
        return number1 + number2;
    }

    public int subtraction() {
        return number1 - number2;
    }

    public int multiply() {
        return number1 * number2;
    }

    public int division() {
        return number1 / number2;
    }

    public void nannarBiryani(){
        System.out.println("Nannar Biryani very tasty");
    }

    public static void main(String[] args) {

        Calculate calculate = new Calculate();
        calculate.addition();
        System.out.println("This is Return Method=" + calculate.addition1());
        System.out.println("This is Subtraction Method=" + calculate.subtraction());
        System.out.println("This is Multiply Method=" + calculate.multiply());
        System.out.println("This is Division Method=" + calculate.division());
        calculate.nannarBiryani();


    }


}