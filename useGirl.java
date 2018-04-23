import java.util.Scanner;

public class useGirl {

  private static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {

    Girl myGirl;
    String name;
    int carats;
    double worth;

    System.out.print("Enter name of the girl : ");
    name = keyboard.nextLine();
    myGirl = new Girl(name);
    System.out.println(name + " has no best friend");
        

    do { 
      System.out.print("Enter carats and value     : ");
      carats = keyboard.nextInt();
      worth = keyboard.nextDouble();
      keyboard.nextLine();

      Diamond newDiamond = new Diamond(carats, worth);
      myGirl.createDiamond(newDiamond);
      System.out.println(myGirl);
    } while (carats != 0);
  }
}
