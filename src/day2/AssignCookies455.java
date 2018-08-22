package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AssignCookies455 {

	public static void main(String[] args) {

	}
	
    public int findContentChildren(int[] g, int[] s) {
        if(g.length == 0 || s.length == 0)
        	return 0;
        List<Integer> listg = new ArrayList<>();
        List<Integer> lists = new ArrayList<>();
        for(int i = 0; i<g.length; i++){
        	listg.add(g[i]);
        }
        
        for(int i = 0; i< s.length; i++){
        	lists.add(s[i]);
        }
        int res = 0;
        Collections.sort(listg);
        Collections.sort(lists);
        int pos = 0;
        for(Integer integer: listg){
        	for(int j = pos; j<lists.size(); j++){
        		if(integer<= lists.get(j)){
        			pos = j+1;
        			res++;
        			break;
        		}
        	}
        }
        return res;
    }

}
