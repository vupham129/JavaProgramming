package day43_Abstraction.employeeTask;

public abstract class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Invalid name: "+name);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0 || age >120){
            throw new RuntimeException("Invalid age: "+age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='F'|| gender=='M')){
            throw new RuntimeException("Invalid gender: "+gender);
        }
        this.gender = gender;
    }

    public abstract void sleep();
    public void eat(){
        System.out.println(name+" is eating baklava");
    }

     public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }



}
