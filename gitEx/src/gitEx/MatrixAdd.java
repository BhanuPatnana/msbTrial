


package gitEx;
import java.util.Scanner;



public class MatrixAdd {
    public static void main(String args[]){
       
        int i,j;
        
         System.out.println("Enter order of a square matrix: ");
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
         System.out.println("Enter the Elements");
         int a[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                    a[i][j]=scan.nextInt();
            }
           
    }
        System.out.println("Matrix A:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
                
            }
            System.out.println("\n");
        }
        System.out.println("Enter elements of matrix B");
         int b[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                    b[i][j]=scan.nextInt();
            }
           
    }
        System.out.println("Matrix B:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(b[i][j]+"\t");
                
            }
            System.out.println("\n");
        }
    
    int sum[][]=new int[n][n];
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            sum[i][j]=a[i][j]+b[i][j];
            
        }
    }
    System.out.println("Addition of matrix A and B is:");
    for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(sum[i][j]+"\t");
                
            }
            System.out.println("\n");
        }


}
}
