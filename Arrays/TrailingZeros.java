package Arrays;

import java.util.Scanner;

public class TrailingZeros {
    static int trailingZeroes(int n) {

        int ans =0;

        while(n > 0){
            n/=5;
            ans+= n;
        }


        return ans;



    }

    /**
     * input 5
     * out put 1
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        System.out.println(trailingZeroes(n));

    }


}
