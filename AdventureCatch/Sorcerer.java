package AdventureCatch;
public class Sorcerer extends Character implements Healer {
	private final int healCapacity;
	
	public Sorcerer(String name, int maxHealth , int capacity){
		super(name , maxHealth);
		this.healCapacity = capacity;
	}
	@Override
	public int getHealCapacity(){
		return this.healCapacity;
	}
	@Override
	public void heal(Character other){
		other.addCurrentHealth(healCapacity);
	}
	@Override
	public String toString(){
		if (this.getCurrentHealth() != 0){
			return String.format("%s is a sorcerer with %d HP. It can heal %d HP.", this.getName() , this.getCurrentHealth() , this.healCapacity);
		}else{
			return String.format("%s is a dead sorcerer. So bad, it could heal %d HP.", this.getName() , this.healCapacity);
		}
	}

	@Override
	public void attack(Character other){
		this.heal(this);
		other.takeDamage(10);
	}
	@Override
	public void takeDamage(int damage){
		this.setCurrentHealth(this.getCurrentHealth() - damage);
	}


}
