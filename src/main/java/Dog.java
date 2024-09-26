public class Dog extends Animal implements Walkable {
    public Dog(String species, String breed, String name) {
        super(species, breed, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void walk() {
        System.out.println(name+" is walking");
    }
}
