package polymorphism.hidestaticmethod;

/*
 * The distinction between hiding a static method and overriding an instance method has important
 * implications:
 * The version of the overridden instance method that gets invoked is the one in the subclass.
 * The version of the hidden static method that gets invoked depends on whether it is invoked from
 * the superclass or the subclass.
 */
class Cat extends Animal {

    static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    @Override
    void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
}