package Step3;

import java.util.Scanner;

public class pinduoduo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String array = in.next();
        int length = array.length();
        int diviNum = length-1;
        int res = 0;
        for(int i =0; i< diviNum; i++){
        	res+=helper(array.substring(0, i+1),array.substring(i+1, length));
        }
    	System.out.println(res);
    }
    
    private static int helper(String left, String right){
    	if(left.equals("0")){
    		if(right.equals("0"))
    			return 1;
    		else if(right.charAt(0) == '0' &&right.charAt(right.length()-1) == '0')
    			return 0;
    		return calNum(right);
    	}

    	if(right.equals("0")){
    		if(left.charAt(0) == '0' &&left.charAt(left.length()-1) == '0')
    			return 0;
    		return calNum(left);
    	}
    	if(left.charAt(0) == '0' &&left.charAt(left.length()-1) == '0' || right.charAt(0) == '0' &&right.charAt(right.length()-1) == '0')
    		return 0;
    	int a = calNum(left);
    	int b = calNum(right);
    	return a*b;
    }
    
    private static int calNum(String str){
    	int res = str.length();
    	if(str.charAt(str.length()-1)=='0')
    		return 1;
    	if(str.charAt(0)=='0')
    		return 1;
    	return res;
    }
}
