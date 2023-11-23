public class FindDuplicateNumber287
{
    public static void main(String[] args)
    {

        int[] arr= {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    //do not get confused if I used arr[] instead of nums[]. It's same. It's just that I am used to arr[] :)
    public static int findDuplicate(int[] nums) //we will use cycle_sort in this question since array range is from 1 to N
    {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=(i+1))// if we look carefully after sorting {1,3,4,2,2} we get {1,2,2,3,4}. This means that at position 0 we get 1, at position 1 we get 2 .Thus it's clear that arr[i] should be i+1 . And if it's not then we will swap the values .
            {                 // if not arr[i]==(i+1) then we will swap the value at i with the position arr[i]-1
                if(nums[i]!=nums[nums[i]-1])//incase arr[i] == arr[arr[i]-1] then that means that the value is already present in proper position and still it's present in another position. This can only happen if the number is repeating .Thus we found the number that's repeating, so we do not need to swap. Thus before swapping we are checking if a duplicate of that number is already present in another correct location.
                {
                    swap(nums,i,nums[i]-1);//nums[i]-1 taken instead of nums[i] because values start from 1 but positions start from 0. Thus positions is always supposed to be 1 less than the respective value at that position.
                }
                else
                {
                    return nums[i];//incase arr[i] == arr[arr[i]-1] then that means that the value is already present in proper position and still it's present in another position. This can only happen if the number is repeating .Thus we found the number that's repeating
                }
            }
            else
            {
                i++; //after the ith location has correct value we need to increase the value of i because that ith position value cannot be swapped anymore.
            }
        }
        return -1;// must return at end of function incase nothing is found
    }
    public static void swap(int[] arr, int first, int second) // swapping position with value
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
