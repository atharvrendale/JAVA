public class rhombus {
    public static void main(String[] args) {
        int n = 5;

        //outer loop
        for(int i=1;i<=n;i++){
        
        // space
        int space = n-i;
       
        for(int j=0;j<=space;j++){
            System.out.print(" ");
        }
        //inner loop
        for(int j=0;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
