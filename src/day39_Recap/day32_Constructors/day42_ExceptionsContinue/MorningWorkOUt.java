package day39_Recap.day32_Constructors.day42_ExceptionsContinue;

public class MorningWorkOUt {
    public static void main(String[] args) {

        System.out.println("----------Push-ups started-------------");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\rPush ups "+i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n----------Push-ups completed-------------");

        System.out.println("=====================================");

        System.out.println("------------Pull-ups started----------------");

        for (int i = 1; i <= 20; i++) {
            System.out.print("\rPull ups "+i);
            MorningWorkOUt.sleep(2.5);
        }

        System.out.println("\n----------Pull-ups completed-------------");


    }

    public static void sleep(double seconds){

        try {
            Thread.sleep((long) (seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }





}
