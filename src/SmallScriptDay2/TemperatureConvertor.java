package SmallScriptDay2;

import java.util.Scanner;
public class TemperatureConvertor {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System .out.println(" Enter the Celsius:");
        double celsius = Sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        {
            System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        }
    }

}
