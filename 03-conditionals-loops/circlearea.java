package com.learnjava;
import java.util.Scanner;
public class circlearea {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = input.nextInt();
        double area = (pi*r*r);
        System.out.println("Area of circle is: "+area);
    }
}