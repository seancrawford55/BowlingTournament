class Main {

  public static void main(String[] args) {
    Bowler Sean = new Bowler("Sean");
    Sean.paid();
    Sean.getTotal();
    Gambler Jacob = new Gambler("Jacob", 20, 100);
    Jacob.paid();
    Jacob.getTotal();

    Lanes bowlero = new Lanes(24);
    bowlero.Lanenum(Sean.name);
    bowlero.Lanenum(Jacob.name);
    
  }
}