public class Penguin {
    private String name; // Penguin's name
    private String species; // Penguin's species
    private int age; // Penguin's age
    private double weight; // Penguin's weight in kilograms

    // Constructor: Initializes the name, species, age, and weight
    public Penguin(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    // Getter for the penguin's name
    public String getName() {
        return name;
    }

    // Getter for the penguin's species
    public String getSpecies() {
        return species;
    }

    // Getter for the penguin's age
    public int getAge() {
        return age;
    }

    // Getter for the penguin's weight
    public double getWeight() {
        return weight;
    }

    // toString method: Converts the Penguin object to a readable string
    @Override
    public String toString() {
        return "Penguin{name='" + name + "', species='" + species + "', age=" + age + ", weight=" + weight + "kg}";
    }
}
