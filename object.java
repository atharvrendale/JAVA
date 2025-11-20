


class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");

    }

    public void printColor(){
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }

}

public class object {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Red";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color ="Black";
        pen2.type = "Ball";

        pen1.printColor();
        pen2.printColor();

        pen1.printType();
        pen2.printType();

    }
    
    
}
