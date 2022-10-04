package com.learnjava;
        import java.util.Scanner;
        public class evenodd {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the number: ");
                int a = input.nextInt();
                if (a % 2 == 0){
                    System.out.println("Number is even");
                } else{
                    System.out.println("Number is odd");
                }
            }
}