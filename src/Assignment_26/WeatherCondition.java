package Assignment_26;

import java.util.Scanner;

public class WeatherCondition {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temprature in °C");
    int temperature=sc.nextInt();
		System.out.println("Is Raining outside");
    boolean Raining=sc.nextBoolean();
		if(temperature<=20 && temperature>=30 && Raining==false||Raining==true)
    {
        System.out.println("Safe to go outside");
        System.out.println("it should not be raining outside");
    }
		else
    {
        System.out.println("it's not safe to go outside");
        System.out.println("it should be raining outside");
    }
}


}
