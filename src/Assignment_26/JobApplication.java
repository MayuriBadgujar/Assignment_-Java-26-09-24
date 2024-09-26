package Assignment_26;

import java.util.Scanner;

public class JobApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of candidate :");
        String name=sc.next();
        System.out.println("Enter Qualification : ");
        String quali=sc.next();
        System.out.println("Enter Experience : ");
        int exp=sc.nextInt();
        System.out.println("Enter yes if you have non criminal records otherwise no :");
        boolean criminal=sc.nextBoolean();

//if((quali=="BA" ||quali=="BSc" ||quali=="BCom" ||quali=="BTech" ||quali=="BCA" ||quali=="BE" )  && (exp>1) && ){
        if(quali=="BA" ||quali=="BSc" ||quali=="BCom" ||quali=="BTech" ||quali=="BCA" ||quali=="BE" ){
            if(exp>1){
                //if(criminal==false){
                System.out.println("Congratulation!! You are eligible for job");
            }
            else{
                System.out.println("Sorry!! You are not eligible for given job role");
            }

        }
    }
// System.out.println("Congratulation!! You are eligible for job");

    //else{
    //System.out.println("Sorry!! You are not eligible for given job role");
//}


}
