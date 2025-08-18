public class Sorcerer extends Character implements Healer {
	private final int healCapacity;

	public Sorcerer(String name, int maxHealth, int capacity, Weapon w) {
		super(name, maxHealth, w);
		this.healCapacity = capacity;
	}

	public Sorcerer(String name, int maxHealth, int capacity) {
		super(name, maxHealth);
		this.healCapacity = capacity;
	}

	@Override
	public int getHealCapacity() {
		return this.healCapacity;
	}

	@Override
	public void heal(Character other) throws DeadCharacterException {
		if (this.getCurrentHealth() == 0) {
			throw new DeadCharacterException(this); // attacker is dead
		}
		other.addCurrentHealth(healCapacity);
	}

	@Override
	public String toString() {
		if (this.getCurrentHealth() != 0) {
			return String.format("%s is a sorcerer with %d HP. It can heal %d HP. %s", this.getName(),
					this.getCurrentHealth(), this.healCapacity, this.getWeapon().toString());
		} else {
			return String.format("%s is a dead sorcerer. So bad, it could heal %d HP. %s", this.getName(),
					this.healCapacity, this.getWeapon().toString());
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
		this.heal(this);
		other.takeDamage(this.getWeapon().getDamage());
	}

	@Override
	public void takeDamage(int damage) throws DeadCharacterException {
		if (this.getCurrentHealth() == 0) {
			throw new DeadCharacterException(this); // attacker is dead
		}
		this.setCurrentHealth(this.getCurrentHealth() - damage);
	}

}
