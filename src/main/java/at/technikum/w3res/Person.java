package at.technikum.w3res;

/* Write a Java program to create a class called "Person"
 with a name and age attribute. Create two instances of the
 "Person" class, set their attributes using the
 constructor, and print their name and age.
*/
public class Person {
    String name;
    Integer age;

    private static Integer personObjectCounter = 0;

    Person(String pName, Integer pAge) {
        this.name = pName;
        this.age = pAge;
        personObjectCounter++;
    }
    public Person clone() {
        Person newPerson = new Person(this.name, this.age);
        return newPerson;
    }
    static Integer getPersonObjectCounter(){ return personObjectCounter;}

    int compareToByAge(Person anotherPerson) {
        if (this.age < anotherPerson.age) return -1;
        else if (this.age > anotherPerson.age) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Person p1 = new Person("<Name of Person1>", 42);
        Person p2 = new Person("<Name of Person 2>", 24);
        System.out.format("Name: %s -- Age: %d\n",p1.name,p1.age);
        System.out.format("Name: %s -- Age: %d\n",p2.name,p2.age);
        System.out.format("p1.compareToByAge(p2) = %d\n",p1.compareToByAge(p2));
        System.out.format("Person.personObjectCounter via static getter: %d\n", Person.getPersonObjectCounter());
        Person p3 = p1.clone();
        System.out.format("Clone of p1(=p3): Name: %s -- Age: %d\n",p3.name,p3.age);

    }
}
