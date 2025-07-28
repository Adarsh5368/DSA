class Solution {
    public int search(int[] nums, int target) {

        int pivot=findPivot(nums);

        if(target==nums[pivot]){
            return pivot;
        }

        if(target>=nums[0]){
            return Binary_search(nums, target, 0, pivot-1);
           
        }

        return Binary_search(nums ,target ,pivot+1, nums.length-1);
        
        
        
    }
    public int findPivot(int[] nums)
    {
        int low=0,high=nums.length-1,mid;

        //if array is not rotated ..(as "possibly rotated" is mentioned in question..)
        if(nums[low]<nums[high])    return nums.length-1;

        int pivot=0;
        while(low<high)
        {
            mid=low+(high-low)/2;
            if (mid>0 && nums[mid-1]>nums[mid] )
            {
                pivot=mid-1;
                break;
            }
            if( mid<nums.length-1 && nums[mid]>nums[mid+1])
            {
                pivot=mid;
                break;
            }
//reduce searching space.
            if(mid!=0 && nums[mid]>=nums[low])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return pivot;
    }
    public int Binary_search(int[] arr,int key,int low,int high)
    {
        
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if( key<arr[mid]){
                high=mid-1;
            }
            else if(key>arr[mid]) {
                low=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}