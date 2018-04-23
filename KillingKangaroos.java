import java.util.Scanner;
public class KillingKangaroos {
  private static Scanner keyboard  = new Scanner(System.in);

  private static final double ROADKILL_CONSTANT = 1.47;
  private static final double AVG_ROAD_WIDTH = 0.01;

  public static void main(String[] args) {

    double sideOfSquare, roadLength, numberOfRoos;
    double squareArea, rooDensity, roadSurfaceArea, expectedKills;

    System.out.print("Enter side of square in km: "); 
    sideOfSquare = keyboard.nextDouble(); 

    System.out.print("Enter roads length in km: ");
    roadLength = keyboard.nextDouble();

    System.out.print("Enter number of 'roos: ");
    numberOfRoos = keyboard.nextDouble();

    squareArea = sideOfSquare * sideOfSquare;
    rooDensity = numberOfRoos / squareArea;
    roadSurfaceArea = AVG_ROAD_WIDTH * roadLength; 
    expectedKills = rooDensity * roadSurfaceArea * ROADKILL_CONSTANT;
    
    System.out.println("Expected number of kills is: " + expectedKills);
  }
}
    
    
 

