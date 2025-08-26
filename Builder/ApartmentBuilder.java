public class ApartmentBuilder implements HousingBuilder {
    Apartment apart;

    public ApartmentBuilder() {
        this.apart = new Apartment();
    }

    @Override
    public HousingBuilder setSize(int size) {
        this.apart.setSize(size);
        return this;
    }

    @Override
    public HousingBuilder setPrice(int price) {
        this.apart.setPrice(price);
        return this;
    }

    @Override
    public HousingBuilder setRooms(int rooms) {
        this.apart.setRooms(rooms);
        return this;
    }

    @Override
    public HousingBuilder setName(String name) {
        this.apart.setName(name);
        return this;
    }

    @Override
    public Housing build() {
        return this.apart;
    }

}