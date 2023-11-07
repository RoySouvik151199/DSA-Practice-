import java.util.*;
public class Cellswithoddvalueinmatrix_1252
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of rows");
        int m=sc.nextInt();
        System.out.println("Enter No. of columns");
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++) //initialising all elements to 0
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=0;
            }
        }
        System.out.println("Enter No. of rows in indices");
        int r=sc.nextInt();
        int[][] indices=new int[r][2];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("Enter value of "+i+"th element in indices");
                indices[i][j]=sc.nextInt();
            }
        }
        System.out.println(oddCells(m,n,indices));
    }
    public static int oddCells(int m, int n, int[][] indices)// checks odd elements after all changes
    {
        int count=0;
        int[][] matrix=new int[m][n];
        for(int i=0;i<indices.length;i++)
        {
            addmatrix(indices, i,  matrix);
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]%2!=0)
                    count++;
            }
        }
        return count;
    }
    public static int[][] rowincrease(int[][] matrix, int row)//to increase the mentioned row by 1 each element
    {
        for(int j=0;j<matrix[row].length;j++)
        {
            matrix[row][j]++;
        }
        return matrix;
    }
    public static int[][] columnincrease(int[][] matrix, int column)//to increase the mentioned column by 1 each element
    {
        for(int i=0;i<matrix.length;i++)
        {
            matrix[i][column]++;
        }
        return matrix;
    }
    public static int[][] addmatrix(int[][] indice, int row,  int[][] matrix)//first change row then change column on same matrix
    {
        int rowno = indice[row][0];
        rowincrease(matrix, rowno);
        int columnno = indice[row][1];
        columnincrease(matrix, columnno);
        return matrix;
    }

}
