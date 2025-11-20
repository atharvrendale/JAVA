abstract class Animal{
    abstract  void walk();

     Animal() {
      System.out.println("you are creating a new animal");
    }
    
    public void eat(){
        System.out.println("Animals eat grass");
    }
    
}
 class Horse extends Animal{
    Horse(){
        System.out.println("Herbivorous");
    }
    public void walk(){
        System.out.println("walks on 4  legs");
    }
 }

 class chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
 }

public class OOPSabstract{
    public static void main(String[] args) {
        Horse horse =new Horse();
       
    }
}