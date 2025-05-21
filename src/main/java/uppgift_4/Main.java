package uppgift_4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Bird bird = new Bird();
        Dog dog = new Dog();

        animals.add(bird);
        animals.add(dog);

        // Loopa igenom och kalla på speak()
        for (Animal animal : animals) {
            animal.speak();
        }
    }
}
