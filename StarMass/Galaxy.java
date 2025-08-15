import java.util.List;
import java.util.Map;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        this.celestialObjects = new java.util.ArrayList<CelestialObject>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return this.celestialObjects;
    }

    public void addCelestialObject(CelestialObject other) {
        this.celestialObjects.add(other);
    }

    public Map<String, Integer> computeMassRepartition() {
        Map<String, Integer> result = new java.util.HashMap<>();
        result.put("Star", 0);
        result.put("Planet", 0);
        result.put("Other", 0);

        for (CelestialObject obj : this.celestialObjects) {
            String type;
            if (obj instanceof Star) {
                type = "Star";
            } else if (obj instanceof Planet) {
                type = "Planet";
            } else {
                type = "Other";
            }
            result.put(type, result.get(type) + Integer.parseInt(obj.getMass()));
        }

        return result;
    }
}
