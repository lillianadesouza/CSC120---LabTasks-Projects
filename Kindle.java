public class Kindle{

  int currentPage;
  int totalPages;

  public Kindle(int numberOfPages){
    currentPage = 1;
    totalPages = numberOfPages;
  }

  public String toString(){
    return ("Page " + currentPage + " of  " + totalPages + ".");
  }
  
  public void turnPages(){
    if ((currentPage + 1) > totalPages){
      System.out.println("You were on                : " + toString() + "\nTurning 1 page would take you past the last page.");
      currentPage = totalPages;
      System.out.println("You are now on             : " + toString()); 
    }
    else {
      currentPage = currentPage + 1;
    }
  }
  
  public void turnPages(int pagesToTurn){
    if ((currentPage + pagesToTurn) > totalPages){
      System.out.println("You were on                : " + toString() + "\nTurning " + pagesToTurn + " page would take you past the last page.");
      currentPage = totalPages;
      System.out.println("You are now on             : " + toString()); 
    }
    else {
      currentPage = currentPage + pagesToTurn;
    }
  }
}
  
