import java.util.*;
public class SmallerthancurrentNumber_1365
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
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums)
    {
        int[] ans=new int[nums.length]; //array to store number of elements smaller than current element
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j]) // checks if current element is greater than other elements 
                {
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}
