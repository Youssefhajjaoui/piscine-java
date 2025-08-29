
public class Excalibur {
    String name;
    private static Excalibur instance;

    private Excalibur() {
        this.name = "Sword";
    }
    
    private Excalibur(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static Excalibur getInstance() {
        if (instance == null) {
            instance = new Excalibur();
        }
        return instance;
    }
}