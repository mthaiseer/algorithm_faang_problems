package Arrays;

import java.util.*;
public class UniqueCharacterString {

    public int maxLength(List<String> arr) {

        return maxLengthHelper(arr, 0, arr.size(), new String());


    }

    private int maxLengthHelper(List<String> arr, int i, int n, String s){

        if(i == n){

            if(!isAllUnique(s)){
                return 0;
            }

            return s.length();

        }


        int include =  maxLengthHelper(arr, i+1, n, s+arr.get(i));
        int exclude = maxLengthHelper(arr, i+1,n , s);

        return Math.max(include, exclude);



    }

    boolean isAllUnique(String s){

        int[] carr = new int[27];
        for(int i=0; i<s.length(); i++){

            int c  = s.charAt(i)-'a';

            carr[c]++;
            if(carr[c] > 1){
                return false;
            }



        }

        return true;



    }

    public static void main(String[] args) {
//
//        List<String> s = Arrays.asList("ab", "cd", "ab");
//        System.out.println(new UniqueCharacterString().maxLength(s));

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<String> s = new ArrayList<>();
        while (t >= 0){
            s.add(scanner.nextLine());
            t--;
        }

        System.out.println(new UniqueCharacterString().maxLength(s));


    }
}
