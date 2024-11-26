import java.util.ArrayList; // For dynamic list management
import java.util.List;

public class Main {
    public static void addPenguin(List<Penguin> penguins, Penguin newPenguin) {
        penguins.add(newPenguin); // Add a penguin to the list
        System.out.println("Added: " + newPenguin);
    }

    public static void deletePenguin(List<Penguin> penguins, String name) {
        for (Penguin penguin : penguins) {
            if (penguin.getName().equals(name)) { // Match penguin by name
                System.out.println("Removed: " + penguin);
                penguins.remove(penguin);
                return;
            }
        }
        System.out.println("Penguin with name " + name + " not found!");
    }

    public static void main(String[] args) {
        List<Penguin> penguins = new ArrayList<>(); // Create a dynamic list

        addPenguin(penguins, new Penguin("Pingu", "Emperor")); // Add a penguin
        addPenguin(penguins, new Penguin("Skipper", "King"));
        addPenguin(penguins, new Penguin("Rico", "Adelie"));

        System.out.println("Current Penguins: " + penguins);

        deletePenguin(penguins, "Skipper"); // Remove a penguin by name
        System.out.println("After Deletion: " + penguins);

        deletePenguin(penguins, "NonExistent"); // Try removing a non-existent penguin
        addPenguin(penguins, new Penguin("Private", "Little"));

        System.out.println("Final Penguins: " + penguins);
    }
}
