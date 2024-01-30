import java.util.HashSet;

class Solution268{
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash=new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();


        for(int num : nums){

            if(!hash.add(num)){
                duplicate.add(num);

            }


        }
        if (duplicate.isEmpty()) return false;

        return true;



    }
}