package day05_Concatenation;

public class StudentInfo {
    public static void main(String[] args) {
        String studentName = "Frankie";
        byte age = 20;
        char gender = 'M';
        String schoolName = "SJSU";
        String phoneNumber = "(510)-123-6548";
        boolean isFullTime = true;
        double GPA = 3.5;

        System.out.println("studentName = " + studentName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("GPA = " + GPA);

        System.out.println(studentName + " " + age + " " + gender + " " + schoolName + " " + phoneNumber + " " + isFullTime + " " + GPA);
    }
}
/*
 2. Create a class called StudentInfo, and declare variables for the followings:
                1. student name
                2. age
                3. gender
                4. school name
                5. phone number
                6. full time
 */
