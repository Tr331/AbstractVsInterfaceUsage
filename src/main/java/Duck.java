public class Duck extends Animal implements Flyable{
    public Duck(String species, String breed, String name) {
        super(species, breed, name);
    }

    @Override
    public void makeSound() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println(name+ " is flying");
    }
}
