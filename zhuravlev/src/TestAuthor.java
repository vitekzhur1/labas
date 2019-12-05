public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Виктор", "vitek.zhur1@gmail.com",'M');
        System.out.println(a1);
        a1.setEmail("vitek.zhur1@gmail.com");
        System.out.println(a1);
    }
}