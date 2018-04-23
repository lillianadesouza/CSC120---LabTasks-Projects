import java.util.Scanner;
public class DiveTask {
  private static Scanner keyboard  = new Scanner(System.in);

  private static final double FEET_PER_ATM = 33.0;
  private static final double MAX_VAL = 1.4;
  private static final double CONTIN_VAL = 1.6;


  public static void main(String[] args) {

    int depth, percentO2;
    double amPressure, o2Pressure;
    char oGroup; 
    boolean maximal, contin;

    System.out.print("Enter depth and percentage O2   : "); 
    depth = keyboard.nextInt(); 
    percentO2 = keyboard.nextInt();

    amPressure = (depth / FEET_PER_ATM) + 1;
    System.out.println("");
    System.out.println("Ambient pressure                : " + amPressure);

    o2Pressure = (percentO2 / 100.0) * amPressure;
    System.out.println("O2 pressure                     : " + o2Pressure);

    oGroup = (char)((int)(o2Pressure * 10) + (int)'A');
    System.out.println("O2 group                        : " + oGroup);

    maximal = o2Pressure > MAX_VAL;
    contin = o2Pressure > CONTIN_VAL;
    System.out.println("");
    System.out.println("Exceeds maximal O2 pressure     : " + maximal);
    System.out.println("Exceeds contingency O2 pressure : " + contin);

  }
}
    
    
 

