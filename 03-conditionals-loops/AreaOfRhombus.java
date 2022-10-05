package com.learnjava;
import java.util.Scanner;
public class AreaOfRhombus {
    public static void main(String[] args) {
        float d1, d2, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the first diagonal: ");
        d1 = input.nextFloat();
        System.out.print("Enter the length of the second diagonal: ");
        d2 = input.nextFloat();
        area = (d1*d2)/2;
        System.out.println("Area Of Rhombus is: "+area);
    }
}