import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class BranchesSystem implements Serializable {
    private List<Item> restaurantFood = new ArrayList<>();
    public Map<Item, Integer> countOfFood = new TreeMap<>();
    String pathRestuarantFood = "HistoryOfOrder.bin";


    public void saveAllData() {
        saveRestuarantFood();
    }

    private void saveRestuarantFood() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(pathRestuarantFood))) {
            oos.writeObject(restaurantFood);
            oos.flush();
        } catch (IOException e) {
            System.err.println("Error saving Food data: " + e.getMessage());
        }
    }

    public void loadRestuarantFood() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(pathRestuarantFood))) {

            List<Item> saved = (List<Item>) objectInputStream.readObject();
            restaurantFood.addAll(saved);
            System.out.println("Food data loaded successfully from " + pathRestuarantFood);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("No saved food data found.");
        }
    }

    public void addMeal() {

        Meals meal = new Meals();//add describtion
        restaurantFood.add(meal);
        System.out.println("Meal added in restaurant ");

    }

    public void addDrink() {
        Drinks drink = new Drinks();//add description
        restaurantFood.add(drink);
        System.out.println("Drink added in restaurant ");

    }

    public void addSnack() {
        Snacks snack = new Snacks();//add description
        restaurantFood.add(snack);
        System.out.println("Snack added in restaurant ");
    }

    public boolean thereIsNoFood() {
        return restaurantFood.isEmpty();
    }
}
