import java.util.*;
public class Kids_withgreatestnumberofcandies_1431
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of Array");
        int n=sc.nextInt();
        System.out.println("Enter ExtraCandies");
        int ex_can=sc.nextInt(); //extra candies
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter "+i+"th element");
            arr[i]=sc.nextInt();
        }
        System.out.println(kidsWithCandies(arr, ex_can ));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        ArrayList<Boolean> list = new ArrayList<>(candies.length);
        int max = max(candies); //finds maximum element in the array candies[] array because if (candies[i]+extraCandies) >= maximum value of the given candies[] array then (candies[i]+extraCandies) is greater than all other elements in the array.
        for(int i=0; i<candies.length; i++)
        {
            if((candies[i]+extraCandies) >= max) // if (candies[i]+extraCandies) >= maximum value of the given candies[] array then (candies[i]+extraCandies) is greater than all other elements in the array.
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }
        }
        return list;
    }
    public static int max(int[] arr)// returns maximum element in an array
    {
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
