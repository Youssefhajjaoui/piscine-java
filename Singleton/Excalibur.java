
public class Excalibur {
    String name;
    // Excalibur Instance;

    public Excalibur() {
    }

    public Excalibur(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Excalibur getInstance() {
        return new Excalibur("Sword");
    }
}