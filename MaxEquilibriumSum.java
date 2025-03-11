public class MaxEquilibriumSum {

    public static void main(String[] args) {
        int[] nums = {1,2,3,5,3,2,1};
        System.out.println("Maximum Sum : " + maximumEquilibriumSum(nums));
        System.out.println("Maximum Sum : " + maxiEquilibriumSum(nums));
    }
    // n * n
    static int maximumEquilibriumSum(int[] nums){
        int sum=-1;
        int n=nums.length;
        for(int i=0; i<n; i++){
            int prefixSum = 0;
            int suffixSum = 0;
            for (int j = 0; j <= i; j++) {
                prefixSum += nums[j];
            }
            for (int j = i; j < n; j++) {
                suffixSum += nums[j];
            }
            if (suffixSum==prefixSum && prefixSum>sum){
                sum = prefixSum;
            }
        }
        return sum;
    }

    // n
    static int maxiEquilibriumSum(int[] nums) {
        int sum = -1;
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
                prefixSum[i] = prefixSum[i-1] + nums[i];
            }
        suffixSum[n-1] = nums[n-1];
        for (int i = n-2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i+1] + nums[i];
        }

        for(int i=0; i<n; i++) {
            if(suffixSum[i]-prefixSum[i] == 0 && suffixSum[i]>sum) 
                sum = suffixSum[i];
        }
            
        return sum;
    }
}