package Ball;
public class Ball {
    private String color;
    private String type;
    public Ball( String c, String t) {
        this.color = c;
        this.type = t;
    }

    public Ball(double d, String c) {
        this.color = c;
        this.type = "basketball";
    }

    public Ball(double d) {
        this.color = "blue";
        this.type = "football";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return " цвет: " + this.color + ", тип: " + this.type ;
    }
}
