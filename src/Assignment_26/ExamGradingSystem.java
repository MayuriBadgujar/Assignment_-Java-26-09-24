package Assignment_26;

import java.util.Scanner;

public class ExamGradingSystem {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  Subject1 marks :");
        int sub1=sc.nextInt();
        System.out.println("Enter  Subject2 marks :");
        int  sub2=sc.nextInt();
        System.out.println("Enter  Subject3 marks :");
        int sub3 =sc.nextInt();
        int sum=0;
        sum=sub1+sub2+sub3;
        int average=0;
        average=sum/3;

        if(average>=60 && sub1>40 && sub2>40 &&sub3>40) {
            System.out.println("Congratulation! You are pass.");
        }
        else {
            System.out.println("OOPs ! you are fail!");
        }

    }

}

/*
Enter  Subject1 marks :
80
Enter  Subject2 marks :
80
Enter  Subject3 marks :
80
Congratulation! You are pass.

Enter  Subject1 marks :
30
Enter  Subject2 marks :
90
Enter  Subject3 marks :
80
OOPs ! you are fail!

 */
