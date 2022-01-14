package day38_Inheritance.carTask;

public class BMW extends Car{
    public BMW( String model, int year, double price, String color, double miles) {
        super("BMW", model, year, price, color, miles);
    }
    public void breaksDown(){
        System.out.println(brand+" "+model+" has breaks down");
    }
    public void racing(){
        System.out.println(brand+" "+model+" has racing function");
    }

    @Override
    public void start() {
        System.out.println("Call mechanic to start "+brand+" "+model);
    }

}
