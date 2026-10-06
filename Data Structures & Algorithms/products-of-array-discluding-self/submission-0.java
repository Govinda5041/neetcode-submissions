class Solution {
    public int[] productExceptSelf(int[] nums) {
     int n =nums.length;
     int arr1[] =new int[n];
     int arr2[] =new int[n];
     arr1[0] = nums[0];
     arr2[n-1] = nums[n-1];
     
     for(int i = 1 ;i<n ;i++){
      arr1[i]=nums[i]*arr1[i-1];
      arr2[n-i-1]=nums[n-i-1]*arr2[n-i];
     }
     
     nums[0]=arr2[1];
     nums[n-1]=arr1[n-2];
     for(int i = 1 ; i<n-1 ; i++){
        nums[i]=arr1[i-1]*arr2[i+1];
     }

    return nums;
    }
}  
