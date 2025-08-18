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
			return String.format("%s is a monster and is dead. %s", this.getName(), this.getWeapon().toString());
		} else {
			return String.format("%s is a monster with %d HP. %s", this.getName(), this.getCurrentHealth(),
					this.getWeapon().toString());
		}
	}

	@Override
	public void attack(Character other) throws DeadCharacterException {
		if (other.getCurrentHealth() == 0) {
			throw new DeadCharacterException(other); // pass the dead character
		}

		if (this.getCurrentHealth() == 0) {
			throw new DeadCharacterException(this); // attacker is dead
		}
		other.takeDamage(this.getWeapon().getDamage());
	}

	@Override
	public void takeDamage(int damage) throws DeadCharacterException {
		if (this.getCurrentHealth() == 0) {
			throw new DeadCharacterException(this); // attacker is dead
		}
		this.setCurrentHealth(this.getCurrentHealth() - (int) Math.floor(damage * 0.8));
	}
}
