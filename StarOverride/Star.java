
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

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y, this.z, this.name, this.magnitude);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass())
            return false;
        Star other = (Star) obj;
        return Double.compare(this.x, other.x) == 0 &&
                Double.compare(this.y, other.y) == 0 &&
                Double.compare(this.z, other.z) == 0 &&
                Double.compare(this.magnitude, other.magnitude) == 0 &&
                Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", this.name, this.magnitude);
    }
}