package polymorphism.hidestaticmethod;

class Animal {

    static void testClassMethod() {
        System.out.println("The static method in Animal");
    }


    void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}