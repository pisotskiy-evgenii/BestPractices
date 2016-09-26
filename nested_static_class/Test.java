package nested_static_class;

class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMeth1();
        OuterClass.outerMeth2();


        OuterClass.InnerClass nested = new OuterClass().new InnerClass(); // !!!
        nested.innerMeth();


        OuterClass.StaticClass nestedStatic = new OuterClass.StaticClass(); // !!!
        nestedStatic.nonStaticMeth();
        OuterClass.StaticClass.staticMeth();
    }
}