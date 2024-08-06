import java.util.Scanner;

class Bowler{

  public String name;
  public boolean paid2;
  public int entry = 50;
  public int total;
  

  public Bowler(String name){
    //Prints out name
    this.name = name;
    System.out.println(name);
  }

  public boolean paid(){
    //Input of if the bowler has paid entry
    Scanner input = new Scanner(System.in);
    System.out.println("Has the bowler paid in advance?");
  

    String p = input.nextLine();
    switch (p){
      case "yes": paid2 = true;
      break;
      case "no": paid2 = false;
    }
    
    if (paid2 == true){
      System.out.println("The bowler has paid already!");
    }else {
      System.out.println("The bowler still owes entry fee.");
    }

    return paid2;
  }

  public void getTotal(){
    //Prints out total of entry owed
    if (paid2 == false){
      total = entry;
    } else {
      total = 0;
    }
    System.out.println("Total owed is " + total);
  }

}