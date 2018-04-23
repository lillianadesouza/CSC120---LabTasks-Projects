import java.util.Scanner;
public class taxIRS {
  private static Scanner keyboard  = new Scanner(System.in);
//-------------------------------------------
  public static void main(String[] args) {
    double amount;
    double income = 0;
    double deduction = 0;
    double taxableInc;
    char taxGroup;
    double taxPercent;
    double taxOwed;
    
    do {
      System.out.print("Enter next amount : ");
      amount = keyboard.nextDouble();
      if (amount > 0) {
        income = income + amount;
      }
      if (amount < 0) {
        deduction = deduction + Math.abs(amount);
      }  
    } while (amount != 0);

    System.out.println("");

    taxableInc = computeTaxInc(income, deduction);
    taxGroup = computeGroup(taxableInc);
    taxPercent = computePercent(taxGroup);
    taxOwed = taxPercent * taxableInc;

    System.out.println("Income         = " + income);
    System.out.println("Deductions     = " + deduction);
    System.out.println("Taxable income = " + taxableInc);
    System.out.println("Tax group      = " + taxGroup);
    System.out.println("Tax owed       = " + taxOwed);
  }
//-------------------------------------------
  private static double computeTaxInc (double totalInc, double  totalDed) {
    double taxInc;
    if (totalInc >= totalDed) {
      taxInc = totalInc - totalDed;
    }
    else {
      taxInc = 0.0;
    }
    return (taxInc);
  }
//-------------------------------------------
  private static char computeGroup (double annual) {
    char letter;
    if (annual >= 500000.0) {
      letter = 'S'; 
    }
    else if (annual >= 200000.0) {
      letter = 'Q';
    }
    else if (annual >= 100000.0) {
      letter = 'M';
    }
    else if (annual >= 50000.0) {
      letter = 'A';
    }
    else if (annual >= 20000.0) {
      letter = 'R';
    }
    else {
      letter = 'P';
    }
    return (letter);
  }
//-------------------------------------------
  private static double computePercent (char group) {
     double percent = 0.0;
     switch (group) {
       case 'S':
         percent = .25;
         break;
       case 'Q':
         percent = .25;
         break;
       case 'M':
         percent = .10;
         break;
       case 'A':
         percent = .03;
         break;
       case 'R':
         percent = .03;
         break;
       case 'P':
         percent = 0.0;
         break;
       default:
         System.out.println("Error!");
         break;
     }
     return (percent);
  }
}
    
