package equals.requirements;

/**
 * Always override the method hashCode whenever you override method equals.
 * For every field which you tested in the equals() method, you must calculate a hash code:
 */
class Person {
    private int age;
    private boolean married;

    Person(int age, boolean married) {
        this.age = age;
        this.married = married;
    }

    public boolean equals(Object o) { // You don't need check o for null, because it does instanceof
        if (o == this) return true;
        if (o instanceof Person) {
            Person person = ((Person) o);
            return age == person.age && married == person.married;
        }
        return false;
    }
}
