
# **Penguin Manager in Java**

Welcome to the **Penguin Manager Project**! This project is designed to teach you how to manage a list of penguins using Java. You will learn how to:

-   Create and use Java classes.
-   Add, remove, and list penguins dynamically.
-   Use basic and advanced Java programming techniques.

By the end of this project, you’ll have a solid understanding of Java basics and Object-Oriented Programming (OOP) concepts.

----------

## **Key Concepts**

1.  **Classes and Objects**: Learn how to define a class (`Penguin`) and create objects.
2.  **Methods**: Write methods to add and remove objects from a collection.
3.  **Data Structures**: Use arrays and ArrayLists to manage collections of objects.
4.  **Dynamic Lists**: Understand the difference between fixed-size arrays and resizable lists.

----------

## **Getting Started**

### **1. Prerequisites**

To complete this project, you need:

-   **Java Development Kit (JDK)** (Version 8 or later). [Download here](https://www.oracle.com/java/technologies/javase-downloads.html).
-   **IntelliJ IDEA** (Community Edition is fine). [Download here](https://www.jetbrains.com/idea/).

----------

### **2. Clone the Project**

To get the project files, open a terminal and run:

bash

Copy code

`git clone https://github.com/your-username/penguin-manager-java.git
cd penguin-manager-java` 

----------

### **3. Project Structure**

Here’s the folder structure of this project:

graphql

Copy code

```
PenguinManager/
├── src/                    # Contains the Java source code
│   ├── Main.java           # Main class with program logic
│   ├── Penguin.java        # Penguin class with attributes and methods
├── .idea/                  # IntelliJ IDEA project files (auto-generated)
├── README.md               # Project documentation (this file)
├── .gitignore              # Files to ignore in version control
└── out/                    # Compiled files (auto-generated during compilation)


```

----------

## **Step-by-Step Instructions**

### **1. Open the Project in IntelliJ IDEA**

1.  Open IntelliJ IDEA.
2.  Go to **File > Open** and select the folder where you cloned the project.
3.  Wait for IntelliJ to index and configure the project.

----------

### **2. Understand the Files**

This project has two main files:

#### **1. Penguin.java**

This file defines the `Penguin` class. It includes:

-   **Attributes**: `name` and `species` to store information about a penguin.
-   **Constructor**: Used to create a new penguin.
-   **Getter Methods**: To access the name and species.
-   **toString Method**: To display penguin details in a readable format.

#### **2. Main.java**

This is the main program file. It:

-   Creates a list of penguins.
-   Adds and removes penguins.
-   Displays the list of penguins at different stages.

----------

### **3. Run the Program**

1.  Open **Main.java**.
2.  Right-click on the code and select **Run 'Main'**.
3.  Observe the output in the console. The program will:
    -   Add penguins to the list.
    -   Remove a penguin by name.
    -   Display the list after each operation.



# Code Explanation
```java
public class Penguin {
    private String name; // Stores the penguin's name
    private String species; // Stores the penguin's species

    // Constructor: Initializes the name and species
    public Penguin(String name, String species) {
        this.name = name;
        this.species = species;
    }

    // Getter for the penguin's name
    public String getName() {
        return name;
    }

    // Getter for the penguin's species
    public String getSpecies() {
        return species;
    }

    // toString method: Converts the Penguin object to a readable string
    @Override
    public String toString() {
        return "Penguin{name='" + name + "', species='" + species + "'}";
    }
}

```
Main.java


```java
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
        addPenguin(penguins, new Penguin("Pingu", "Emperor"));
        addPenguin(penguins, new Penguin("Skipper", "King"));
        addPenguin(penguins, new Penguin("Rico", "Adelie"));

        // Display the current list of penguins
        System.out.println("Current Penguins: " + penguins);

        // Remove a penguin by name
        deletePenguin(penguins, "Skipper");

        // Display the list after deletion
        System.out.println("After Deletion: " + penguins);

        // Attempt to remove a non-existent penguin
        deletePenguin(penguins, "NonExistent");

        // Add more penguins
        addPenguin(penguins, new Penguin("Private", "Little"));

        // Display the final list
        System.out.println("Final Penguins: " + penguins);
    }
}



```
# Sample output


```java
Added: Penguin{name='Pingu', species='Emperor'}
Added: Penguin{name='Skipper', species='King'}
Added: Penguin{name='Rico', species='Adelie'}
Current Penguins: [Penguin{name='Pingu', species='Emperor'}, Penguin{name='Skipper', species='King'}, Penguin{name='Rico', species='Adelie'}]
Removed: Penguin{name='Skipper', species='King'}
After Deletion: [Penguin{name='Pingu', species='Emperor'}, Penguin{name='Rico', species='Adelie'}]
Penguin with name NonExistent not found!
Added: Penguin{name='Private', species='Little'}
Final Penguins: [Penguin{name='Pingu', species='Emperor'}, Penguin{name='Rico', species='Adelie'}, Penguin{name='Private', species='Little'}]
```





