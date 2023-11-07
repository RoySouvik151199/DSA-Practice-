import java.util.*;
public class Numberofgoodpairs_1512
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
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums)
    {
        int count=0; //counts number of good pairs
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++) //j=i+1 because j>i always as previous elements are not considered only elements remaining are considered
            {
                if(nums[i]==nums[j])
                    count++;
            }
        }
        return count;
    }
}
