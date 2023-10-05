import java.util.Scanner;
public class Unit1Project {
  public static void main(String[]args) {

    Scanner scan = new Scanner(System.in);
    
    try {

        System.out.println("Bill:");
        double Bill = scan.nextDouble();
        
        System.out.println("Number of people:");
        int NumberOfPeople = scan.nextInt();
        
        System.out.println("Tip:");
        double Tip = scan.nextDouble();

        double totalTip = Bill * (Tip/100);
        double totalBill = (Bill + totalTip);
        double tipPerPerson = totalTip/NumberOfPeople;
        double totalPerPerson =  totalBill/NumberOfPeople;

        totalBill = (double)(Math.round(totalBill * 100))/100;
        totalTip = (double)(Math.round(totalTip*100))/100;
        tipPerPerson = (double)(Math.round(tipPerPerson *100))/100;
        totalPerPerson = (double)(Math.round(totalPerPerson *100))/100;
        
      
        System.out.println("The total Bill is $" + totalBill);
        System.out.println("The tip per person is $" + tipPerPerson);
        System.out.println("The total tip amount is $" + totalTip);
        System.out.println("The total per person is $" + totalPerPerson);
        
    }
    finally {
        scan.close();
    }
  }
}