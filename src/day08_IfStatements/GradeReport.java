package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85;

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && score <= 89; // or can use logical not expression !a
        // boolean b = score >= && !a;
        boolean c = score >= 70 && score <= 79; // or can use !a && !b
        // boolean c = !a && !b;
        boolean d = score >= 60 && score <= 69; // or can use !b && !c
        // boolean d = !b && !c;
        boolean f = score >= 0 && score <= 59; // or can use !c && !d
        // boolean f = !a && !b && !c && !d;

        if(a){ // if the student made an A
            System.out.println("Excellent");
        }
        if(b){
            System.out.println("Great");
        }

        if(c){
            System.out.println("Good");
        }
        if(d){
            System.out.println("Passed");
        }
        if(f){
            System.out.println("Failed");
        }

    }
}
/* score:
90 ~ 100 ==> Excellent
80 ~ 89 ==> Great
70 ~ 79 ==> Good
60 ~ 69 ==> Passed
0 ~ 59 ==> Failed
 */