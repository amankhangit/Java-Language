package com.learnjava;
import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0, b=1;
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt();
        for (int i = 0; i<=n; i++){
            System.out.print(a+", ");
            int c = a+b;
            a=b;
            b=c;
        }
    }
}