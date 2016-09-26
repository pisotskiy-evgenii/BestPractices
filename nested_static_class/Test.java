package nested_static_class;

class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMeth1();
        OuterClass.outerMeth2();


        OuterClass.InnerClass inner = new OuterClass().new InnerClass(); // !!!
        inner.innerMeth();


        OuterClass.StaticClass innerStat = new OuterClass.StaticClass(); // !!!
        innerStat.nonStaticMeth();
        OuterClass.StaticClass.staticMeth();
    }
}