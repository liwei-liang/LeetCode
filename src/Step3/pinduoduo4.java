package Step3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class pinduoduo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        int num =0;
        while (num < n) {
            int a = in.nextInt();
            list.add(a);
            num ++;
        }
        int res = 0;
        List<Integer> list2 = new ArrayList<>(list);

        res = Math.min(helper1(list,0), helper2(list2,0));

    	System.out.println(res);
    }
    
    public static int helper1(List<Integer> list, int ins){
        List<Integer> list2 = new ArrayList<>(list);
    	if(list.size()==0)
    		return ins;
    	Iterator<Integer> it= list.iterator();
    	int a = list.get(0);
    	list.remove(0);
    	while(it.hasNext()){
    		int b = it.next();
    		if(b>a)
    			it.remove();
    	}
    	ins++;
    	if(list.isEmpty())
    		return ins;
    	return  Math.min(helper1(list2,ins), helper2(list2,ins));
    }
    
    public static int helper2(List<Integer> list, int ins){
        List<Integer> list2 = new ArrayList<>(list);
    	if(list.size()==0)
    		return ins;
    	Iterator<Integer> it= list.iterator();
    	int a = list.get(0);
    	list.remove(0);
    	while(it.hasNext()){
    		int b = it.next();
    		if(b<a)
    			it.remove();
    	}
    	return  Math.min(helper1(list2,ins), helper2(list2,ins));
    }
}
