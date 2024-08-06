class Gambler extends Bowler{
  public int brackets;
  public int sidepots;
  

  public Gambler(String name, int brackets, int sidepots){
    super(name);
    this.brackets = brackets;
    this.sidepots = sidepots;
  }

  
  @Override
  public void getTotal(){
    //Adds side bets up to total
    total = (brackets * 5) + sidepots;
    //Adds entry to side bet total if needed
    if (paid2 == false){
      total = total + entry;
    }
    System.out.println("The total owed by " + name + " is " + total);
  }
}