package LongestPalindrome;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character,Integer> hash=new HashMap<>();
        int count=0;
        for(char i:s.toCharArray()){
            hash.put(i,hash.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:hash.entrySet()){
            if(entry.getValue()%2==0){
                count+=entry.getValue();
            }
            else{
                count+=entry.getValue()-1;
            }
        }
        if(count<s.length()){
            count++;
        }
        return count;









    }

}