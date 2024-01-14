class Player{
  private Die[] dice;
  private int points;
  
  /** Constructs an array of 3, 6-sided dice
  */
  public Player(){
    dice = new Die[3];
    for (int i = 0; i < dice.length;i++) {
      dice[i] = new Die(6); //3 6-sided dice
    }
  }
  
  /** Returns the player's points
      @return player's points
  */
  public int getPoints(){
    return this.points;
  }
  
  /** Sorts the array of dice from least to greatest value
  */
  public void sort(){
    Die temp1;
    for (int i = 0; i < dice.length - 1; i++) {
      for (int j = i + 1; j < dice.length; j++) {
        if (dice[i].lessThan(dice[j]) == false && dice[i].equals(dice[j]) == false) {
          temp1 = dice[i];
          dice[i] = dice[j];
          dice[j] = temp1;
        }
      }
    }
  }
    
  /** Determines if the array of dice contains two of the same values
      @return boolean value 
  */
  public boolean pair(){
      if (dice[0].equals(dice[1]) || dice[1].equals(dice[2]) || dice[0].equals(dice[2])){
        this.points += 1;
        return true;
    }
      return false;
  }

  /** Determines if the array of dice contains three of the same values
      @return boolean value 
  */
  public boolean threeOfAKind(){
    if (dice[0].equals(dice[1]) && dice[0].equals(dice[2])){
      this.points += 3;
      return true;
    }
    return false;
  }

  /** Determines if the array of dice contains three ascending values
      @return boolean value 
  */
  public boolean series(){
    for (int i=1;i<dice.length;i++){
      if (dice[i].difference(dice[i-1])!=1){
        return false;
      }
    }
    this.points += 2;
    return true;
  }

  /** Randomizes the values of each die using die funcion roll
  */
  public void roll(){
    for(int i = 0; i < dice.length; i++) {
      dice[i].roll();
    }
  }

  /**String representation of die list
  @return value as a string
  */
  @Override
  public String toString(){
    String s = "";
    for(int i = 0; i < dice.length; i++) {
      s += "D" + (i + 1) + " = " + dice[i]+" ";
    }
    return s; 
  }
  
}