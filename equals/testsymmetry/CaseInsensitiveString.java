package equals.testsymmetry;


final class CaseInsensitiveString {

    private String s;

    CaseInsensitiveString(String str) {
        if (str == null)
            throw new NullPointerException();
        this.s = str;
    }


    @Override
    public boolean equals(Object o) { // You don't need check o for null, because it does instanceof
        if (o instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }

        /*
        here breaking the Symmetry!
        метод equals в классе String о строках, нечувствительных к регистру, не догадывается
        this part until return statement has to be deleted
        */
        if (o instanceof String)
            return s.equalsIgnoreCase((String) o);

        return false;
    }
}
