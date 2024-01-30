import java.util.Hashtable;

class Solution {
    public int missingNumber(int[] nums) {

        Hashtable<Integer,Boolean> hash=new Hashtable<>();

        for(int num : nums){
            hash.put(num,true);
        }

        int n=nums.length+1;
        for(int i=0;i<n;i++){
            if(!hash.containsKey(i)){
                return i;
            }


        }


        return -1;
    }
}