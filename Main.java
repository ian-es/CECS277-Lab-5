/*
Group 11
Ian Escalante
Julio Calderon

CECS 277 Lab 6
3/3/2022
*/


/** Game of "Yahtzee" thtat rolls dice and checks matching pairs for points
*/
class Main {
  public static void main(String[] args) {
    Player dice = new Player();
    boolean quit = true;
    System.out.println("Yahtzee");
    System.out.println();
    while(quit == true) {
      takeTurn(dice);
      System.out.print("Play again? (Y/N): ");
      quit = CheckInput.getYesNo();
      System.out.println();
    }
    System.out.println("Game Over.");
    System.out.println("Final Score = " + dice.getPoints() + " points");
    
  }


  /**Rolls user's dice, prints the amount of matches to console, and updates the user's points
  */
  public static void takeTurn(Player p){
    p.roll();
    p.sort();
    System.out.println("Rolling dice..."+p);
    if(p.threeOfAKind()){
      System.out.println("You got 3 of a kind!");
    }
    else if (p.pair()){
      System.out.println("You got a pair!");
    }
    else if (p.series()){
      System.out.println("You got a series!");
    }
    else{
      System.out.println("Aww... Too bad!");
    }
    System.out.println("Score = "+p.getPoints()+".");
  }
}