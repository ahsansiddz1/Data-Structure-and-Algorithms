import java.util.Scanner;

public class spiral_matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows : "); int n=sc.nextInt();
        System.out.print("Enter cols : "); int m=sc.nextInt();

        int[][] matrix = new int[n][m];

        //Taking input for matrix
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
  //simple matrix output
        System.out.println("----------------------------------");
        System.out.println("Given Matrix : ");
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j]  +" ");
            }
            System.out.println();
        }
// converting the simple matrix into spiral matrix form
        int top=0; int right=m-1;   int bottom=n-1;  int left=0;
        int dir=0;
        System.out.println("--------------------------------------------");
        System.out.println("Spiral Matrix Output : ");
        while (left<=right && top<=bottom)
        {


            if(dir==0)
            {

                for(int i=left; i<=right; i++)
                {
                    System.out.print(matrix[top][i] + " ");
                }
                top++;
                dir++;
            }
           else if(dir==1)
            {

                for(int i=top; i<=bottom; i++)
                {
                    System.out.print(matrix[i][right] + " ");
                }
                right--;
                dir++;
            }
            else if(dir==2)
            {
                for(int i=right; i>=left; i--)
                {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
                dir++;
            }

            else if(dir==3)
            {
                for(int i=bottom; i>=top; i--)
                {
                    System.out.print(matrix[i][left] + " ") ;
                }
                left++;

            }
            dir=(dir)%4;
            System.out.println();


        }
    }
}
