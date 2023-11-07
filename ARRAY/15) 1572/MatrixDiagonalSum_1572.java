import java.util.*;
public class MatrixDiagonalSum_1572
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of rows");
        int m=sc.nextInt();
        int[][] arr=new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.println("Enter value of "+i+"th row elements");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(diagonalSum(arr));
    }
    public static int diagonalSum(int[][] mat)
    {
        int sum = leftdiagonalsum(mat)+ rightdiagonalsum(mat);
        return sum;
    }
    public static int leftdiagonalsum(int[][] mat)
    {
        int s=0;
        for(int i=0;i<mat.length;i++) //continuous left diagonal elements added
        {
            s=s+mat[i][i];
        }
        return s;
    }
    public static int rightdiagonalsum(int[][] mat)
    {
        int s=0;
        int col=mat.length-1;
        for(int i=0; i<mat.length; i++)
        {
            if(mat.length%2!=0 && i!=col)//incase of right diagonal if length is odd then row=col(center element) must be avoided so as not to add it twice since its already added in left diagonal
            {
                s=s+mat[i][col];
                col--;
            }
            else if(mat.length%2==0)//incase if length is even then the previous problem doesn't arise since left and right diagonals do not have a common point. Draw the matrix to understand better
            {
                s=s+mat[i][col];
                col--;
            }
            else
                col--;//even if it's not added but still col-- must be performed after loop otherwise col will not change with row change
        }
        return s;
    }
}
