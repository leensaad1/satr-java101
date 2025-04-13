//satr: JAVA101 project BMI
import java.util.Scanner; //ava.util.*

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("\nHello Welcome To The BMI Calculator ");

        System.out.print("\nPlease Enter Your Height: ");
        double height = input.nextDouble();
        //float height = input.nextFloat();

        System.out.print("\nPlease Enter Your Weight: ");
        double weight = input.nextDouble();
        //float weight = input.nextFloat();

        double bmi = weight / (height*height);
        System.out.printf("\nYour BMI Is %.2f" , bmi );
        System.out.print(", And Based On The Calculated BMI You Have ");

        if (bmi < 18.5)
            System.out.println("(Underweight) \n");
        else if (bmi >= 18.5 && bmi <= 24.9)
            System.out.println("(Normal Weight) \n");
        else if (bmi >= 25 && bmi <= 29.9)
            System.out.println("(Overweight) \n");
        else if (bmi >= 30)
            System.out.println("(Obese) \n");
    }
}
