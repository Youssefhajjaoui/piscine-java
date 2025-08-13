
import java.util.Objects;

public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;
    public static int KM_IN_ONE_AU = 150000000;

    public CelestialObject() {
        this.name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return this.z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getDistanceBetween(CelestialObject first, CelestialObject other) {
        return Math.sqrt(
                Math.pow((first.getX() - other.getX()), 2) + Math.pow((first.getY() - other.getY()), 2)
                        + Math.pow((first.getZ() - other.getZ()), 2));
    }

    public static double getDistanceBetweenInKm(CelestialObject first, CelestialObject other) {
        return first.getDistanceBetween(first, other) * 150000000;
    }

    @Override
    public String toString() {
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", this.name, this.x, this.y, this.z);
    }

    public boolean equals(CelestialObject other) {
        return this.x == other.x && this.y == other.y && this.z == other.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y, this.z);
    }
}