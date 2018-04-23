import java.util.Scanner;
public class I95Drive {
  private static Scanner keyboard  = new Scanner(System.in);

  private static final int SPEED_LIMIT = 65;
//-------------------------------------------
  public static void main(String[] args) {
    double hoursToTravel, distanceToTravel;
    double speedToTravel;
    double stopsToTravel;
    double totalTime;
    boolean speeding;

    System.out.println("Welcome to the I95 Speed Machine");
    System.out.println("");

    System.out.println("You will have to supply: \n + The distance you want to travel, in miles \n + The time you have available, in hours");
    System.out.println("");

    System.out.println("Enter distance to travel : ");
    distanceToTravel = keyboard.nextDouble();

    System.out.println("Enter time available     : ");
    hoursToTravel = keyboard.nextDouble();
    
    stopsToTravel = computeStops(distanceToTravel);

    totalTime = computeTime(hoursToTravel, stopsToTravel);

    speedToTravel = computeSpeed(distanceToTravel, totalTime);

    speeding = computeTF(speedToTravel);

    System.out.println("You will have to travel at " + speedToTravel);
    System.out.println("Over the speed limit     : " + speeding);
  }
//-------------------------------------------
  private static double computeStops (double distance) {
    double stops;
    double x;
    double remainder;

    x = distance / 100; 
    stops = Math.ceil(x);

    return (stops);
  }
//-------------------------------------------
  private static double computeTime (double hours, double stops) {
    double time;
    time = hours - (stops / 12.0);
    return (time);
  }
//-------------------------------------------
  private static double computeSpeed (double distance, double hours) {
    double travelSpeed;
    travelSpeed = distance / hours;
    return (travelSpeed);
  }
//-------------------------------------------
  private static boolean computeTF (double yourSpeed) {
    boolean youAreSpeeding;
    if (yourSpeed > SPEED_LIMIT) {
      youAreSpeeding = true;
    }
    else {
      youAreSpeeding = false;
    }
    return (youAreSpeeding);
  }
}
    
    
 

