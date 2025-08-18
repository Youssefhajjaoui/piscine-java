public class Monster extends Character {

	public Monster(String name, int maxHealth, Weapon w) {
		super(name, maxHealth, w);
	}

	public Monster(String name, int maxHealth) {
		super(name, maxHealth);
	}

	@Override
	public String toString() {
		if (this.getCurrentHealth() == 0) {
			return String.format("%s is a monster and is dead. %s", this.getName(), this.weapon.toString());
		} else {
			return String.format("%s is a monster with %d HP. %s", this.getName(), this.getCurrentHealth(),
					this.weapon.toString());
		}
	}

	@Override
	public void attack(Character other) {
		// if (other.weapon != null) {
		other.takeDamage(this.weapon.getDamage());

		// } else {
		// other.takeDamage(7);
		// }
	}

	@Override
	public void takeDamage(int damage) {
		this.setCurrentHealth(this.getCurrentHealth() - (int) Math.floor(damage * 0.8));
	}
}
