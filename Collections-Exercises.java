import java.util.ArrayList;

    public class Exercise1 {
        public static void main(String[] args) {

            ArrayList<String> shoppingList = new ArrayList<>();

            shoppingList.add("Milk");
            shoppingList.add("Bread");
            shoppingList.add("Eggs");
            shoppingList.add("Butter");
            shoppingList.add("Cheese");

            System.out.println("Shopping List:");

            for (int i = 0; i < shoppingList.size(); i++) {
                System.out.println((i + 1) + ". " + shoppingList.get(i));
            }

            shoppingList.remove("Butter");

            System.out.println("\nUpdated Shopping List:");

            for (int i = 0; i < shoppingList.size(); i++) {
                System.out.println((i + 1) + ". " + shoppingList.get(i));
            }
        }
    }




import java.util.HashSet;

    public class Exercise2 {
        public static void main(String[] args) {

            HashSet<String> cities = new HashSet<>();

            cities.add("Stockholm");
            cities.add("Gothenburg");
            cities.add("Malmö");
            cities.add("Stockholm");
            cities.add("Uppsala");
            cities.add("Gothenburg");
            cities.add("Lund");

            System.out.println("Unique Cities:");

            for (String city : cities) {
                System.out.println(city);
            }

            System.out.println("\nTotal unique cities: " + cities.size());
        }
    }


    import java.util.HashMap;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Alice", "0701234567");
        phoneBook.put("Bob", "0709876543");
        phoneBook.put("Charlie", "0701112222");
        phoneBook.put("David", "0703334444");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        if (phoneBook.containsKey(name)) {
            System.out.println("Phone number: " + phoneBook.get(name));
        } else {
            System.out.println("Contact not found.");
        }

        scanner.close();
    }
}


import java.util.ArrayList;
import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(14, 3, 78, 45, 22, 91, 7, 56));

        int largest = numbers.get(0);

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest number: " + largest);
    }
}
