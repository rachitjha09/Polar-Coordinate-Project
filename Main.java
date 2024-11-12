//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coordinate c1= Coordinate.fromRectangular(2.3, 3.7);
        Coordinate p1=Coordinate.fromPolar(5.6, 1.57);
        System.out.printf("(%.2f, %.2f )", c1.getX(),c1.getY());
        System.out.println();
        System.out.printf("(%.2f, %.2f )", p1.getX(),p1.getY());
    }
}