import java.util.ArrayList;
import java.util.List;
public class Character {
	private final int maxHealth;
	private int currentHealth;
	private final String name;
        private static List<Character> allCharacters = new ArrayList<>();

     public Character(String name, int maxHealth){
	     this.name = name;
	     this.maxHealth = maxHealth;
	     this.currentHealth = maxHealth;
	     allCharacters.add(this);
     }

     @Override
     public String toString(){
	if (this.currentHealth > 0){
	  return String.format("%s : %d/%d" , this.name , this.currentHealth , this.maxHealth);
	}else{
	  return String.format("%s : KO" , this.name);
	}
     }

     public String getName(){
       return this.name; 
     }
     public static String printStatus(){
	     if (allCharacters.size() == 0){
	     	return "------------------------------------------\nNobody's fighting right now !\n------------------------------------------\n";

	     }
     	StringBuilder s = new StringBuilder();
	s.append("------------------------------------------\n");
	s.append("Characters currently fighting :\n");
	for (Character character : allCharacters){
	 s.append(String.format("- %s\n",character.toString())); 
	}
	s.append("------------------------------------------\n");
	return s.toString();
     }

     public int getCurrentHealth(){
     	return this.currentHealth;
     }

     public int getMaxHealth(){
	return this.maxHealth;

     }

     public void takeDamage(int damage){
	if (this.currentHealth - damage <= 0){
	  this.currentHealth = 0;	
	}else{
	  this.currentHealth -= damage;	
	}
     }

     public void attack(Character other){
     	other.takeDamage(9);
     }

     public static Character fight(Character first, Character second){
     	while( first.currentHealth != 0 && second.currentHealth != 0 ){
	  first.attack(second);
	  if (second.currentHealth != 0){
	  second.attack(first);
	  }
	}
	if (first.currentHealth == 0){
	   return second;
	}else{
	   return first;
	}
     }

}
