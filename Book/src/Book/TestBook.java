package Book;

import java.lang.*;
public class TestBook{
    public static void main(String [] args) {
        Book d1 = new Book("Masha and a bear", 500);
        Book d2 = new Book("Number  the stars", 780);
        Book d3 = new Book("Winnie-the-Pooh");
        d3.setPages(60);
        System.out.println(d1);
        d1.intoPages();
        d2.intoPages();
        d3.intoPages();
    }
}