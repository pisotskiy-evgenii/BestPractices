package equals.requirements;

/**
 * Always override the method hashCode whenever you override method equals.
 * For every field which you tested in the equals() method, you must calculate a hash code:
 */
class TestRequirements {

    public static void main(String[] args) {
        Person A = new Person(25, true);
        Person B = new Person(25, true);
        Person C = new Person(25, true);
        System.out.println(A.equals(A)); // check for Reflexivity, Must be true

        System.out.println(A.equals(B)); // check for Symmetry, Both must be true
        System.out.println(B.equals(A)); // check for Symmetry, Both must be true

        System.out.println(A.equals(B)); // check for Transitivity, If A equal B -> return true
        System.out.println(B.equals(C)); // check for Transitivity, AND If B equal C -> return true
        System.out.println(A.equals(C)); // check for Transitivity, than A equal C -> must return true

        System.out.println(A.equals(null)); // must return false

        System.out.println("///////////////");


    }
}
