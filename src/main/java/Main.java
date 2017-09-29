/**
 * Created by rc305 on 29/09/2017.
 */
public class Main {

    public static void main(String [] args) {

        Cat tabby = new Cat("Tabby");
        Cat matilda = new Cat("Matilda");
        Dog ralf = new Dog("Ralf");
        Dog bobby = new Dog("Bobby");
        Sheep dolly = new Sheep("Dolly");

        System.out.println(tabby.speak());
        System.out.println(matilda.speak());
        System.out.println(ralf.speak());
        System.out.println(bobby.speak());
        System.out.println(dolly.speak());
    }
}
