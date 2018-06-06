package leetcode_day1;

import java.util.Hashtable;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Hashtable<Character,Integer> table = new Hashtable<Character,Integer>();
        int mark = 0;
        int max = 0;
        int min = 0;
    	char[] charArray = s.toCharArray();
    	for(int i = 0; i < charArray.length; i++){
    		if(!table.containsKey(charArray[i])){
    			mark++;
    		}else{
    			if(table.get(charArray[i])>min){
        			min = table.get(charArray[i]);
    			}
    			mark = i-min;
    		}
    		if(max<mark)
				max = mark;
			table.put(charArray[i], i);
    	}
    	return max;
    }
    //improve
/*    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }*/
}
