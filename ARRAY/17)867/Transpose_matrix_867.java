import java.util.*;

public class Transpose_matrix_867
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of rows");
        int m=sc.nextInt();
        System.out.println("Enter No. of columns");
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter "+i+"th person's money in bank account");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(transpose(arr)));
    }
    public static int[][] transpose(int[][] matrix)
    {
        int trans[][] = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                trans[j][i]=matrix[i][j];
            }
        }
        return trans;
    }
}
