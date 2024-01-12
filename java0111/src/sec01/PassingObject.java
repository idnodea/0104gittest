package sec01;

public class PassingObject {

    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println("Before: " + person.name + ", " + person.age);

        modifyPerson(person);

        System.out.println("After: " + person.name + ", " + person.age);
    }

    public static void modifyPerson(Person p) {
        p.name = "Jane";
        p.age = 30;
    }
}