package Assignment_26;

import java.util.Scanner;

public class Negation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num=sc.nextInt();
        if(!(num>=10 && num<=20)){
            System.out.println("Number is not between 10 to 20");
        }
        else{
            System.out.println("Number is between 10 to 20");
        }
    }

}
/*
Enter number :
22
Number is not between 10 to 20

Enter number :
17
Number is between 10 to 20


 */