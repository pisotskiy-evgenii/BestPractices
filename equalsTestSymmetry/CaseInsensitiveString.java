package equalsTestSymmetry;


public class CaseInsensitiveString {

    private String s;

    public CaseInsensitiveString(String s) {
        if (s == null)
            throw new NullPointerException();
        this.s = s;
    }

    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
        Object o = s;
        CaseInsensitiveString cis2 = ((CaseInsensitiveString) o);


        System.out.println(cis.equals(s)); // true
        System.out.println(s.equals(cis)); // false
    }

    // Ошибка: нарушение симметрии!
    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);

        if (o instanceof String) // Одностороннее взаимодействие!
            return s.equalsIgnoreCase((String) o);
        return false;
    }
}
