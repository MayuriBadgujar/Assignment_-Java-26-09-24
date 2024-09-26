
package Assignment_26;
import java.util.*;

public class VotingEligibility {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of person : ");
    int age=sc.nextInt();
        System.out.println("Enter your city : ");
    String name=sc.next();
    String citizen="Indian";
        if(age>18 && citizen.equals(name)){
        System.out.println("Person can vote");
    }
        else{
        System.out.println("You cant vote!");
    }
}

}
/*
Enter the age of person :
23
Enter your city :
Indian
Person can vote


 */