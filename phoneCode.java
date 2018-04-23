import java.util.Scanner;
public class phoneCode {
  private static Scanner keyboard  = new Scanner(System.in);

  public static void main(String[] args) {
    int sevenNumber;
    String areaCode; 
    String phoneCode; 

    do {
      System.out.print("Please enter your 305 phone number: ");
      sevenNumber = keyboard.nextInt();
    } while (sevenNumber >= 9999999 || sevenNumber <= 1000000);
    
    areaCode = encode(305);
    phoneCode = encode(sevenNumber);

    System.out.println("The phone number " + sevenNumber + " can be encoded as " + areaCode + phoneCode);

  }
  private static String encode(int number) {
   char[] charCodes = {'0','1','A','D','G','J','M','P','T','W'};
   int[] charOptions = {1,1,3,3,3,3,3,4,3,4};
   char code; 
   String finalCode = "";
   int digit, randomNum, intCode;
   randomNum = 0;
  
   while ( number > 0) {
     digit = number % 10;
     randomNum = (int)(Math.floor(Math.random() * (charOptions[digit]))); 
     intCode = (int)charCodes[digit] + randomNum;
     code = (char)intCode;
     finalCode = finalCode + code; 
     number = number/10;
   }
   return (finalCode);
  }
}
