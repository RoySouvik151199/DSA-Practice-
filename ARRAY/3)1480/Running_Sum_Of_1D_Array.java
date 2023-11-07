import java.util.*;
public class Running_Sum_Of_1D_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + "th element");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums)
    {
        int sum=0;//stores sum of present element and previous elements
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            nums[i]=sum;//updates the index element with new addition element of present element and previous elements
        }
        return nums;
    }
}


