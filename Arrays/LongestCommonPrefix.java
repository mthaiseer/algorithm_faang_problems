package Arrays;

import java.util.Scanner;

public class LongestCommonPrefix {

    static String findCommonCharacters(String s1, String s2){


        int minLen = Math.min(s1. length(), s2.length());
        StringBuilder builder = new StringBuilder();
        for(int i= 0; i<minLen; i++){
            if(s1.charAt(i) == s2.charAt(i)){

                builder.append(s1.charAt(i));

            }else {
                break;
            }


        }
        return builder.toString();


    }


    public static  String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){
            return "";
        }

        String first  = strs[0];
        String res = "";
        for(int i=1; i<strs.length; i++){

            res  = findCommonCharacters(first, strs[i]);
            first = res;

        }
      return res;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String strs [] = new String[n];
        for(int i=0; i<n; i++){
            strs[i] = scanner.next();
        }
        String res = longestCommonPrefix(strs);
        System.out.println(res);


    }

}
