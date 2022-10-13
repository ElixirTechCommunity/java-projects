package com.exercise1;
import java.util.*;

public class temprature_project {


        //Scanner class
        static Scanner sc = new Scanner(System.in);

        // For converting Celcius to Fahrenheit
        static double CtoF(double C){
            double F = (C * 9/5) + 32;
            return F;
        }
        // For converting Celcius to Kelvin
          static double CtoK(double C){
            double K = C + 273.15;
            return K;
        }

        // For converting Fahrenheit to Celcius
         static double FtoC(double F){
            double C = (F - 32) * 5/9;
            return C;
        }
        // For converting Fahrenheit to Kelvin
          static double FtoK(double F){
            double K = (F - 32) * 5/9 + 273.15;
            return K;
        }

        // for converting Kelvin to Celcius
         static double KtoC(double K){
            double C = K - 273.15;
            return C;
        }
        //For Converting Kelvin to Fahrenheit
        static double KtoF(double K){
            double F = (K - 273.15) * 9/5 + 32;
            return 0;
        }

        //  To read the value of temperature given by the user
          static double input(String word){
            System.out.println("Enter "+word+" value:");
            double val = sc.nextDouble();
            return val;
        }

        //  To print converted value of temperature
        static void output(double val, String word){
            System.out.printf("%s value: %.2f",word,val);
        }

        // Main Method
        public static void main(String args[]){
            System.out.println("1. Celcius to Fahrenheit\n2. Celcius to Kelvin\n"+
                    "3. Fahrenheit to Celcius\n4. Fahrenheit to Kelvin\n"+
                    "5. Kelvin to Celcius\n6. Kelvin to Fahrenheit\n7. Exit");
            do{
                System.out.println("\nEnter Choice: ");
                int ch = sc.nextInt();
                double num = 0;
                switch(ch){
                    case 1: num = input("Celcius");
                        output(CtoF(num), "Fahrenheit");
                        break;
                    case 2: num = input("Celcius");
                        output(CtoK(num), "Kelvin");
                        break;
                    case 3: num = input("Fahrenheit");
                        output(FtoC(num), "Celcius");

                    case 4: num = input("Fahrenheit");
                        output(FtoC(num), "Kelvin");
                        break;
                    case 5: num = input("Kelvin");
                        output(KtoC(num), "Celcius");
                        break;
                    case 6: num = input("Kelvin");
                          output(KtoF(num), "Fahrenheit");
                        break;
                    case 7: System.exit(0);
                        break;

                }
            }while(true);
        }
    }



