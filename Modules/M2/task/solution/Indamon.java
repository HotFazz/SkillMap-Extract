  //REPOBEE-SANITIZER-SHRED
  class Indamon {

    // Put your fields here!
    private String name;
    private int hp;
    private int attack;
    private int defense;
    boolean fainted;

    public Indamon(){
      // :)
    }

    public Indamon(String name, int hp, int attack, int defense) {
       this.name = name;
       this.hp = hp;
       this.attack = attack;
       this.defense = defense;
       this.fainted = false;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getHp() {
      return hp;
    }

    public void setHp(int hp) {
      this.hp = hp;
    }

    public int getAttack() {
      return attack;
    }

    public void setAttack(int attack) {
      this.attack = attack;
    }

    public int getDefense() {
      return defense;
    }

    public void setDefense(int defense) {
      this.defense = defense;
    }

    public boolean isFainted() {
      return fainted;
    }

    public void setFainted(boolean fainted) {
      this.fainted = fainted;
    }

    public void attack(Indamon foe){
      int attackDamage = this.attack / foe.getDefense();
      foe.setHp(foe.getHp()-attackDamage);
    }

    public static void main(String[] args) {
      // create a new "Student" object
      Indamon glassey = new Indamon();

      // assign the instance variables to meaningful values
      glassey.name = "glassey";
      glassey.hp = 10;
      glassey.attack = 5;
      glassey.defense = 5;

      // get the information of the assigned values
      System.out.println(glassey.name);
      System.out.println(glassey.hp);
      System.out.println(glassey.attack);
      System.out.println(glassey.defense);
    } // end main method

  } // end class