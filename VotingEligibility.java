imo
public class VotingEligibility {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
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


