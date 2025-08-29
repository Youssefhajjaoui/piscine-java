public class WithColdMeats extends RacletteDecorator {
    public WithColdMeats(Raclette raclette) {
        super(raclette);
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 350;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", charcuterie";
    }

    @Override
    public String toString() {
        return this.getIngredients() + " pour " + this.getCalories() + " calories";
    }
}