import java.util.*;

public class wrapperLab {

  public static void main(String[] args) {
    Vector myVector = new Vector();
    Integer nextInteger;
    int number;

  for (int i = 0; i < args.length; i++)
    try{
      number = Integer.parseInt(args[i]);
      System.out.println("Converter method says integer OK - " + number);
      myVector.add(new Integer(number));
    } catch (NumberFormatException e) {
      System.out.println("Catch block says the argument \"" + args[i] + "\" is ignored because " + args[i]);
    }

  System.out.println("\nVector contents are:");
  for (int j = 0; j < myVector.size(); j++) {
    System.out.println("Item " + j + " is " + myVector.elementAt(j));
  }

  }
}


