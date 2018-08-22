package Step3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class pinduoduo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();
        int number = in.nextInt();
        List<Map<Integer,Set<Integer>>> listMap = new ArrayList<>();
        int i =0;
        String a = in.nextLine();
        while (in.hasNextLine()) {
        	 String temp = in.nextLine();
        	 String[] array = temp.split(" ");
        	 Map<Integer,Set<Integer>> map = new HashMap<>();
        	 Set<Integer> set = new HashSet<>();
        	 for(String str: array){
        		 set.add(Integer.valueOf(str));
        	 }
        	 map.put(i, set);
        	 listMap.add(map);
        	 i++;
        }
        Set<Integer> newset = listMap.get(number).get(number);
        int res = 0;
        int out = 0;
   	 	for(int j =0; j< n;j++){
   	 		if(j!=number && !newset.contains(j)){
   	 			int ins =0;
   	 			Set<Integer> insSet = listMap.get(j).get(j);
   	 			int num = helper(newset,insSet);
   	 			if(num> res){
   	 				res = num;
   	 				out = j;
   	 			}
   	 			res = Math.max(res, helper(newset,insSet));
   	 		}
   	 	}
    	System.out.println(out);
    }
    
    public static int helper(Set<Integer> a, Set<Integer> b){
   	 Set<Integer> set = new HashSet<>(a);
   	 set.addAll(b);
   	 return b.size()-set.size()+a.size();
    }
}
