package Employeepayrollmanagement;
abstract class Person {
    int id;
    String name;
    // Constructor
    Person(int id, String name) {

        this.id = id;
        this.name = name;
    }

    // Common method
    void displayBasicInfo() {

        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }

    // Abstract method (Abstraction)
    abstract void displayRole();
}
