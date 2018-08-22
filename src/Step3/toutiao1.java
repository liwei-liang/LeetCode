package Step3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class toutiao1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int m = 0;
        int n = 0;
      	String temp = in.nextLine();
      	String[] array = temp.split(",");
      	m = Integer.valueOf(array[0]);
      	n = Integer.valueOf(array[1]);
      	int o =0;
        int[][] intList = new int[m][n];
        while (o<m) {
       	 temp = in.nextLine();
       	 array = temp.split(",");
       	 for(int j = 0; j<n;j++){
       		intList[o][j]=Integer.valueOf(array[j]);
       	 }
       	 o++;
       }
//        for(int i = 0; i < m; i++){
//            for(int j = 0; j < n; j++){
//            	intList[i][j] = in.nextInt();
//            }
//        } 
        int p =0;
        int q = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
            	if(intList[i][j] ==0){
            		continue;
            	}
            	else{
            		p++;
            		q= Math.max(q,helper(i,j,intList));
            	}
            }
        } 
        System.out.println(p + "," + q);
	}
    public static int helper(int a, int b, int[][] list){
    	int sum = 0;
    	int length1 = list.length;
    	int length2 = list[0].length;
    	if(list[a][b]==0){
    		return 0;
    	}else{
    		sum++;
    		list[a][b]=0;
    	}
    	if(b<length2-1){
    		sum+=helper(a, b+1, list);
    	}
    	if(b>0){
    		sum+=helper(a, b-1, list);
    	}
    	if(a>0){
    		sum+=helper(a-1, b, list);
    	}
    	if(a>0&&b>0){
    		sum+=helper(a-1, b-1, list);
    	}
    	if(a>0&&b<length2-1){
    		sum+=helper(a-1, b+1, list);
    	}
    	if(a<length1-1){
    		sum+=helper(a+1, b, list);
    	}
    	if(a<length1-1&&b>0){
    		sum+=helper(a+1, b-1, list);
    	}    	
    	if(a<length1-1&&b<length2-1){
    		sum+=helper(a+1, b+1, list);
    	}
		return sum;
    	
    }

}
