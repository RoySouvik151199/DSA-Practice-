import java.util.*;
public class ShuffletheArray1470
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter half length of Array");
        int n=sc.nextInt();
        int[] arr=new int[2*n];
        for(int i=0;i<2*n;i++)
        {
            System.out.println("Enter "+i+"th element");
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(arr,n)));
    }
    public static int[] shuffle(int[] nums, int n)
    {
        int[] ans=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            ans[2*i]=nums[i]; // first n elements of nums[] is stored in even indexes of ans[]
        }
        int j=1; //for odd index address
        for(int i=n;i<2*n;i++)
        {
            ans[2*j-1]=nums[i]; // last n elements of nums[] is stored in odd indexes of ans[]
            j++;
        }
        return ans;
    }
}
