package Step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class toutiao3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] intList = new int[n][2];
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            intList[i][0]=a;
            intList[i][1]=b;
            list1.add(a);
            list2.add(b);
        }
        
        int sum =0;
        int suma =0;
        int sumb =0;

        for(int i = 0; i < n; i++){
        	sum += intList[i][0];
        }
        for(int i = 0; i < n; i++){
        	sum += intList[i][0];
        }
        sum = sum / 2;
	}
	
	public static void helper(int n, int[][] intList,List<Integer> list1,List<Integer> list2,int sum){
        for(int i = 0; i < n; i++){
        	sum += intList[i][0];
        }
	}
}
