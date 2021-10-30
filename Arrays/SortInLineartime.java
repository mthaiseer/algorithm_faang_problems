package Arrays;

import java.util.Scanner;

public class SortInLineartime {

    public void sortColors(int[] nums) {

        int left = 0;
        int right = nums.length-1;
        int ptr =0;

        while(ptr<= right){

            if(nums[ptr] == 0){
                swap(nums, ptr, left);
                ptr++;
                left++;
            }else if(nums[ptr] ==2){

                swap(nums, ptr, right);
                right--;
            }else{
                ptr++;
            }
        }
    }
    void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;



    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for(int i=0; i< n; i++){

            arr[i] = scanner.nextInt();

        }

        new SortInLineartime().sortColors(arr);

        for(int x: arr){
            System.out.print(x + " ");
        }



    }



}
