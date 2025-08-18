public interface Healer {
	public void heal(Character other) throws DeadCharacterException;

	public int getHealCapacity();
}
