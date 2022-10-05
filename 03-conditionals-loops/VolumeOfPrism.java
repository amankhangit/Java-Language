package com.learnjava;
import java.util.Scanner;
public class VolumeOfPrism {
    public static void main(String[] args) {
        int B, h;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the prism: ");
        h = input.nextInt();
        System.out.print("Enter the base area of the prism: ");
        B = input.nextInt();
        int volume = B*h;
        System.out.println("Volume Of Prism is: "+volume);
    }
}