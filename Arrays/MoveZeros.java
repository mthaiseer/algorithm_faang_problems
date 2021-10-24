package Arrays;

import java.util.Scanner;

/**
 * https://online.codingblocks.com/app/player/214210/content/208403/8784/code-challenge
 */
public class MoveZeros {
    static  void moveZeroes(int[] nums) {


        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[j] != 0) {
                j++;
            }

            if (j<=i && nums[j] == 0 && nums[i] != 0) {

                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;

                j++;

            }


        }
    }

    public static void main(String[] args) {
       // int nums[] = {1,3,5,0,6,7,0,1};

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[]=  new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

       moveZeroes(arr);
        for(int x: arr){
            System.out.print(x+  " ");
        }



    }

}
