package day36_Inheritance.encapsulation;

public class Student {
    private String name;
    private char gender;
    private int age;
    private char grade;
    private String schoolName;

    public static boolean isStudent = true;
    public static boolean isHuman = true;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age<5 || age >90){
           // System.err.println("Invalid age: "+age);
            return;
        }
        this.age = age;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        if(!(gender == 'M' || gender == 'F')){
            //System.err.println("Invalid gender: "+gender);
            return;
        }
        this.gender = gender;
    }
    public char getGrade(){
        return grade;
    }
    public void setGrade(char grade){
        if(!(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F')){
            //System.err.println("Invalid grade: "+grade);
            return;
        }
        this.grade = grade;
    }
    public String getSchoolName(){
        return schoolName;
    }
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public Student(String name, char gender, int age, char grade, String schoolName) {
       setName(name);
       setGender(gender);
       setGrade(grade);
       setAge(age);
       setSchoolName(schoolName);
    }
    public void study(){
        System.out.println(name+ " is studying");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", grade=" + grade +
                ", schoolName=" + schoolName +
                '}';
    }
}
/*
1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fields (at least encapsulate two fields manually)
                    requirements:
                        1. age should not be set less than 5 or greater than 90
                        2. gender should not be set to any chararcter other than: 'M' and 'F'
                        3. grade should not be set to any characters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all the fields when the object is created
                        (requirements of fields in the above must be applied)


            Methods:
                study()
                toString()
 */