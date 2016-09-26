package nestedclass;

/*
 * Non-static nested classes (innerField classes) have access to
 * other members of the enclosing class, even if they are declared private.
 *
 * Static nested classes don't have access to other members of the enclosing class, if
 * they not-static.
 *
 * Static nested classes have access only to static members of the enclosing class
 */

class OuterClass {
    private static int staticOuter = 20;
    private int outer = 10;

    static void outerMeth2() {
        System.out.println(/*fields and methods from InnerClass isn't available in OuterClass*/);
        // new InnerClass().innerMeth(); // not available, because non-static
        // new InnerClass().innerField = 0; // not available, because non-static

        StaticClass.staticMeth();
        StaticClass sc = new StaticClass();
        sc.nonStaticMeth();
        //StaticClass.field; // not available, because private
    }

    void outerMeth1() {
        System.out.println(/*fields and methods from InnerClass isn't available in OuterClass*/);
        new InnerClass().innerMeth(); // only with object
        new InnerClass().innerField = 0; //  only with object, even innerField is private

        StaticClass.staticMeth();
        StaticClass sc = new StaticClass();
        sc.nonStaticMeth();
        // StaticClass.field; // not available, because private
    }

    static class StaticClass {
        private int field = staticOuter; // only static fields are available

        static void staticMeth() {
            // outerMeth1(); // not available, because non-static
            // field++; // not available, because non-static
            outerMeth2(); // static
            staticOuter++;
        }

        void nonStaticMeth() {
            //outerMeth1(); // not available, even here in non-static method, because static class
            outerMeth2(); // static
            field = field + 1;
            staticOuter++;
        }
    }

    class InnerClass {
        private int innerField = (outer + staticOuter); // even outer is private
        // private static int i = 0; // inner class can't have static declarations

        void innerMeth() {
            outerMeth1();
            outerMeth2(); // static
            innerField = innerField + 1;
        }

        //static void innerMeth2(){ } // inner class can't have static declarations
    }

}



