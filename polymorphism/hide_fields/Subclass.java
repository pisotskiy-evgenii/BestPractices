package polymorphism.hide_fields;

/*
 * Within a class, a field that has the same name as a field in the superclass
 * hides the superclass's field, even if their types are different.
 * Within the subclass, the field in the superclass cannot be referenced by its simple name.
 * Instead, the field must be accessed through super.
 */
class Subclass extends Superclass {

    @Override
    void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
    }
}