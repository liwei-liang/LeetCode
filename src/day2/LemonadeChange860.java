package day2;

import java.util.HashMap;
import java.util.Map;

public class LemonadeChange860 {
    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>();
        if(bills.length == 0)
        	return true;
        if(bills[0] != 5)
        	return false;
        map.put(5, 1);
        map.put(10, 0);
        for(int i = 1; i<bills.length;i++){
        	if(bills[i] == 5){
        		map.put(5, map.get(5)+1);
        	}else if(bills[i] == 10){
        		if(map.get(5)==0){
        			return false;
        		}else{
        			map.put(5, map.get(5)-1);
        			map.put(10, map.get(10)+1);
        		}
        	}else if(bills[i] == 20){
        		if(map.get(10)>0&&map.get(5)>0){
        			map.put(10, map.get(10)-1);
        			map.put(5, map.get(5)-1);
        		}else if(map.get(5)>=3){
        				map.put(5, map.get(5)-3);
        		}else{
            		return false;
        		}
        	}
        }
        return true;
    }
}
