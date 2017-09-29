import java.util.ArrayList;
import java.util.List;

/**
 * Created by rc305 on 29/09/2017.
 */
public class Main {

    public static void main(String [] args) {

        List<Animal> animals = new ArrayList<>();

        animals.add(new Cat("Tabby"));
        animals.add(new Cat("Matilda"));
        animals.add(new Dog("Ralf"));
        animals.add(new Dog("Bobby"));
        animals.add(new Sheep("Dolly"));

        for (Animal a: animals){
            System.out.println(a.speak());
        }
    }
}
