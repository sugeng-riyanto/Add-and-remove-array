import java.util.ArrayList; // Import ArrayList for dynamic lists
import java.util.List; // Import List interface

public class Main {

    // Method to add a penguin to the list
    public static void addPenguin(List<Penguin> penguins, Penguin newPenguin) {
        penguins.add(newPenguin); // Add the penguin to the list
        System.out.println("Added: " + newPenguin); // Confirm the addition
    }

    // Method to remove a penguin by name
    public static void deletePenguin(List<Penguin> penguins, String name) {
        for (Penguin penguin : penguins) { // Iterate through the list
            if (penguin.getName().equals(name)) { // Check if the name matches
                System.out.println("Removed: " + penguin); // Confirm the removal
                penguins.remove(penguin); // Remove the penguin
                return; // Exit the method
            }
        }
        // If the penguin is not found, display a message
        System.out.println("Penguin with name " + name + " not found!");
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        List<Penguin> penguins = new ArrayList<>(); // Create a dynamic list

        // Add penguins to the list
        addPenguin(penguins, new Penguin("Pingu", "Emperor", 5, 15.3));
        addPenguin(penguins, new Penguin("Skipper", "King", 7, 18.2));
        addPenguin(penguins, new Penguin("Rico", "Adelie", 3, 12.8));

        // Display the current list of penguins
        System.out.println("Current Penguins: " + penguins);

        // Remove a penguin by name
        deletePenguin(penguins, "Skipper");

        // Display the list after deletion
        System.out.println("After Deletion: " + penguins);

        // Attempt to remove a non-existent penguin
        deletePenguin(penguins, "NonExistent");

        // Add more penguins
        addPenguin(penguins, new Penguin("Private", "Little", 2, 10.5));

        // Display the final list
        System.out.println("Final Penguins: " + penguins);
    }
}
