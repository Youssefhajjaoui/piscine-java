
public class Excalibur {
    String name;
    private static Excalibur instance;

    public Excalibur() {
    }

    public Excalibur(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Excalibur getInstance() {
        if (instance == null) {
            instance = new Excalibur("Sword");
        }
        return instance;
    }
}