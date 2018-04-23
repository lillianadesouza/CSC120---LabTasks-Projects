public class Family {

  Person[] myFamily;
  int totalPeople;
  int totalAge;

  public Family(){
    totalPeople = 0;
    totalAge = 0;
    myFamily = new Person[10];
  }

  public String toString(){
    return ("");
  }
  
  public boolean addPerson(String personName, int personAge){
    boolean answer;
      if (totalPeople < 11) {
        answer = true;
        myFamily[totalPeople] = new Person(personName, personAge);
        totalPeople++;
      }
      else {
        answer = false;
      }
    return(answer);
  }
  
  public int getNumberOfPeople(){
    return(totalPeople);
  }
  public int getTotalAge(){
    totalAge = 0;
    for (int k = 0; k < totalPeople; k++){
      totalAge = totalAge + (myFamily[k].getAge());
    }
    return(totalAge);
  }
  public void birthday(String theName){
    for (int j = 0; j < totalPeople; j++){
      if ((myFamily[j].getName()).equals(theName)){
      myFamily[j].incrementAge();
      }
    }
  }
  public void display(){
    for (int i = 0; i < totalPeople; i++){
      System.out.println(myFamily[i]);
    }
  }
}
  
