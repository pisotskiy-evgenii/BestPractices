package polymorphism.multi_extends_interface;

interface Interface1 {

}

interface Interface2 {

}

interface Interface3 {

}

/*
 * Interface is a reference type, similar to a class, that can contain
 * only constants, method signatures, default methods, static methods, and nested types.
 * Interfaces cannot be instantiated—they can only be implemented by classes or
 * extended by other interfaces.
 * interface can extend any number of interfaces.
 */

interface Compare extends Interface1, Interface2, Interface3 {

    // constants declarations, they implicitly are public, static and final
    double E = 2.718282;
    double Pi = 3.14;

    /**
     * Must be instance the same returns 1, 0, -1
     *
     * @param another any comparable object
     * @return 1 if this is greater, than another
     * 0 if this is equal to another,
     * -1 if this is less than another
     */
    int isLargerThan(Compare another);
}