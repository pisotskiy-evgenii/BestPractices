package equals.testtransitivity;

class ColorPoint extends Point {
    private final Color color;

    ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {// You don't need check o for null, because it does instanceof
        if (o == this) return true;
        if (o instanceof ColorPoint) {
            return super.equals(o) && ((ColorPoint) o).color == color;
        }
        return false;
    }
}
