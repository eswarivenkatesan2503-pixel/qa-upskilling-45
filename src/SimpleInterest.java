import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
       Scanner Sc = new Scanner(System.in);

       System.out.println(" Enter the principle amount:");
       double principle = Sc.nextDouble();

       System.out.println("Enter the Rate of Interest");
        double rate = Sc.nextDouble();

        System.out.println("Enter the time limit");
        double number = Sc.nextDouble();

        double SI = (principle * rate * number) / 100;
        {
            System.out.println("Simple Interest:" + SI);
        }
    }
}