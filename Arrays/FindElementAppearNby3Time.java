package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindElementAppearNby3Time {

    public List<Integer> majorityElement(int[] nums) {

        int count1 = 0;
        int count2 =0;
        int el1 = 0;
        int el2 =0;
        int N = nums.length;
        List<Integer> ans = new ArrayList<>();

        //counting
        for(int x: nums){

            if( x == el1){
                count1++;
            }else if(x == el2){
                count2++;
            }else   if(count1 == 0){
                el1 =x;
                count1++;
            }else if(count2 ==  0){

                el2 = x;
                count2++;

            } else{

                count1--;
                count2--;
            }
        }

        //verification

        if(el1 == el2){
            ans.add(el1);
            return ans;
        }

        int rc1 =0;
        int rc2 =0;

        for(int x: nums){

            if(x == el1){
                rc1++;
            }

            if(x == el2){
                rc2++;
            }


        }

        if(rc1 > N/3){
            ans.add(el1);
        }
        if(rc2 > N/3){
            ans.add(el2);
        }



        return ans;
    }

    public static void main(String[] args) {

        System.out.println(new FindElementAppearNby3Time().majorityElement(new int[]{2, 2, 3, 1, 3 ,2, 1, 1 }));
        System.out.println(new FindElementAppearNby3Time().majorityElement(new int[]{3,2,3}));
        System.out.println(new FindElementAppearNby3Time().majorityElement(new int[]{0, 0, 0}));
        System.out.println(new FindElementAppearNby3Time().majorityElement(new int[]{1,1,1,1}));

    }
}
