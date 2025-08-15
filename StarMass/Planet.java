import java.util.Objects;

public class Planet extends CelestialObject {
    private Star centerStar;

    public Planet() {
        super();
        this.centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar){
        super(name, x, y, z);
	this.centerStar = centerStar;
    }
    public Planet(String name, double x, double y, double z, Star centerStar, int mass) {
        super(name, x, y, z, mass);
        this.centerStar = centerStar;
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
    public String toString() {
        return String.format("%s circles around %s at the %.3f AU", this.name, this.centerStar.name,
                CelestialObject.getDistanceBetween(this, this.getCenterStar()));
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
