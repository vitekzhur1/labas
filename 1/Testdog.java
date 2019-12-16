package Dog;
import java.lang.*;
public class Testdog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Soni", 41, "pink");
        Dog d2 = new Dog("Jesika", 9);
        Dog d3 = new Dog("Lera");
        d3.setAge(1);
        d3.setColor("white");

        System.out.println(d1);
        d1.intoHumanAge();

        System.out.println(d2);
        d2.intoHumanAge();

        System.out.println(d3);
        d3.intoHumanAge();
    }
}
