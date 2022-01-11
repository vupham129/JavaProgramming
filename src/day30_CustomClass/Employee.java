package day30_CustomClass;

public class Employee {
    public String name;
    public int ID;
    public char gender;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, int ID, char gender, String jobTitle, double salary, boolean isFullTime) {
        this.name = name;
        this.ID = ID;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work(){
        System.out.println(jobTitle+" "+name+" is working");
    }
}
/*
Employee class
Attributes:
    name, id, gender, jobTitle, salary, isFullTime(boolean)
Actions:
    toString(): to be able to print each employee object
    setInfo(): to be able to set all the attributes
    work()...

CapitalOne class:
  1. create 5 employee objects
  2. store those 5 employee objects into an array
  3. how many employees are fulltime employees?
  4. what is the minimum salary?
  5. what is the maximum salary?


 */