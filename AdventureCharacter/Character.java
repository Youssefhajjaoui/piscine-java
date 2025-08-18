
public class Character {
	private final int maxHealth;
	private int currentHealth;
	private final String name;

     public Character(String name, int maxHealth){
	     this.name = name;
	     this.maxHealth = maxHealth;
	     this.currentHealth = maxHealth;
     }

     @Override
     public String toString(){
	System.out.println(this.currentHealth);
	if (this.currentHealth > 0){
	  return String.format("%s : %d/%d" , this.name , this.currentHealth , this.maxHealth);
	}else{
	  return String.format("%s : KO" , this.name);
	}
     }

     public String getName(){
       return this.name; 
     }

     publid int getCurrentHealth(){
     	return this.currentHealth;
     }

     public void takeDamage(int damage){
     	this.currentHealth -= damage;
     }

     public void attack(Character other){
     	other.takeDamage(9);
     }

}
