package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.printf("Input number 1 : ");
        int number1 = scan.nextInt();
        System.out.printf("Input number 2 : ");
        int number2 = scan.nextInt();
        System.out.printf("number1 + number2 = %d\n",number1+number2);
        System.out.printf("number1 - number2 = %d\n",number1-number2);
        System.out.printf("number1 x number2 = %d\n",number1*number2);
        System.out.printf("number1 / number2 = %.2f\n",(float)number1/number2);
    }
}
