package equals.requirements;

class Person {
    private int age;
    private boolean married;

    Person(int age, boolean married) {
        this.age = age;
        this.married = married;
    }

    public boolean equals(Object o) {
        if (o == this) return true; // You don't need check o for null, because it does instanceof
        if (o instanceof Person) {
            Person person = ((Person) o);
            return age == person.age && married == person.married;
        }
        return false;
    }
}
