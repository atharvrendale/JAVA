public class diamond {
    public static void main(String[] args){ 
        int n=4;
       // upper half
       for (int i=1;i<=n;i++){
       
        //space
        int space= n-i;
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1;j++){
        System.out.print("*");
        }
       
       System.out.println();
    }
    // lower half
    for (int i=n;i>=1;i--){
       
        //space
        int space= n-i;
        for (int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1;j++){
        System.out.print("*");
        }
       
       System.out.println();
    }
}  
}      

    

