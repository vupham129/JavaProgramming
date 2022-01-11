package day24_CustomMethods_Return;

public class DomainOfEmail {
    //2. Create a method that can display the domain of the email


    public static void main(String[] args) {

        domainOfEmail("vupham@gmail.com");// gmail.com

        System.out.println("---------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String email : emails) {
            domainOfEmail(email);
        }

    }




    public static void domainOfEmail(String email){

        String domainOfEmail = email.substring(email.indexOf("@")+1);
        System.out.println("domain = "+ domainOfEmail);


    }








}
