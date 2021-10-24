package Arrays;

import java.util.Scanner;

public class MaxSubarraySum {

    static  int maxSubArray(int[] nums) {



        int maxSum =nums[0];
        int currentSum = nums[0];

        for(int i=1; i<nums.length; i++){


            currentSum  = Math.max(currentSum+nums[i], nums[i]);
            maxSum = Math.max(currentSum, maxSum);


        }

        return maxSum;


    }

    /**
     * Sample Input
     * 2
     * 4
     * 1 2 3 4
     * 3
     * -10 5 10
     * Sample Output
     * 10
     * 15
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t > 0){

            int n = scanner.nextInt();
            int arr [] = new int[n];
            for(int i=0; i<arr.length; i++){
                arr[i] = scanner.nextInt();
            }

            System.out.println(maxSubArray(arr));


            t--;

        }


    }


}
