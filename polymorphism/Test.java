package polymorphism;

class A {
    void m1() {
        System.out.println("A-m1");
    }

    void m2() {
        System.out.println("A-m2");
    }
}

class B extends A {
    void m1() {
        System.out.println("B override from A-m1");
    }

    void f() {
        System.out.println("B-f");
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new B();
        a.m1(); // overridden called from B
        a.m2(); // inherit called from A
        //a.f(); // ERROR compilation, because f() unknown for A
        ((B) a).f(); // you can only like that, according A a = new B();

        A a1 = new A();
        a1.m1(); // from A called
        a1.m2(); // from A called
        //a.f(); // ERROR compilation, because f() unknown for A
        /*!!!*/
        ((B) a1).f(); // ERROR RUN-TIME, because reference a1 wasn't linked with any B object

        B b = new B();
        b.m1(); // overridden called from B
        b.m2(); // inherit called from A
        b.f(); // from B called

        // B b1 = new A(); // ERROR compilation, only new B() required
        /*!!!*/
        B b2 = ((B) new A()); // ERROR RUN-TIME, because new A() wasn't linked with any B

        // B b3 = a; // ERROR compilation, only new B() required
        /*!!!*/
        B b4 = ((B) a1); // ERROR RUN-TIME, because reference a1 wasn't linked with any B

        B b5 = ((B) a);  // only like that, because reference a was linked with B here A a = new B();
        b5.m1(); // overridden called from B
        b5.m2(); // inherit called from A
        b5.f(); // from B called

        a = b; // can only b
        a = b5; // can only b5

        a = b2; // ERROR RUN-TIME, see above
        a = b4; // ERROR RUN-TIME, see above
    }
}
