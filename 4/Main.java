import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Random m = new Random();
        int array[] = new int[n];
        System.out.println("Случайный массив:");
        for (int i = 0; i < n; i++){
            array[i] = m.nextInt(100);
            System.out.println(array[i]);
        }

        System.out.println("Сортированный массив:");
        Arrays.sort(array);

        for (int i = 0; i < n; i++){
            array[i] = m.nextInt(100);
            System.out.println(array[i]);
        }
    }
}