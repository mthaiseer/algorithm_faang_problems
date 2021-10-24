package Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistributeCandies {

    public static int distributeCandies(int[] candyType) {

        if(candyType == null || candyType.length == 0) return 0;

        int N  = candyType.length/2;
        Set<Integer> types = new HashSet<>();
        for(int x: candyType){
            types.add(x);
        }
        return Math.min(N, types.size());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int candies[] = new int[n];
        for(int i=0; i< n; i++){
            candies[i] = scanner.nextInt();
        }

        System.out.println(distributeCandies(candies));


    }

}
