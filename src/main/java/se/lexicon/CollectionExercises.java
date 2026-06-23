package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

// -mvn clean package
// -java -jar target/arrays-collections.jar
public class CollectionExercises {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise11();
        exercise12();
        exercise13();
        exercise14();
        exercise15();
        exercise16();
        exercise17();

        scanner.close();
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 1 – Shopping List
    // You are managing a shopping list.
    // - Create an ArrayList<String> and add 5 items
    // - Print all items numbered (1, 2, 3...)
    // - Remove one item by name
    // - Print the updated list
    //
    public static void exercise1() {
        System.out.println("Exercise 1 – Shopping List\n");

        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println("Creating a shopping list and adding 5 items...");

        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");
        shoppingList.add("Butter");
        shoppingList.add("Cheese");

        System.out.println("\nShopping List:");

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }

        System.out.println("\nRemoving Butter from the list...");
        shoppingList.remove("Butter");

        System.out.println("\nUpdated Shopping List:");

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 2 – Unique Cities
    // Given a list of cities where some appear more than once:
    // Stockholm, Gothenburg, Malmö, Stockholm, Uppsala, Gothenburg, Lund
    // - Store them in a collection that automatically handles duplicates
    // - Print all unique cities and the total count
    //
    public static void exercise2() {
        System.out.println("Exercise 2 – Unique Cities\n");

        HashSet<String> cities = new HashSet<>();

        System.out.println("Adding cities to a HashSet...");
        System.out.println("A HashSet automatically removes duplicates.\n");

        cities.add("Stockholm");
        cities.add("Gothenburg");
        cities.add("Malmö");
        cities.add("Stockholm");
        cities.add("Uppsala");
        cities.add("Gothenburg");
        cities.add("Lund");

        System.out.println("Unique Cities:");

        for (String city : cities) {
            System.out.println("- " + city);
        }

        System.out.println("\nTotal unique cities: " + cities.size());

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 3 – Phone Book
    // Build a simple phone book.
    // - Store at least 4 contacts as name -> phone number pairs
    // - Ask the user to enter a name and look it up
    // - Print the phone number if found, or "Contact not found." if not
    //
    public static void exercise3() {
        System.out.println("Exercise 3 – Phone Book\n");

        HashMap<String, String> phoneBook = new HashMap<>();

        System.out.println("Creating a phone book using a HashMap...");
        System.out.println("Each contact is stored as: name -> phone number\n");

        phoneBook.put("Alice", "0701234567");
        phoneBook.put("Bob", "0709876543");
        phoneBook.put("Charlie", "0701112222");
        phoneBook.put("David", "0703334444");

        System.out.println("Alice, Bob, Charlie, and David have been added to the phone book.\n");
        System.out.print("Enter a name to search for: ");
        String name = scanner.nextLine();

        System.out.println("\nSearching phone book...");

        if (phoneBook.containsKey(name)) {
            System.out.println("Phone number: " + phoneBook.get(name));
        } else {
            System.out.println("Contact not found.");
        }

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 4 – Find the Largest
    // Given this list of numbers: 14, 3, 78, 45, 22, 91, 7, 56
    // - Find and print the largest number
    // - Do not use Collections.max() — use a loop
    //
    public static void exercise4() {
        System.out.println("Exercise 4 – Find the Largest\n");

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(14, 3, 78, 45, 22, 91, 7, 56));

        System.out.println("Numbers:");
        System.out.println(numbers);

        System.out.println("\nSearching for the largest number using a loop...");

        int largest = numbers.get(0);

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest number found: " + largest);

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 5 – Count by Letter
    // Given a list of names:
    // Anna, Bob, Alice, Charlie, Amanda, David, Amy, Brian
    // - Ask the user to enter a letter
    // - Count and print how many names start with that letter
    // - The comparison should be case-insensitive
    //
    public static void exercise5() {
        System.out.println("Exercise 5 – Count by Letter\n");

        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Anna", "Bob", "Alice", "Charlie",
                "Amanda", "David", "Amy", "Brian"));

        System.out.println("Names:");
        System.out.println(names);

        System.out.print("\nEnter a letter: ");
        String input = scanner.nextLine();

        char letter = Character.toLowerCase(input.charAt(0));

        System.out.println("\nCounting names that start with '" + input + "'...");
        System.out.println("The comparison is case-insensitive.");

        int count = 0;

        for (String name : names) {
            if (Character.toLowerCase(name.charAt(0)) == letter) {
                count++;
            }
        }

        System.out.println("\nNames starting with '" + input + "': " + count);

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 6 – Word Frequency
    // Given a list of words:
    // apple, banana, apple, orange, banana, apple, grape, orange
    // - Count how many times each word appears
    // - Print each word and its count, sorted alphabetically
    //
    public static void exercise6() {
        System.out.println("Exercise 6 – Word Frequency\n");

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "apple", "banana", "apple", "orange",
                "banana", "apple", "grape", "orange"));

        System.out.println("Words:");
        System.out.println(words);

        System.out.println("\nCounting how many times each word appears...");
        System.out.println("Using a TreeMap so the words are sorted alphabetically.");

        TreeMap<String, Integer> frequencyMap = new TreeMap<>();

        for (String word : words) {
            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }

        System.out.println("\nWord Frequency:");

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 7 – Remove Duplicates, Keep Order
    // Given this list of numbers: 4, 7, 2, 7, 9, 4, 1, 9, 3
    // - Produce a new list with duplicates removed
    // - Preserve the original order
    // - Use a collection to track what has already been seen
    //
    public static void exercise7() {
        System.out.println("Exercise 7 – Remove Duplicates, Keep Order\n");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                4, 7, 2, 7, 9, 4, 1, 9, 3));

        System.out.println("Original list:");
        System.out.println(numbers);

        System.out.println("\nRemoving duplicates while keeping the original order...");
        System.out.println("Using a HashSet to track numbers that have already been seen.");

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        for (Integer number : numbers) {
            if (!seen.contains(number)) {
                seen.add(number);
                uniqueNumbers.add(number);
            }
        }

        System.out.println("\nResult:");
        System.out.println(uniqueNumbers);

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 8 – Merge Without Duplicates
    // Given two lists:
    // List A: 1, 2, 3, 4, 5
    // List B: 3, 4, 5, 6, 7
    // - Merge them into a single collection with no duplicates
    // - Print the result and the total count
    //
    public static void exercise8() {
        System.out.println("Exercise 8 – Merge Without Duplicates\n");

        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5));

        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(
                3, 4, 5, 6, 7));

        System.out.println("List A:");
        System.out.println(listA);

        System.out.println("\nList B:");
        System.out.println(listB);

        System.out.println("\nMerging lists and removing duplicates...");
        System.out.println("Using a LinkedHashSet so duplicates are removed and insertion order is kept.");

        LinkedHashSet<Integer> merged = new LinkedHashSet<>();

        merged.addAll(listA);
        merged.addAll(listB);

        System.out.println("\nMerged collection:");
        System.out.println(merged);

        System.out.println("Total count: " + merged.size());

        System.out.println("\n----------------------------");
    }


    //------------------------------------------------------------------------------------------------------------------
    // Exercise 9 – Choose Your Collection: Submission Tracker
    // You are building a homework submission tracker.
    // - A student can only submit once
    // - Duplicates must be rejected with a message
    // - You only need to know whether a student has submitted, not what they submitted
    // - The order submissions arrived in does not matter
    //
    public static void exercise9() {    System.out.println("Exercise 9 – Choose Your Collection: Submission Tracker\n");

        System.out.println("Chosen collection: HashSet");
        System.out.println("Reason: A HashSet does not allow duplicates.");
        System.out.println("We only need to know whether a student has submitted or not.\n");

        HashSet<String> submissions = new HashSet<>();

        String[] students = {
                "Anna",
                "Bob",
                "Charlie",
                "David",
                "Anna",
                "Emma",
                "Bob",
                "Fredrik"
        };

        System.out.println("Processing submissions...\n");

        for (String student : students) {
            System.out.println("Submission received from: " + student);

            if (!submissions.add(student)) {
                System.out.println("Rejected duplicate submission from: " + student);
            }
        }

        System.out.println("\nSubmitted students:");

        for (String student : submissions) {
            System.out.println("- " + student);
        }

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 10 – Choose Your Collection: Concert Queue
    // You are managing a waiting queue outside a concert venue.
    // - People join the back of the queue
    // - People are let in from the front
    // - This means first in, first out
    // - You need to add people and remove the next person efficiently
    //
    public static void exercise10() {   System.out.println("Exercise 10 – Choose Your Collection: Concert Queue\n");

        System.out.println("Chosen collection: Queue");
        System.out.println("Reason: A queue follows FIFO: first in, first out.");
        System.out.println("People join at the back and are let in from the front.\n");

        Queue<String> queue = new LinkedList<>();

        System.out.println("Adding people to the queue...");

        queue.add("Anna");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("David");
        queue.add("Emma");
        queue.add("Fredrik");

        System.out.println("\nCurrent queue:");
        System.out.println(queue);

        System.out.println("\nLetting 2 people into the venue...");

        System.out.println("Letting in: " + queue.poll());
        System.out.println("Letting in: " + queue.poll());

        System.out.println("\nRemaining queue:");

        for (String person : queue) {
            System.out.println("- " + person);
        }

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 11 – Choose Your Collection: Student Grades
    // You need to store and look up student grades by name.
    // - Each student has exactly one grade
    // - You need to find a student's grade quickly by name
    // - You also need to print all students sorted by grade from highest to lowest
    //
    public static void exercise11() {   System.out.println("Exercise 11 – Choose Your Collection: Student Grades\n");

        System.out.println("Chosen collection: HashMap");
        System.out.println("Reason: A HashMap stores data as key-value pairs.");
        System.out.println("The student name is the key, and the grade is the value.");
        System.out.println("For sorting, the HashMap entries are copied into an ArrayList and sorted by grade.\n");

        HashMap<String, Integer> grades = new HashMap<>();

        grades.put("Anna", 88);
        grades.put("Bob", 72);
        grades.put("Charlie", 95);
        grades.put("David", 64);
        grades.put("Emma", 91);
        grades.put("Fredrik", 79);

        System.out.println("Student grades:");
        System.out.println(grades);

        System.out.println("\nLooking up Emma's grade quickly by name...");
        System.out.println("Emma's grade: " + grades.get("Emma"));

        ArrayList<Map.Entry<String, Integer>> sortedGrades = new ArrayList<>(grades.entrySet());

        sortedGrades.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("\nStudents sorted by grade, highest to lowest:");

        for (Map.Entry<String, Integer> entry : sortedGrades) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 12 – Group by First Letter
    // Given a list of names:
    // Alice, Bob, Anna, Charlie, Brian, Amanda, Carl
    // - Group the names by their first letter
    // - Print each group
    //
    public static void exercise12() {
        System.out.println("Exercise 12 – Group by First Letter\n");

        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "Alice", "Bob", "Anna", "Charlie", "Brian", "Amanda", "Carl"));

        System.out.println("Names:");
        System.out.println(names);

        System.out.println("\nGrouping names by their first letter...");

        TreeMap<Character, ArrayList<String>> groupedNames = new TreeMap<>();

        for (String name : names) {
            char firstLetter = name.charAt(0);

            if (!groupedNames.containsKey(firstLetter)) {
                groupedNames.put(firstLetter, new ArrayList<>());
            }

            groupedNames.get(firstLetter).add(name);
        }

        System.out.println("\nGrouped names:");

        for (Map.Entry<Character, ArrayList<String>> entry : groupedNames.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 13 – Most Frequent Word
    // Given a list of words:
    // cat, dog, cat, bird, dog, cat, fish, dog, dog
    // - Find the word that appears most often
    // - Print it and its count
    //
    public static void exercise13() {
        System.out.println("Exercise 13 – Most Frequent Word\n");

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "cat", "dog", "cat", "bird", "dog", "cat", "fish", "dog", "dog"));

        System.out.println("Words:");
        System.out.println(words);

        System.out.println("\nCounting how many times each word appears...");

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        String mostFrequentWord = "";
        int highestCount = 0;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > highestCount) {
                mostFrequentWord = entry.getKey();
                highestCount = entry.getValue();
            }
        }

        System.out.println("\nMost frequent word: " + mostFrequentWord);
        System.out.println("Count: " + highestCount);

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 14 – Common Elements
    // Given two lists:
    // List A: 1, 3, 5, 7, 9, 11
    // List B: 3, 6, 9, 12, 15
    // - Find all elements that appear in both lists
    // - Each element should appear only once in the result
    // - Print the common elements
    //
    public static void exercise14() {
        System.out.println("Exercise 14 – Common Elements\n");

        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(
                1, 3, 5, 7, 9, 11));

        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(
                3, 6, 9, 12, 15));

        System.out.println("List A:");
        System.out.println(listA);

        System.out.println("\nList B:");
        System.out.println(listB);

        System.out.println("\nFinding numbers that exist in both lists...");

        HashSet<Integer> setA = new HashSet<>(listA);
        LinkedHashSet<Integer> commonElements = new LinkedHashSet<>();

        for (Integer number : listB) {
            if (setA.contains(number)) {
                commonElements.add(number);
            }
        }

        System.out.println("\nCommon elements:");
        System.out.println(commonElements);

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 15 – Two Sum
    // Given a list of integers and a target number:
    // Numbers: 2, 7, 11, 15, 4, 6
    // Target: 13
    // - Find two numbers in the list that add up to the target and print them
    // - Solve this without using a nested loop
    //
    public static void exercise15() {
        System.out.println("Exercise 15 – Two Sum\n");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                2, 7, 11, 15, 4, 6));

        int target = 13;

        System.out.println("Numbers:");
        System.out.println(numbers);

        System.out.println("\nTarget: " + target);
        System.out.println("Using a HashSet to check quickly if the needed number has already been seen.");

        HashSet<Integer> seen = new HashSet<>();

        for (Integer number : numbers) {
            int neededNumber = target - number;

            if (seen.contains(neededNumber)) {
                System.out.println("\nPair found: " + neededNumber + " + " + number + " = " + target);
                System.out.println("\n----------------------------");
                return;
            }

            seen.add(number);
        }

        System.out.println("\nNo pair found.");

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 16 – Second Largest
    // Given a list of numbers:
    // 34, 78, 23, 78, 91, 56, 91, 12
    // - Find the second-largest unique value
    // - Do not sort the list
    //
    public static void exercise16() {
        System.out.println("Exercise 16 – Second Largest\n");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                34, 78, 23, 78, 91, 56, 91, 12));

        System.out.println("Numbers:");
        System.out.println(numbers);

        System.out.println("\nSearching for the largest and second largest unique values without sorting...");

        Integer largest = null;
        Integer secondLargest = null;

        for (Integer number : numbers) {
            if (largest != null && number.equals(largest)) {
                continue;
            }

            if (secondLargest != null && number.equals(secondLargest)) {
                continue;
            }

            if (largest == null || number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (secondLargest == null || number > secondLargest) {
                secondLargest = number;
            }
        }

        System.out.println("\nLargest unique value: " + largest);
        System.out.println("Second largest unique value: " + secondLargest);

        System.out.println("\n----------------------------");
    }

    //------------------------------------------------------------------------------------------------------------------
    // Exercise 17 – Top 3 Most Frequent
    // Given a list of words:
    // java, python, java, c++, python, java, ruby, c++, python, ruby, java
    // - Find the 3 most frequently occurring words
    // - Print them in order from most to least frequent
    //
    public static void exercise17() {
        System.out.println("Exercise 17 – Top 3 Most Frequent\n");

        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "java", "python", "java", "c++", "python", "java",
                "ruby", "c++", "python", "ruby", "java"));

        System.out.println("Words:");
        System.out.println(words);

        System.out.println("\nCounting word frequencies...");

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        ArrayList<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCounts.entrySet());

        sortedWords.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("\nTop 3 most frequent words:");

        for (int i = 0; i < 3 && i < sortedWords.size(); i++) {
            Map.Entry<String, Integer> entry = sortedWords.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\n----------------------------");
    }

}
