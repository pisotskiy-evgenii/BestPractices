package polymorphism.hidestaticmethod;

class Cat extends Animal {

    static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    @Override
    void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }
}