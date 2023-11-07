import java.util.*;
public class Find_highest_altitude_1732
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
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain)
    {
        int[] alt=new int[gain.length + 1]; //array to store altitude. This array has one size more than input array because altitude array starts with 0 altitude and then gains are added
        alt[0]=0; //altitude starts with 0
        for(int i=0;i<gain.length;i++)
        {
            alt[i+1]=alt[i]+gain[i]; //gain added with previous altitude to find next altitude
        }
        return (max(alt));
    }
    public static int max(int[] arr) //maximum element of an array
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}
