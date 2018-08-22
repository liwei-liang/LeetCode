package Step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class toutiao4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            list1.add(a);
        }
        for(int i = 0; i < n; i++){
            int b = in.nextInt();
            list2.add(b);
        }
        int ins = 0;
        int min =Integer.MAX_VALUE;
        int max = 0;
        int res = 0;
        for(int i = 1; i < n; i++){
        	max = Math.max(max, list1.get(i));
        	min = Math.min(min, list2.get(i));
        	if(max >= min){
        		res+=helper(ins);
        		ins = 0;
        		min =Integer.MAX_VALUE;
                max = 0;
        		continue;
        	}else{
        		ins++;
        		if(i==n-1)
            		res+=helper(ins);
        	}
        }
        System.out.println(res);

	}
	public static int helper(int a){
		int res =0;
		for(int i =1; i<=a;i++){
			res +=i;
		}
		return res;
	}
}
