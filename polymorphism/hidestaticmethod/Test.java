package polymorphism.hidestaticmethod;

class Test {

    public static void main(String[] args) {
        Animal myAnimal = new Cat();

        Animal.testClassMethod(); // The static method in Animal
        Cat.testClassMethod(); // The static method in Cat
        myAnimal.testInstanceMethod(); // The instance method in Cat
    }
}
