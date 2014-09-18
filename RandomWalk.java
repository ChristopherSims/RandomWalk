/* Christopher sims
 * Write a program RandomWalk.java 
 * to simulate a 2D random walk and 
 * animate the results. Start at the
 * center of a 2N-by-2N grid. 
 * he current location is displayed
 * in blue; the trail in white.
 * */
import java.awt.Color;
public class RandomWalk { 
    public static void run(int n) {
        int N = n;
        StdDraw.setXscale(-N, +N);
        StdDraw.setYscale(-N, +N);
        StdDraw.clear(StdDraw.BLACK);
        int x = 0, y = 0;
        int steps = 0;
        while (Math.abs(x) < N && Math.abs(y) < N) {
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(x, y, 0.5);
            double r = Math.random();
            if      (r < 0.25) x--;
            else if (r < 0.50) x++;
            else if (r < 0.75) y--;
            else if (r < 1.00) y++;
            steps++;
            StdDraw.setPenColor(new Color((int)(Math.random()* 255),(int)(Math.random()* 255),(int)(Math.random()* 255)));
            StdDraw.filledCircle(x, y, 0.5);
            StdDraw.show(150);
        }
    }
    public static void main(String [] args) {
      RandomWalk.run(50);
    }

}