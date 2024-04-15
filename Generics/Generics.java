package Generics;

import Generics.Product.Order;
import Generics.Product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Generics {

    public static double calculateAverageOrderValue(List<Order> orders) {
        OptionalDouble average = orders.stream()
                .mapToDouble(Order::getAmount)
                .average();

        return average.orElse(0.0);
    }

    public static void main(String[] args) {

        /**
         * Scenario 1 - Calculate Average
         * ***/
        List<Number> numbers = new ArrayList<>();
        numbers.addAll(List.of(10, 3.14, 2.5f, 1000L, (short) 5));
        System.out.println(CalcAverage.calculateAverage(numbers));

        /**
         * Scenario 2 - Generate Key Value Pairs
         * */
        KeyValueStore<Integer, String> myStore = new KeyValueStore<Integer, String>();
        myStore.add(1, "product 1");
        myStore.add(2, "product 2");

        System.out.println(myStore.get(2));



        /**
         *
         * Scenario 3 - Filtering Product by Price
         * */

        List<Product> products = List.of(
            new Product("Laptop", 999.99),
            new Product("Smartphone", 699.99),
            new Product("Headphones", 149.99),
            new Product("Tablet", 299.99)
        );


        double minPrice = 200.00;

        List<Product> filteredProducts = products.stream()
                .filter(product -> product.getPrice() > minPrice)
                .toList();

        filteredProducts.forEach(System.out::println);



        /**
         * Scenario - 4 Calculate Average Order Value
         * ***/
        List<Order> orders = List.of(
                new Order(1, 100.50),
                new Order(2, 75.25),
                new Order(3, 120.75),
                new Order(4, 90.00)
        );

        // Calculate average order value
        double averageOrderValue = calculateAverageOrderValue(orders);

        // Print average order value
        System.out.println("Average Order Value: $" + averageOrderValue);

    }
}
