
import java.util.Objects;

public class Star extends CelestialObject {
    private double magnitude;

    public Star() {
        // super();
    }

    public Star(String name, double x, double y, double z, double magnitude, Integer mass) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        this.magnitude = magnitude;
        this.mass = mass;
    }

    public double getMagnitude() {
        return this.magnitude;
    }

    public void setMagnitude(double magnetique) {
        this.magnitude = magnetique;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y, this.z, this.name, this.magnitude);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        super.equals((CelestialObject) other);
        Star obj = (Star) other;
        return this.x == obj.x && this.y == obj.y && this.z == obj.z && this.name.equals(obj.name)
                && this.magnitude == obj.magnitude;
    }

    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", this.name, this.magnitude);
    }
}