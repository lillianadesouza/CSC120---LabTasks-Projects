import java.util.Scanner;
//=============================================================================
public class BuggyProgram {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
//----The gas constant in Joules/mole/K
    private static double GAS_CONSTANT = 8.3143;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

//----Variables to hold system values
        double volume,moles,temp;
        double pressure;

//----Gather data
        System.out.print("Enter volume, moles, temperature : ");
        volume = keyboard.nextDouble();
        moles = keyboard.nextDouble();
        temp = keyboard.nextDouble();

//----Perform calculation
        pressure = moles * GAS_CONSTANT * temp / volume;

//----Display results
        System.out.println("Pressure is " + pressure);
    }
//-----------------------------------------------------------------------------
}
//=============================================================================

