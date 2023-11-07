import java.util.*;
public class ConcatenationofArray_1929
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
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums)
    {
        int[] ans=new int[2*nums.length];
        for(int i=0;i<ans.length;i++)
        {
            if(i<nums.length)//till i is less than arr.length ArrayoutOfBoundIndex error is not shown when accessing nums[i]
            {
                ans[i]=nums[i];
            }
            else //after the i is more than nums.length-1 it can show error ArrayoutOfBoundIndex while trying to access for nums[i] so we do i-nums.length so that again from first element of nums[] its added to ans
            {
                ans[i]=nums[i-nums.length];
            }
        }
        return ans;
    }
}
