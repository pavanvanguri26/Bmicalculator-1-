
import java.util.Scanner;

public class bmicalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the BMI Calculator!");
        
        
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        
        
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        
        
        double bmi = weight / (height * height);
        
        
        System.out.printf("Your Body Mass Index (BMI) is: %.2f\n", bmi);
        
        
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
        
        scanner.close();
    }
}



