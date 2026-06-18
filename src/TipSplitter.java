import java.util.Scanner;

public class TipSplitter {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the Bill Amount");
        double billAmount = Sc.nextDouble();

        System.out.println("Enter the percentage of the tip");
        double tipPercentage= Sc.nextDouble();

        System.out.println("Enter the number of people to split the bill");
        int persons = Sc.nextInt();

        double  tipAmount =(billAmount * tipPercentage)/100;
        double totalBill = billAmount + tipAmount;
        double perPerson = totalBill/ persons;
        {
            System.out.println("Tip Amount:" + tipAmount);
            System.out.println("Total Bill Amount:" + totalBill);
            System.out.println("Amount per person:" + perPerson + " happy sharing");
            Sc.close();
        }



    }
}
