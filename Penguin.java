public class Penguin {
    private String name; // Penguin's name
    private String species; // Penguin's species

    public Penguin(String name, String species) {
        this.name = name; // Initialize name
        this.species = species; // Initialize species
    }

    public String getName() {
        return name; // Return the penguin's name
    }

    public String getSpecies() {
        return species; // Return the penguin's species
    }

    @Override
    public String toString() {
        return "Penguin{name='" + name + "', species='" + species + "'}";
    }
}
