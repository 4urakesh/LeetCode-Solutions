class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-2;i++){
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
               
            if (Math.abs(sum - target) < Math.abs(min - target)) {
                min = sum;
            }
             if (sum < target) {
                j++;
            } else if (sum > target) {
                k--;
            } else {
                return sum;
            }
            }
        }
        return min;
    }
}