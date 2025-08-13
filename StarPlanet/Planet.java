import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        super();
    }

    public Planet(String name, double x, double y, double z, Star centerStar) {
        this.name = name;
        this.centerStar = centerStar;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Star getCenterStar() {
        return this.centerStar;
    }

    public void setCenterStar(Star other) {
        this.centerStar = other;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y, this.z, this.name, this.centerStar);
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        super.equals((CelestialObject) other);
        Planet obj = (Planet) other;
        return this.x == obj.x && this.y == obj.y && this.z == obj.z && this.name.equals(obj.name)
                && this.centerStar.getMagnitude() == obj.centerStar.getMagnitude();
    }
}

// getCenterStar and setCenterStar