package equals.testtransitivity;

class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) { // You don't need check o for null, because it does instanceof
        if (o == this) return true;
        if (o instanceof Point) {
            Point p = (Point) o;
            return x == p.x && y == p.y;
        }
        return false;
    }

}




