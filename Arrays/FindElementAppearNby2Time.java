package Arrays;

public class FindElementAppearNby2Time {

    public int majorityElement(int[] nums) {

        int count  = 0;
        Integer el  = null;
        int N = nums.length;

        for(int i=0; i<nums.length; i++){


            if(count  == 0){

                el = nums[i];
                count++;

            }else if(el == nums[i]){
                count++;
            }else{

                count--;
                if(count ==  0){
                    el = nums[i];
                    count++;
                }

            }

        }

        int lc = 0;
        int i =0;
        for(int x: nums){

            if( x == el){
                lc++;
            }

            i++;


        }

        if(lc >= N/2 ){
            return el;
        }

        return -1;

    }

    public static void main(String[] args) {

        System.out.println(new FindElementAppearNby2Time().majorityElement(new int[]{3,2,3}));
        System.out.println(new FindElementAppearNby2Time().majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

}
