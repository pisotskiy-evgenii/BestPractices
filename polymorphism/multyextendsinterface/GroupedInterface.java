package polymorphism.multyextendsinterface;

interface Interface1 {

}

interface Interface2 {

}

interface Interface3 {

}

interface GroupedInterface extends Interface1, Interface2, Interface3 {

    // constants declarations, they implicitly are public, static and final
    double E = 2.718282;
    double Pi = 3.14;

    // method signatures
    void doSomething(int i, double x);

    int doSomethingElse(String s);
}