package day26_CustomMethods_Practice.day34_GarbageCollection_AccessModifier;

public class CydeoStudent {
    public String studentName;
    public static String schoolName ;

    public CydeoStudent(String studentName){
        this.studentName = studentName;
        //schoolName = "Cydeo School";
    }
    static {
        schoolName = "Cydeo School";
    }

}

class CydeoStudentObject{
    public static void main(String[] args) {


        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Kathy");




    }


}
