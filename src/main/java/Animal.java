public abstract class Animal {
    protected String species;
    protected String breed;
    protected String name;

    public Animal(String species, String breed, String name) {
        this.species = species;
        this.breed = breed;
        this.name = name;
    }

    public void eat(){
        System.out.println("Eating");
    }

    public abstract void makeSound();

    public String toString(){
        return "Species: " + this.species + ", breed: " + this.breed + ", name: " + this.name;
    }
}
