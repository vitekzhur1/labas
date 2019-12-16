package Book;
public class Book {
    private String title;
    private String author;
    private int pagesCount;
    private String gender;

    public Book(String t, String a, int p, String g){
        title = t;
        author = a;
        pagesCount = p;
        gender = g;
    }
    public Book(String t, String a, int p){
        title = t;
        author = a;
        pagesCount = p;
        gender = "none";
    }
    public Book(String t, String a){
        title = t;
        author = a;
        pagesCount = 0;
        gender = "none";
    }
    public Book(String t){
        title = t;
        author = "none";
        pagesCount = 0;
        gender = "none";
    }
    public Book(){
        title = "none";
        author = "none";
        pagesCount = 0;
        gender = "none";
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }
    public void setGenre(String genre) {
        this.gender = gender;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPagesCount() {
        return pagesCount;
    }
    public String getGenre() {
        return gender;
    }

    public String toString(){
        return "Название: " + this.title + ", автор: " + this.author + ", страниц: " + this.pagesCount + ", гендер: " + this.gender;
    }
}