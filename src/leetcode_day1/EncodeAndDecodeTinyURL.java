package leetcode_day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EncodeAndDecodeTinyURL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String query = in.next();
        String doc = in.next();
        char[] qArray = query.toCharArray();
        char[] docArray = doc.toCharArray();
        
        int mark = -1;
        int scor = 0;
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        if(qArray.length>docArray.length){
        	System.out.println(0);
        	return;
        }
        for(int j = 0; j<qArray.length;j++){
        	for(int i = 0; i<docArray.length; i++){
        		if(docArray[i] == qArray[j] && i > mark){
        			map.put(qArray[j], i);
        			mark = i;
        			if(j>0){
        				scor = scor + map.get(qArray[j])-map.get(qArray[j-1]);
        			}
        			if(j!=0)
        			break;
        		}
        	}
        	if(!map.containsKey(qArray[j])){
            	System.out.println(0);
            	return;
        	}
        }
        int result = 100 - scor;
    	System.out.println(result);

    }
}
