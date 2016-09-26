package equals.test_transitivity;


public class TestTransitivity {
    public static void main(String[] args) {

        Point p = new Point(1, 2);
        ColorPoint colorP = new ColorPoint(1, 2, Color.RED);

        System.out.println(p.equals(colorP)); // true
        System.out.println(colorP.equals(p)); // false

        System.out.println("////////////////");
        int n = 4;
        int[][] g = new int[n][n];
        for (int i = 0; i < n; i++) {
            g[i][i] = 1;
            for (int j = 0; j < i; j++) {
                g[j][i] = g[i][j] = 2;
            }
        }
        for (int[] i : g) {
            for (int k : i) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }

}
