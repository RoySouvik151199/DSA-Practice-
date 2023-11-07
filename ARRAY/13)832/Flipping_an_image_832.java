import java.util.*;
public class Flipping_an_image_832
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of rows");
        int m=sc.nextInt();
        System.out.println("Enter No. of columns");
        int n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter "+i+"th row elements");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr))); //to print multidimentional array in string format we cannot use Arrays.toString() we have to use Arrays.deepToString()
    }
    public static int[][] flipAndInvertImage(int[][] image)
    {

        for(int i=0;i<image.length;i++)
        {
            reverse(image[i]); //1st we reverse the image
            for(int j=0;j<image[i].length;j++) //then we change the 0 with 1 and vice versa
            {
                if(image[i][j]==0)
                {
                    image[i][j]=1;
                }
                else if(image[i][j]==1)
                {
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
    public static int[] reverse(int arr[]) //reversing the array
    {
        int left=0 ,right=arr.length-1;
        while(left<right)
        {
            swap(arr, left, right);
            left++;
            right--;
        }
        return arr;
    }
    public static  int[] swap(int[] arr , int l, int r) //for swapping two elements in an array
    {
        int temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        return arr;
    }
}
