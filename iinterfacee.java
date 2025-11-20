interface Animal{
    void walk();

}
class Horse implements Animal{
     public void walk(){
        System.out.println("walks on 4 legs");
    }
}


public class iinterfacee {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
