package equals.testsymmetry;

class TestSymmetry {
    public static void main(String[] args) {

        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String str = "polish";

        System.out.println(cis.equals(str)); // true
        System.out.println(str.equals(cis)); // false - symmetry isn't kept

    }
}
