package com.learnjava;
import java.util.Scanner;
public class printlargestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = input.nextInt();
        if (a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}