package leetcode_day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Searcha2DMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        HashSet<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();
        List<Boolean> result = new ArrayList<Boolean>();
        while (in.hasNext()) {//注意while处理多个case
        	while(m>0){
                String a = in.next();
                set.add(a);
                m--;
        	}
        	while(n>0){
        		list.add(in.next());
        		n--;
        	}
        }

        for(int i = 0; i<list.size();i++){
        	result.add(false);
        	StringBuffer buffer = new StringBuffer(list.get(i));
        	int mark = buffer.length();
        	while(mark>0){
        		if(set.contains(buffer.toString())){
        			result.set(i, true);
        			break;
        		}
        		buffer = buffer.deleteCharAt(buffer.length()-1);
        		mark--;
        	}
        }
        for(int j=0;j<result.size();j++){
        	System.out.println(result.get(j));
        }
    }
}
