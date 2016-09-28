package nested_static_class;

/*
 * Static nested classes has access to only static members of the enclosing class,
 * even if they are declared private. Can have static and non-static declarations
 *
 * Non-static nested class can't have static declarations (fields or methods), but static final fields can have!!!
 * Non-static nested class can't be declared in static context (in static class or with static modifier)
 * Non-static nested class only has access to static and non-static members of the
 * enclosing class, even if they are declared private.
 */

class OuterClass {
    static StaticClass sc2 = new StaticClass();
    private static int staticOuter = 20;
    StaticClass sc1 = new StaticClass();
    InnerClass ic1 = new InnerClass();
    private int outer = 10;
    // static InnerClass ic2 = new InnerClass(); // can't be declared in static context

    static void outerMeth2() {
        // InnerClass ic = new InnerClass(); // can't be declared in static context (static method)

        StaticClass.staticMeth();
        StaticClass sc = new StaticClass();
        sc.nonStaticMeth();
        //StaticClass.field; // not available, because private
    }

    void outerMeth1() {
        System.out.println(/*fields and methods from InnerClass isn't available in OuterClass*/);
        InnerClass ic = new InnerClass(); // only with object
        ic.innerMeth(); // only with object
        ic.innerField = 0; //  only with object, even innerField is private

        StaticClass.staticMeth();
        StaticClass sc = new StaticClass();
        sc.nonStaticMeth();
        // StaticClass.field; // not available, because private
    }

    static class StaticClass {
        static OuterClass oc2 = new OuterClass();
        private static int field2; // static declaration

        OuterClass oc1 = new OuterClass();
        private int field = staticOuter; // only static fields and methods are available, even private

        // InnerClass ic1 = new InnerClass(); // can't be declared in static context (class)
        // static InnerClass ic1 = new InnerClass(); // can't be declared with static modifier

        static void staticMeth() {
            // outer++; // non-static, in static class and static method
            // outerMeth1(); // non-static, in static class and static method
            // field++; // non-static, in static class and static method

            outerMeth2(); // static
            staticOuter++; // static, even private
        }

        void nonStaticMeth() {
            // outer++; // even here in non-static method, because in static class
            // outerMeth1(); // even here in non-static method, because in static class

            outerMeth2(); // static
            staticOuter++; // static, even private
            field = field + 1; // non-static
        }
    }

    class InnerClass {
        private static final double PI = 3.14;

        // private static int i; // inner class can't have static declarations
        OuterClass oc = new OuterClass(); // only as non-static
        /*
        static void innerMeth2(){ // inner class can't have static declarations

        }
         */
        StaticClass sc = new StaticClass(); // only as non-static
        InnerClass ic = new InnerClass(); // only as non-static
        private int innerField = (outer + staticOuter); // static and non-static, even private

        void innerMeth() {
            outerMeth1(); // non-static
            outerMeth2(); // static
            innerField = innerField + 1;

            // static class with their methods
            StaticClass.staticMeth();
            StaticClass sc = new StaticClass();
            sc.nonStaticMeth();
        }
    }
}



