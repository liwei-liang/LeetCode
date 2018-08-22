package day2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class exercice {

/** 请完成下面这个函数，实现题目要求的功能 **/
 /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static int calculate(String[] locations) {
    	int[][] pos = new int[locations.length+1][2];
    	int[] mark = new int[locations.length+1];
    	int res = 0;
    	pos[1][0] = 0;
    	pos[1][1] = 0;
    	for(int i = 0;i<locations.length;i++){
    		pos[i+1][0]=locations[i].toCharArray()[0];
    		pos[i+1][1]=locations[i].toCharArray()[2];
    	}
    	for(int i =0;i<locations.length;i++){
    		int mark1 =0;
    		int mark2 =0;
    		int ins=0;
        	int min = Integer.MAX_VALUE;
    		for(int j = i+1;i<locations.length+1;i++){
    			 ins = Math.abs(pos[i][0]-pos[j][0])+Math.abs(pos[i][1]-pos[j][1]);
    			if(ins<min){
    				if(mark[i]<2&&mark[j]<2){
        				mark1 = i;
        				mark2 = j;
        				min = ins;
    				}
    			}
    		}
    		mark[mark1]++;
    		mark[mark2]++;
    		res+=ins;
    	}
    	for(int i =1;i<locations.length;i++){
    		int mark1 =0;
    		int mark2 =0;
    		int ins=0;
        	int min = Integer.MAX_VALUE;
    		for(int j = i+1;i<locations.length+1;i++){
    			 ins = Math.abs(pos[i][0]-pos[j][0])+Math.abs(pos[i][1]-pos[j][1]);
    			if(ins<min){
    				if(mark[i]<2&&mark[j]<2){
        				mark1 = i;
        				mark2 = j;
        				min = ins;
    				}
    			}
    		}
    		mark[mark1]++;
    		mark[mark2]++;
    		res+=ins;
    	}
    	return res;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine().trim());
        int index = 0;
        String[] locations = new String[num];
        while(num-- > 0){
            locations[index++] = scanner.nextLine();
        }

        System.out.println(calculate(locations));  
    }
}