package com.learnjava;
import java.util.Scanner;
public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the cube: ");
        a = input.nextInt();
        int tsa = 6*a*a;
        System.out.println("Total Surface Area Of Cube is: "+tsa);
    }
}