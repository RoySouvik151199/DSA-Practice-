import java.util.*;
public class FindNumbersWithEvenNumberOfDigits_1295
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+i+"th element");
            arr[i]=sc.nextInt();
        }
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums)
    {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(evendigits(nums[i]))
                count++;
        }
        return count;
    }
    public static boolean evendigits(int n)//checks if a number has even number of digits
    {
        int count=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        return (count%2==0) ;
    }
}
