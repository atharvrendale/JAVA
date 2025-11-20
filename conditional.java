import java.util.*;

// public class conditional {
//     public static void main(String[] args) {
//         Scanner sc =  new Scanner (System.in);
//         int age = sc.nextInt();
        
//         if(age>18){
//             System.out.println("valid age");
//         }
//         else{
//             System.out.println("not valid age");

//         }
        


//     }
// }
// public class conditional{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int x = sc.nextInt();
//         if(x%2==0){
//             System.out.println("The number is even");
//         }else{
//             System.out.println("The number is odd");
//         }
//     }
// }

// public class conditional{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if(a==b){
//             System.out.println("Equal");
//         }else if(a>b)
//             {
//                 System.out.println("A is greater");
//             }else{
//                 System.out.println("A is lesser");
//             }
//         }
        
            
// public class conditional{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int button = sc.nextInt();
//         if(button==1){
//             System.out.println("Hello");
//         }else if(button==2){
//             System.out.println("Namaste");
//         }else if(button==3){
//             System.out.println("Hola");
//         }else{
//             System.out.println("Invalid button");
//         }
//     }

// }

public class conditional{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1: System.out.println("hello");
            break;

           case 2: System.out.println("namaste");
           break;

           case 3: System.out.println("hola");
           break;

           default:
           System.out.println("invalid");
    
        }
    }
}