package Assignment_26;

import java.util.Scanner;

public class ValidatingAgeandIncome {


        public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age of Person : ");
        int age=sc.nextInt();
        System.out.println("Enter Income of Person : ");
        int income=sc.nextInt();
        //String income=sc.next();
        if(age>=18 && age<60 && income>25000) {
            System.out.println("Person is eligible for loan");
        }
        else {
            System.out.println("Person is not eligible for loan");
        }
    }

    }

/*
Enter Age of Person :
20
Enter Income of Person :
26000
Person is eligible for loan


Enter Age of Person :
17
Enter Income of Person :
25000
Person is not eligible for loan

 */