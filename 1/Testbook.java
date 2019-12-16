package Book;
public class Testbook {
    public static void main(String[] args) {
        Book b1 = new Book("Приключение электроника", "Евгений Велтистов", 91, "женский");
        Book b2 = new Book("Приключение Шерлока Холмса", "Артур Конан Дойль", 1800, "мужской");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
    }
}