package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Ann";
        String lastName = "Beiner";
        int age = 45;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;
        String fullName = firstName + " " + lastName;
        System.out.println("Full name of the person is " + fullName);
        System.out.println(fullName + " is " + age + " years old");
// Fullname is jobTitle + , works at + companyName, and Fullname's salary is salary
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + ", and " + fullName + "'s salary is " + "$"+ salary);


    }
}
/*
inside concatenation ppt
 */