import java.util.ArrayList;
import java.util.Random;
class Lanes{
  int lanenum;
  ArrayList<Integer> lanenums = new ArrayList<>();

  public Lanes(int length){
    //creates list of lane numbers 
    for(int x = 1; x <= length; x++){
      lanenums.add(x);
    }
  }
  
  public int Lanenum(String name){
    //random lane assignments 
    int upperbound = lanenums.size();
    Random rand = new Random();
    int int_random = rand.nextInt(upperbound);
    System.out.println(name + "'s lane number " + int_random);
    lanenums.remove(int_random);
    return  0;
  }

  
}