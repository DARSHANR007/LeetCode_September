import java.util.HashSet;

class Solution123{
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> hash = new HashSet<>();
        HashSet<Integer> dHash = new HashSet<>();

        for (int num : nums) {
            if (!hash.add(num)) {
                dHash.add(num);
            }


        }
        int res=0;

            for (int i :dHash){
                res-=i;
                res=Math.abs(res);

            }
            if(res<=k){
                return true;
            }


        return false;


    }
}

class main{

    public static void main(String[] args) {

        Solution123 solution=new Solution123();
        int x[]={1,2,3,1,2,3};
        int k=2;
        System.out.println(solution.containsNearbyDuplicate(x,k));

    }
}