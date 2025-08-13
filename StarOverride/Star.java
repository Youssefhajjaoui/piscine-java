
import java.util.Objects;

public class Star extends CelestialObject {
    private double magnitude;

    public double getMagnitude() {
        return this.magnitude;
    }

    public void setMagnitude(double magnetique) {
        this.magnitude = magnetique;
    }

    public Star() {

    }

    public Star(String name, double x, double y, double z, double magnitude) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        this.magnitude = magnitude;
    }

    public int hashCode() {
        return Objects.hash(this.x, this, y, this.z, this.name, this.magnitude);
    }

    public boolean equals(Star other) {
        if (other == null) {
            return false;
        }
        return this.x == other.x && this.y == other.y && this.z == other.z && this.name == other.name
                && this.magnitude == other.magnitude;
    }

    public String toString() {
        return String.format("%s shines at the %.3f magnitude", this.name, this.magnitude);
    }
}