package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Collections {
    public static void main(String[] args) {

                /**
                 * Scenario 1: Managing a Shopping Cart (List) using ArrayList
                 */
                ArrayList<String> shoppingCart = new ArrayList<>();
                shoppingCart.add("Apples");
                shoppingCart.add("Bananas");
                shoppingCart.add("Milk");
                System.out.println("Shopping Cart: " + shoppingCart);



                /*
                Scenario 2: Keeping Track of Unique Products (Set) using HashSet
                */
                HashSet<Integer> productIds = new HashSet<>();
                productIds.add(101);
                productIds.add(102);
                productIds.add(103);

                // Adding a duplicate ID
                productIds.add(101);

                System.out.println("Unique Product IDs: " + productIds);

                /**
                 * Scenario 3: Associating Products with Categories (Map) using HashMap
                 *
                 */

                HashMap<String, String> productCategories = new HashMap<>();
                productCategories.put("Apples", "Fruits");
                productCategories.put("Bananas", "Fruits");
                productCategories.put("Milk", "Dairy");
                System.out.println("Product Categories: " + productCategories);


                /**
                 * Scenario 4: Handling Task Queues (Queue) using LinkedList
                 */
                Queue<String> taskQueue = new LinkedList<>();
                taskQueue.offer("Task 1");
                taskQueue.offer("Task 2");
                taskQueue.offer("Task 3");
                System.out.println("Tasks in Queue: " + taskQueue);

                while (!taskQueue.isEmpty()) {
                    String task = taskQueue.poll();
                    System.out.println("Processing task: " + task);
                }
            }
        }