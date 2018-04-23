public class Girl{

  private String name;
  private Diamond myDiamond;
  

  public Girl(){
     name = "";
   
     myDiamond = new Diamond();
  } 

  public Girl(String name){
     this.name = name;
    
     myDiamond = null;
  } 

  public String toString(){
     String displayString;
     
     displayString = name;
     if (myDiamond != null) {
       displayString += " has a diamond, " + myDiamond;
     } else {
         displayString += " has no best friend";
     }
     return (displayString);
  }
   
 
  public void createDiamond(Diamond newDiamond) {
    if (myDiamond == null) {
      myDiamond = newDiamond;
      System.out.println("Woohoo, the girl took the diamond");
    } 
    else {
      if (newDiamond.getCarats() > myDiamond.getCarats()) {
        myDiamond = newDiamond;
        System.out.println("Woohoo, the girl took the diamond");
      }
      else {
        System.out.println("Aaargh, the diamond was rejected");
      }
    }
  }
}





