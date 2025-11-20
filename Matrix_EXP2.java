import java.util.Scanner;

class Matrix{
    int a[][]= new int[2][2];
    int b[][]= new int[2][2];
    int i,j;
    Scanner sc = new Scanner(System.in);
    void InputAB(){
        System.out.println("Enter Matrix A: ");
        for (i=0;i<2;i++){
            for (j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Matrix B: ");
        for (i=0;i<2;i++){
            for (j=0;j<2;j++){
                b[i][j]=sc.nextInt();
            }
        }
    }

    void PrintIP(){
        System.out.println("You have entered matrix a:");
        for (i=0;i<2;i++){
            for (j=0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("You have entered matrix b:");
        for (i=0;i<2;i++){
            for (j=0;j<2;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }

    void addition(){
        System.out.println("Addition of ab is: ");
        for (i=0;i<2;i++){
            for (j=0;j<2;j++){
                int c= a[i][j] + b[i][j];
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    void subtraction(){
        System.out.println("Subtraction of ab is: ");
        for (i=0;i<2;i++){
            for (j=0;j<2;j++){
                int c= a[i][j] - b[i][j];
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }

    int k;
    void multiplication(){
        System.out.println("Multiplication is: ");
        for (i=0;i<2;i++){
            for(j=0;j<2;j++){
                int c =0;

                for(k=0;k<2;k++){
                    c= c+ a[i][k]*b[k][j];
                }
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}



public class Matrix_EXP2 {
    public static void main(String[] args) {
        Matrix m= new Matrix();
        m.InputAB();
        m.PrintIP();
        m.addition();
        m.subtraction();
        m.multiplication();
    }

}
