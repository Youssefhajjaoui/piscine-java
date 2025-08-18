public class Templar extends Character implements Tank, Healer {
	private final int healCapacity;
	private final int shield;

	public Templar(String name, int maxHealth, int HealCapacity, int shield, Weapon w) {
		super(name, maxHealth, w);
		this.healCapacity = HealCapacity;
		this.shield = shield;
	}

	public Templar(String name, int maxHealth, int HealCapacity, int shield) {
		super(name, maxHealth);
		this.healCapacity = HealCapacity;
		this.shield = shield;
	}

	@Override
	public int getHealCapacity() {
		return this.healCapacity;
	}

	@Override
	public void heal(Character other) {
		if (this.getCurrentHealth() == 0) {
			throw new DeadCharacterException(this); // attacker is dead
		}
		other.addCurrentHealth(this.healCapacity);
	}

	@Override
	public int getShield() {
		return this.shield;
	}

	@Override
	public String toString() {
		if (this.getCurrentHealth() != 0) {
			return String.format("%s is a strong Templar with %d HP. It can heal %d HP and has a shield of %d. %s",
					this.getName(), this.getCurrentHealth(), this.healCapacity, this.shield,
					this.getWeapon().toString());
		} else {
			return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP. %s",
					this.getName(), this.shield, this.healCapacity, this.getWeapon().toString());
		}
	}

	@Override
	public void attack(Character other) {
		if (other.getCurrentHealth() == 0) {
			throw new DeadCharacterException(other); // pass the dead character
		}

		if (this.getCurrentHealth() == 0) {
			throw new DeadCharacterException(this); // attacker is dead
		}
		other.takeDamage(this.getWeapon().getDamage());
		this.heal(this);
	}

	@Override
	public void takeDamage(int damage) {
		this.setCurrentHealth(this.getCurrentHealth() - (damage - shield));
	}

}
