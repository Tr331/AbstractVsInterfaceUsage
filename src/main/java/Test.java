import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog("Dog","Husky","Five");
        Animal duck = new Duck("Duck","Muscovy duck","Nemo");

        Animal[] animals = new Animal[]{dog,duck};

        Arrays.asList(animals).forEach(a -> {
            System.out.println(a);
            a.eat();
            a.makeSound();

            if(a instanceof Walkable){
                ((Walkable) a).walk();
            }
            if(a instanceof Flyable){
                ((Flyable) a).fly();
            }
        });

    }
}
