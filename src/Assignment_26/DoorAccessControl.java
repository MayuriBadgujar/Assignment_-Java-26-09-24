package Assignment_26;

import java.util.Scanner;

public class DoorAccessControl {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println(" Please enter Person id number : ");
        int personId=sc.nextInt();
        System.out.println(" Please enter  access card number : ");
        int cardNo=sc.nextInt();
        System.out.println("Enter admin name : ");
        String name=sc.next();

        int id =240027;
        int card=202409;
        String admin="Mayu";

        if(((id==personId) &&  (card==cardNo)) || (name.equals("admin"))) {
            System.out.println("Welcome! "+name);
        }
        else {
            System.out.println("Please check your details!");
        }
    }



}
/*
 Please enter Person id number :
240027
 Please enter  access card number :
202409
Enter admin name :
Mayu
Welcome! Mayu

Please enter Person id number :
240027
 Please enter  access card number :
12345
Enter admin name :
Mayu
Please check your details!

 */