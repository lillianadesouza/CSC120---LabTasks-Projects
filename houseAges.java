import java.util.Scanner;
public class houseAges {
  private static Scanner keyboard  = new Scanner(System.in);

  public static void main(String[] args) {
    int amtHouses, amtPeople;
    int[] houseNumbers;
    int[][] houseAges; 
    int totalAgeOfHouse = 0;
    int totalAge = 0;

    System.out.print("How many houses in the street?   : ");
    amtHouses = keyboard.nextInt();
    houseNumbers = new int[amtHouses];
    
    int i;
    for (i = 0; i < amtHouses; i++){
      System.out.print("What is the next house number?   : ");
      houseNumbers[i] = keyboard.nextInt();
    }
    
    houseAges = new int[amtHouses][]; 
    for (int row = 0; row < amtHouses; row++) {
      System.out.print("How many people live in number " + houseNumbers[row] + " : ");
      amtPeople = keyboard.nextInt();
      houseAges[row] = new int[amtPeople];
      for (int column = 0; column < amtPeople; column++) {
        System.out.print("What is the age of person " + (column + 1) + "      : ");
        houseAges[row][column] = keyboard.nextInt();
      }
    }
    for (int t = 0; t < houseAges.length; t++) {
      for (int j = 0; j < houseAges[t].length; j++){
        totalAgeOfHouse = totalAgeOfHouse + houseAges[t][j];
      }
      System.out.println("House " + houseNumbers[t] + " has a total age of " + totalAgeOfHouse);
      totalAge = totalAge + totalAgeOfHouse;
      totalAgeOfHouse = 0;
    }
    System.out.println("The street has a total age of " + totalAge);
  }
}
