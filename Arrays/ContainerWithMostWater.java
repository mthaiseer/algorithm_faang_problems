package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int low =0;
        int high = height.length-1;

        int max = Integer.MIN_VALUE;

        while(low< high){

            max  = Math.max(max, Math.min(height[low], height[high]) * (high-low));

            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }



        }

        return max;


    }

    public static void main(String[] args) {


        //System.out.println(new ContainerWithMostWater().maxArea(new int[]{4,3,2,1,4}));
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int size = t;
        int [] arr = new int[size];

        int i=0;
        while (t>0){

            arr[i] = scanner.nextInt();
            i++;
            t--;

        }

        System.out.println(new ContainerWithMostWater().maxArea(arr));



    }
}
