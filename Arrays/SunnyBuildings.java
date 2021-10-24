package Arrays;

import java.util.Scanner;

public class SunnyBuildings {

    static int countBuildings(int arr[], int n){

        if(arr == null || arr.length==0) return -1;

        int max = arr[0];
        int count =1;

        for(int i=1; i<n; i++){

            if(arr[i] >= max){

                count++;
                max = arr[i];

            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t > 0){

            int n  = scanner.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scanner.nextInt();
            }

            System.out.println(countBuildings(arr, n));
            t--;

        }
    }
}
