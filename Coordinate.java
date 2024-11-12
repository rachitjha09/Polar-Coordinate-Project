public class Coordinate {
    private final double x;
    private final double y;

    private Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static Coordinate fromRectangular(double x, double y) {
        return new Coordinate(x, y);
        /*
        double r=Math.sqrt(x*x+y*y);
        double theta = Math.atan(y/x);
        Coordinate c=new Coordinate(r, theta);

        return c;
         */
    }
    public static Coordinate fromPolar(double r, double theta) {

        return new Coordinate(r*Math.cos(theta), r*Math.sin(theta));
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "( "+x+", "+ y + " )";
    }
}
