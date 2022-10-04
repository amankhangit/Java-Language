package com.learnjava;
import java.util.Scanner;
public class simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal = ");
        float p = input.nextInt();
        System.out.print("Enter Time = ");
        float t = input.nextInt();
        System.out.print("Enter Rate = ");
        float r = input.nextInt();
        float si = (p*t*r)/100;
        System.out.println("Simple Interest = " + si);
    }
}