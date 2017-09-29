/**
 * Created by rc305 on 29/09/2017.
 */
public class Dog implements Animal {

    String name = "";

    public Dog(String name) {
        this.name = name;
    }

    public String speak() {
        return name + " says 'Woof!'";
    }

}
