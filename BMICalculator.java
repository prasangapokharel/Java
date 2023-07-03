import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        
        //Store weight
        System.out.print("Enter your weight in kilogram: ");
        double weight= scanner.nextDouble();
        
        //Store height
        System.out.print("Enter a height in meters: ");
        double height= scanner.nextDouble();
        
        //store result in bmi
        double bmi = calculateBMI(weight, height);
           
        System.out.println("Your BMI is: " +bmi);
        scanner.close();
    }
    public static double calculateBMI(double weight, double height){
        return weight /(height*height);
    }
    
}
