package com.learnjava;
import java.util.Scanner;
public class twonumbersoperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        int a = input.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = input.nextInt();
        System.out.print("Enter operator: ");
        char operator = input.next().charAt(0);
        if (operator == '+'){
            System.out.println(a+b);
        }else if (operator == '-'){
            System.out.println(a-b);
        }else if (operator == '*'){
            System.out.println(a*b);
        }else if(operator == '/'){
            if (b == 0){
                System.out.println("Invalid operation!!");
            }else{
                System.out.println(a/b);
            }
        }else{
            System.out.println("Invalid Operator!!");
        }
    }
}