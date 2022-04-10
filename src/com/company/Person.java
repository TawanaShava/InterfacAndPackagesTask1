package com.company;

import java.util.Scanner;

public class Person {


        Scanner sr = new Scanner(System.in);
        String surnameShava56415 , firstNameTawana56415, street56415 , city56415;
        int zipCode56415;

        void Initialize(){
            System.out.println("Please enter your Name: ");
            firstNameTawana56415 = sr.nextLine();
            System.out.println("Please enter your Surname: ");
            surnameShava56415 = sr.nextLine();
            System.out.println("Please enter your Street name: ");
            street56415 = sr.nextLine();
            System.out.println("Please enter your City: ");
            city56415 = sr.nextLine();
            System.out.println("Please enter your Zip Code: ");
            zipCode56415 = sr.nextInt();
        }

        void printData(){
            System.out.println("Name: "+ firstNameTawana56415);
            System.out.println("Surname: "+ surnameShava56415);
            System.out.println("Street Name: "+ street56415);
            System.out.println("City: "+ city56415);
            System.out.println("Zip Code: "+ zipCode56415);
        }

    }


    class Staff extends com.company.Person {
        String education , Position;
        void Initialize1(){
            Initialize();
            System.out.println("Enter your Education: ");
            education = sr.nextLine();
            System.out.println("Enter your Position");
            Position = sr.nextLine();
        }

        void Print1(){
            printData();
            System.out.println("Education: " + education);
            System.out.println("Position: "+ Position);
        }

    }

class Main {
    public static void main(String[] args) {
        Staff employee = new Staff();
        employee.Initialize1();
        employee.Print1();
    }
}
