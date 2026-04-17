package ui;

public final class Category {

    private String foodName;
    private double kiloPerPerson;

    public Category(String foodName , double kiloPerPerson){

        this.foodName = foodName;
        this.kiloPerPerson = kiloPerPerson;

    }
     
    public String getFoodName(){

        return foodName;
    }

    public double getKiloPerPerson(){

        return kiloPerPerson;
    }

    public void setFoodName(String foodName){

        this.foodName = foodName;
    }
    public void setKiloPerPerson(double kiloPerPerson){

        this.kiloPerPerson = kiloPerPerson;
    }

}
