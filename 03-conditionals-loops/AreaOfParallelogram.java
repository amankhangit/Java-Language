package com.learnjava;
import java.util.Scanner;
public class AreaOfParallelogram {
    public static void main(String[] args) {
        int b, h, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the Parallelogram: ");
        b = input.nextInt();
        System.out.print("Enter the height of the Parallelogram: ");
        h = input.nextInt();
        area = h*b;
        System.out.println("Area Of Parallelogram is: "+area);
    }
}