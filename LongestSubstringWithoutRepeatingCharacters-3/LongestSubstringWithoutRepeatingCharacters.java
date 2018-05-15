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
}
