package at.technikum.w3res;

/* Write a Java program to create a class called "Person"
 with a name and age attribute. Create two instances of the
 "Person" class, set their attributes using the
 constructor, and print their name and age.
*/
public class Person {
    String name;
    Integer age;

    Person(String pName, Integer pAge) {
        this.name = pName;
        this.age = pAge;
    }

    public static void main(String[] args) {
        Person p1 = new Person("<Name of Person1>", 42);
        Person p2 = new Person("<Name of Person 2>", 24);
        System.out.format("Name: %s -- Age: %d\n",p1.name,p1.age);
        System.out.format("Name: %s -- Age: %d\n",p2.name,p2.age);
    }
}
