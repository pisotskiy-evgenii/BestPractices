package polymorphism.multyextendsinterface;

public class Test {

    public static void main(String[] args) {

        Rectangle rightRec = new Rectangle(4, 4); // getArea() == 16
        Rectangle wrongRec = new Rectangle(3, 5); // getArea() == 15

        int compare = rightRec.isLargerThan(wrongRec);

        if (compare == 1)
            System.out.print("Yes"); // Yes
        else if (compare == 0)
            System.out.print("Equal");
        else
            System.out.print("NO");

    }
}
