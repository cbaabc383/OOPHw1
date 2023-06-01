package ru.geekbrains.lesson1;

public class Chocolate extends Product{
    
    private int calories;
    private double weight;

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Chocolate(String brand, String name, double price, int calories, double weight){
        super(brand, name, price);
        this.calories = calories;
        this.weight = weight;
    }

    

    @Override
    public String displayInfo() {
        return String.format("[Шоколад]%s - %s - %.2f - [калорийность: %d] - [масса: %.1f]", brand, name, price, calories, weight);
    }
}
