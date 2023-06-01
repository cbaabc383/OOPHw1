package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Chocolate chocolate1 = new Chocolate("ООО Радость", "Аленушка", 100, 150, 37.5);
        Product chocolate2 = new Chocolate("ОАО Шоколадница", "Шоколадница", 30, 137, 50);
        Chocolate chocolate3 = new Chocolate("ООО Старт", "Чемпион", 200, 200, 200);

        // Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115, 1);
        // Product bottleOfWater2 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [2]", 215, 1.5);
        // BottleOfWater bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115, 1.5);
        // Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55, 2);

        // Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 115, 1.5, 10);

        List<Product> products = new ArrayList<>();
        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);
        // products.add(bottleOfWater1);
        // products.add(bottleOfWater2);
        // products.add(bottleOfMilk1);
        // products.add(bottleOfWater4);
        // products.add(bottleOfWater3);

        System.out.println("Все товары: "); 
        for (Product chocolate : products) {
            System.out.println(chocolate.displayInfo());            
        }

        // VendingMachine vendingMachine = new VendingMachine(products);
        // BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(2);
        // if (bottleOfWaterResult != null){
        //     System.out.println("Вы купили: ");
        //     System.out.println(bottleOfWaterResult.displayInfo());
        // }
        // else {
        //     System.out.println("Такой бутылки с водой нет в автомате.");
        // }

        VendingMachine vendingMachine1 = new VendingMachine(products);
        Chocolate chocolateResult = vendingMachine1.getChocolate(120, 140);
        if (chocolateResult != null){
            System.out.println("Вы купили: ");
            System.out.println(chocolateResult.displayInfo());
        }
        else {
            System.out.println("Такого шоколада нет в автомате.");
        }
    }

}

