package references;

public class TestInteger {
    public static void main(String[] args) {
        Integer a = 10; // identical reference
        Integer b = new Integer(10); // reference to another object
        Integer c = Integer.valueOf(10); // identical reference
        System.out.println("" +
                (a == b) + "\n" + // false
                (a == c) + "\n" + // true
                (b == c) + "\n" + // false
                a.equals(b) + "\n" + // true
                a.equals(c) + "\n" +  // true
                b.equals(c));// true

        System.out.println("///////////");

        String s = "test"; // identical reference
        String str = new String("test"); // reference to another object
        String sss = String.valueOf("test"); // identical reference
        System.out.println("" +
                (s == str) + "\n" + // false
                (s == sss) + "\n" + // true
                (str == sss) + "\n" + // false
                s.equals(str) + "\n" + // true
                s.equals(sss) + "\n" +  // true
                str.equals(sss));// true
    }
}
