package day2;

import java.util.HashMap;
import java.util.Map;

public class parkStatistic {

	public static int countPark(int[][] list){
		Map<Integer, Integer> map = new HashMap<>();
		int res = 0;
		for(int i =0; i<list.length; i++){
			map.put(list[i][0],map.getOrDefault(list[i][0], 0)+1);
			map.put(list[i][1]+12,map.getOrDefault(list[i][1]+12, 0)+1);
		}
		int ins = 0;
		for(int j =1; j<=12;j++){
			map.put(j, map.getOrDefault(j, 0));
			map.put(j+12, map.getOrDefault(j+12, 0));
			res = Math.max(res, ins = ins+map.get(j)-map.get(j+12));
		}
		return res;
	}
	
	public static void main(String[] args){
		int[][] a = {{8,9},{4,6},{3,7},{6,8}};
		System.out.println(countPark(a));
	}
}
