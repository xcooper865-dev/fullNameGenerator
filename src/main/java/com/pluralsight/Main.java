package com.pluralsight;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

Scanner scanner = new Scanner (System.in);
       System.out.println("first name goes here ") ;

String firstname = scanner.nextLine();

System.out.println("middle name goes here ");
            String middlename = scanner.nextLine();

            System.out.println("last name goes here");
            String lastname = scanner.nextLine();



String fullname = firstname+" "+middlename+" "+lastname;;

System.out.println(fullname);
        }}
