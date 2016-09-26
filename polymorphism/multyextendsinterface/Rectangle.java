package polymorphism.multyextendsinterface;


class Rectangle implements Compare {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // a method for computing
    // the area of the rectangle
    double getArea() {
        return width * height;
    }

    // a method required to implement the Compare interface
    public int isLargerThan(Compare another) {
        Rectangle otherRect = (Rectangle) another;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;
    }
}