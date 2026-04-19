package Level2;
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    public void displayDetails() {
        System.out.println("Name = " + name);
        System.out.println("Age   = " + age);
    }
}
 class PersonMain {
    public static void main(String[] args) {
        Person original = new Person("Anshu ", 25);
        Person clone = new Person(original);

        System.out.println(" Original Person");
        original.displayDetails();

        System.out.println("Cloned Person");
        clone.displayDetails();
    }
}