import java.awt.*;

public class Point {
    private static Point earthquakeOrigin = new Point(0,0);
    private static int earthquakeImpactRadiusInPixels = 50;

    private int x;
    private int y;

    public Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }

    public Point() {
        this(0,0);
    }

    public Point(double r, int angleInDegrees) {
        this((int) (r * Math.cos(Math.toRadians(angleInDegrees))), (int) (r* Math.sin(Math.toRadians(angleInDegrees))));
    }

    public Point(double r, double angleInRadians) {
        this((int) (r * Math.cos(angleInRadians)), (int) (r* Math.sin(angleInRadians)));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public static void setEarthquakeOrigin(Point p) {
        earthquakeOrigin = p;
    }

    public static void setEarthquakeImpactRadiusInPixels(int radius) {
        earthquakeImpactRadiusInPixels = radius;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void draw(Graphics g) {
        if (distanceToEarthquakeOriginInPixels() <= earthquakeImpactRadiusInPixels) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.BLACK);
        }
        g.fillOval(x,y,3,3);
        g.drawString(this.toString(), x+5, y-5);
    }

    public static void drawEarthquakeOrigin(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(earthquakeOrigin.x, earthquakeOrigin.y, 3, 3);
        g.drawString(earthquakeOrigin.toString(), earthquakeOrigin.x+5, earthquakeOrigin.y-5);

        int radius = 5;
        while (radius <= earthquakeImpactRadiusInPixels) {
            g.drawOval(earthquakeOrigin.x - radius, earthquakeOrigin.y - radius, 2 * radius, 2 * radius);
            radius += 5;
        }
    }

    private double distanceToEarthquakeOriginInPixels() {
        return Math.sqrt(Math.pow(earthquakeOrigin.x - x,2) + Math.pow(earthquakeOrigin.y -y, 2));
    }

    public double distanceFromOrigin() {
        return Math.sqrt(x*x+y*y);
    }

    public double distanceTo(Point p) {
        return Math.sqrt(Math.pow(p.getX()-x,2)+Math.pow(p.getY()-y,2));
    }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
}