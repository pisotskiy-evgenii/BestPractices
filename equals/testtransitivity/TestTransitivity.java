package equals.testtransitivity;


public class TestTransitivity {
    public static void main(String[] args) {

        Point p = new Point(1, 2);
        ColorPoint colorP = new ColorPoint(1, 2, Color.RED);

        System.out.println(p.equals(colorP)); // true
        System.out.println(colorP.equals(p)); // false

        System.out.println("////////////////");

    }

}
