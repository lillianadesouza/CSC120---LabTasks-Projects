public class Diamond{

   private int carats;
   private double worth;

   public Diamond(){

     carats = 0;
     worth = 0;
   } 

   public Diamond(int carats, double worth){

     this.carats = carats;
     this.worth = worth;
   } 

   public String toString(){
     String outputString;
     outputString = carats + " carats, worth $ " + worth + "\n";
     return(outputString);
   }
   public int getCarats() {
     return(carats);
   }
}

