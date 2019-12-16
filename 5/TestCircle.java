import java.lang.*;
import java.util.Scanner;


public class TestCircle {
    public static void main(String[] args) {
        double r;
        Circle k1 = new Circlee(3.1, 4.1, 5.1, "red");
        System.out.println("Длина окружности = " + k1.getLength() + "см.\n");
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус: ");
        r = source.nextDouble();
        k1.setR(r);
        System.out.println("\nДлина окружности = " + k1.getLength() + "см.");
    }
}
