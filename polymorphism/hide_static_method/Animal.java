package polymorphism.hide_static_method;

class Animal {

    static void testClassMethod() {
        System.out.println("The static method in Animal");
    }


    void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}