public class DeadCharacterException extends Exception {
    private final Character agent;

    public DeadCharacterException(Character agent) {
        this.agent = agent;
    }

    public String getMessage() {
        String className = agent.getClass().getSimpleName().toLowerCase();
        String name = agent.getName();
        return "The " + className + " " + name + " is dead.";
    }
}