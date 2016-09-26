package polymorphism.hide_fields;

class Test {

    public static void main(String[] args) {
        Subclass s = new Subclass();
        s.printMethod();
        /*
        Printed in Superclass.
        Printed in Subclass
         */
    }
}
