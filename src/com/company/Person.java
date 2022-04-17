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


    class Staff extends com.company.Person implements Salary{
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


        @Override
        public void salaryToPayShava56415(int hoursShava56415, int RateShava56415) {

        }

        @Override
        public int salaryForOvertime(int extrahoursShava56415, int rateShava56415) {
            return Salary.super.salaryForOvertime(extrahoursShava56415, rateShava56415);
        }
    }

     interface Salary{
     void salaryToPayShava56415(int hoursShava56415, int RateShava56415);



    default int salaryForOvertime(int extrahoursShava56415, int rateShava56415){
        int salaryOverTime=extrahoursShava56415 * rateShava56415;
        return salaryOverTime;

    }

    static double bonusCheckShava56415( int yearsOfExpirience){
        double bonusShava56415=0;
        if (yearsOfExpirience>3) bonusShava56415=100;
        else bonusShava56415=0;
        return bonusShava56415;
    };


    }


class Main {
    public static void main(String[] args) {
        Staff employee = new Staff();
        employee.Initialize1();
        employee.Print1();
        employee.salaryToPayShava56415(5,9);
        Salary.bonusCheckShava56415(7);
    }
}

