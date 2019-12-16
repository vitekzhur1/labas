package Ball;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball( "yellow", "hockey");
        Ball b2 = new Ball( "blue", "football");
        Ball b3 = new Ball( "black", "basketball");

        b3.setColor("red");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}