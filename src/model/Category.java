package model;

public final class Category {

    private final String foodName;
    private final double kiloPerPerson;

    public Category(String foodName, double kiloPerPerson) {

        this.foodName = foodName;
        this.kiloPerPerson = kiloPerPerson;

    }

    public String getFoodName() {

        return foodName;
    }

    public double getKiloPerPerson() {

        return kiloPerPerson;
    }

}
