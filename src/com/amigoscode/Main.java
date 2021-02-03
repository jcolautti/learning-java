package com.amigoscode;


import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
         int a = 0;
         int b = 0;
         int c = 0;
         Scanner scanner = new Scanner(System.in);
         do {
             System.out.println("Ingrese la a:");
             a = scanner.nextInt();
             if (a == 0) {
                 System.out.println("a debe ser distinto de 0.");
             }
         } while (a == 0) ;

         do {
             System.out.println("Ingrese la b:");
             b = scanner.nextInt();
             System.out.println("Ingrese la c:");
             c = scanner.nextInt();
             if ((b * b - (4 * a * c)) < 0) {
                 System.out.println("La expresión (b*b-(4*a*c)) debe ser mayor o igual a 0. Reingrese los valores de b y c");
                 }
         } while ((b*b-(4*a*c)) < 0);
         System.out.println(">>" + (b*b-(4*a*c)));
         double x1 = (-b + Math.sqrt((b*b-(4*a*c))))/(2*a) ;
         double x2 = (-b - Math.sqrt((b*b-(4*a*c))))/(2*a) ;
         System.out.println("las raices son:" + x1 + " y " + x2);
     }

}

