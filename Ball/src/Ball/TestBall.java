
package Ball;

import java.lang.*;
public class TestBall{
    public static void main(String [] args) {
        Ball d1 = new Ball("Black", 5);
        Ball d2 = new Ball("Blue", 4);
        Ball d3 = new Ball("Red");
        d3.setSize(3);
        System.out.println(d1);
        d1.intoSize();
        d2.intoSize();
        d3.intoSize();
    }
}