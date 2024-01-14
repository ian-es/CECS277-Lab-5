class Die{ 
  private int sides;
  private int value;

  /** Constructs a die, default value 0
  @param s number of sides
  */
  public Die(int s){
    sides = s;
    value = 0;
  }
  
  /** Randomizes value
  @return randomized value from 1-sides
  */
  public int roll(){
    value = (int)(Math.random() * sides) + 1;
    return value;
  }
  
  /**Checking if implicit and expicit values are equal
  @param o object to be compared
  @return if values of object and die are equal
  */
  public boolean equals(Object o){
    if (o instanceof Die){
      Die d = (Die) o; 
      if (d.value == this.value){
        return true;
      }
    }
    return false;
  }

  /**Checking if implicit is less than explicit value
  @param d die to be compared
  @return if implicit is less than explicit
  */
  public boolean lessThan(Die d){
    return this.value < d.value;
  }

  /**Returns difference of implicit and explicit values
  @return implicit explicit difference
  */
  public int difference(Die d){
    return this.value - d.value;
  }

  /**String representation of die value
  @return value as a string
  */
  @Override
  public String toString(){
    return "" + this.value;
  }
}