package ex_6;

public class Person {
    private String name;
    private int age;
    private char gender;

    //	constructor no parameter
    public Person() {

    }

    // constructor parameter
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // return name
    public String getName() {
        return name;
    }

    // set name
    public void setName(String name) {
        this.name = name;
    }

    //return age
    public int getAge() {
        return age;
    }

    // set age
    public void setAge(int age) {
        this.age = age;
    }

    // return gender
    public char getGender() {
        return gender;
    }

    // set gender
    public void setGender(char gender) {
        this.gender = gender;
    }

    // override
    @Override
    public String toString() {
        return "Name: " + name + " age: " + age + "gender: " + gender;
    }
}
