import java.util.*;
public class Richest_Customer_Wealth_1672
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of people");
        int m=sc.nextInt();
        System.out.println("Enter No. of banks");
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
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts)
    {
        int max=0; //stores maximum sum of j elements i.e sum of wealth
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum=sum+accounts[i][j];//sum of j elements i.e wealth
            }
            if(sum>max)
                max=sum; //updates maximum wealth
        }
        return max;
    }
}
