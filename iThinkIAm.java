import java.util.Scanner;
public class iThinkIAm {
  private static Scanner keyboard  = new Scanner(System.in);

  public static void main(String[] args) {
    String sentence = new String();
    String allQualities = "";
    
    System.out.println("Please enter sentences, . to end.");
    sentence = keyboard.nextLine();
    
    while (!sentence.equals(".")) {
      if (sentence.startsWith("I am ")) {
        String quality = new String();
        quality = sentence.substring(5,(sentence.length()));
        allQualities = allQualities + quality + ", ";
      }
      sentence = keyboard.nextLine();
    }
    
    System.out.println("The qualities are " + allQualities);
  }
}
