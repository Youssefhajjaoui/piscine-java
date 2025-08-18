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
					this.getName(), this.getCurrentHealth(), this.healCapacity, this.shield, this.weapon.toString());
		} else {
			return String.format("%s has been beaten, even with its %d shield. So bad, it could heal %d HP. %s",
					this.getName(), this.shield, this.healCapacity, this.weapon.toString());
		}
	}

	@Override
	public void attack(Character other) {
		// if (this.weapon != null) {
		other.takeDamage(this.weapon.getDamage());
		// } else {
		// other.takeDamage(6);
		// }
		this.heal(this);
	}

	@Override
	public void takeDamage(int damage) {
		this.setCurrentHealth(this.getCurrentHealth() - (damage - shield));
	}

}
