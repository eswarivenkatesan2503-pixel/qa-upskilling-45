package SmallScriptDay2;

import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter your weight ");
        double weight = Sc.nextDouble();

        System.out.println("Enter your Height");
        double height = Sc.nextDouble();

        double bmi = weight / (height * height);
        {

            System.out.println("Your BMI is:" + bmi +  "Stay healthy! ");
            Sc.close();
        }
    }
}
