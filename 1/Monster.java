package AdventureCatch;
public class Monster extends Character {

	public Monster(String name, int maxHealth) {
		super(name, maxHealth);
	}

	@Override
	public String toString() {
		if (this.getCurrentHealth() == 0) {
			return String.format("%s is a monster and is dead", this.getName());
		} else {
			return String.format("%s is a monster with %d HP", this.getName(), this.getCurrentHealth());
		}
	}

	@Override
	public void attack(Character other) {
		other.takeDamage(7);
	}

	@Override
	public void takeDamage(int damage) {
		this.setCurrentHealth(this.getCurrentHealth() - (int) Math.floor(damage * 0.8));
	}
}
