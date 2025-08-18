import java.util.ArrayList;
import java.util.List;

public abstract class Character {
	private final int maxHealth;
	private int currentHealth;
	private final String name;
	private static List<Character> allCharacters = new ArrayList<>();

	public Character(String name, int maxHealth) {
		this.name = name;
		this.maxHealth = maxHealth;
		this.currentHealth = maxHealth;
		allCharacters.add(this);
	}

	@Override
	public String toString() {
		if (this.currentHealth > 0) {
			return String.format("%s : %d/%d", this.name, this.currentHealth, this.maxHealth);
		} else {
			return String.format("%s : KO", this.name);
		}
	}

	public String getName() {
		return this.name;
	}

	public static String printStatus() {
		if (allCharacters.isEmpty()) {
			return "------------------------------------------\nNobody's fighting right now !\n------------------------------------------\n";
		}
		StringBuilder s = new StringBuilder();
		s.append("------------------------------------------\n");
		s.append("Characters currently fighting :\n");
		for (Character character : allCharacters) {
			s.append(String.format(" - %s\n", character.toString()));
		}
		s.append("------------------------------------------\n");
		return s.toString();
	}

	public int getCurrentHealth() {
		return this.currentHealth;
	}

	public int getMaxHealth() {
		return this.maxHealth;

	}

	abstract void takeDamage(int damage);

	abstract void attack(Character other);

	public static Character fight(Character first, Character second) {
		while (first.currentHealth != 0 && second.currentHealth != 0) {
			first.attack(second);
			if (second.currentHealth != 0) {
				second.attack(first);
			}
		}
		if (first.currentHealth == 0) {
			return second;
		} else {
			return first;
		}
	}

	public void addCurrentHealth(int heal) {
    		this.currentHealth += heal;
    		if (this.currentHealth > this.maxHealth) {
        		this.currentHealth = this.maxHealth;
    		}
    		if (this.currentHealth < 0) {
        		this.currentHealth = 0;
    		}
	}

	protected void setCurrentHealth(int heal){
		this.currentHealth = (heal < 0) ? 0 : heal;

	}


}
