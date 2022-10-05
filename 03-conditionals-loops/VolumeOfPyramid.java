package com.learnjava;
import java.util.Scanner;
public class VolumeOfPyramid {
    public static void main(String[] args) {
        float l, b, h;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the pyramid base: ");
        l = input.nextFloat();
        System.out.print("Enter the breadth of the pyramid base: ");
        b = input.nextFloat();
        System.out.print("Enter the height of the pyramid: ");
        h = input.nextFloat();
        float volume = (l*b*h)/3;
        System.out.println("Volume Of Pyramid is: "+volume);
    }
}