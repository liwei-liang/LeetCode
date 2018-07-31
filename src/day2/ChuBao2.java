package day2;

import java.util.Scanner;

public class ChuBao2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] left = new int[n];
		int[] right = new int[n];
		int count = 0;
		int module = 0;
		while(scanner.hasNextInt()){
			if(module%2==0){
				left[count] = scanner.nextInt();
			}else{
				right[count] = scanner.nextInt();
				count++;
			}
			module++;
		}
		for(int i = 0; i<n;i++){
			int max = 0;
			int res =0;
			int ok =helper(left[i],right[i]);
			if(ok>0){
				System.out.println("Case "+(i+1)+":"+" "+ok);
			}else{
				for(int j = left[i];j<=right[i];j++){
					int solo = comBit(j);
					if(solo>max){
						max = solo;
						res = j;
					}
				}
				System.out.println("Case "+(i+1)+":"+" "+res);
			}
		}
		
	}
	private static int comBit(int num) {
		int mark = 0;
		while (num > 0) {
			int ins = num;
			num = num >> 1;
			if(num*2<ins){
				mark++;
			}
		}
		return mark;

	}
	private static int helper(int a,int b){
		if(b>a*2){
			int mark = 0;
			while (b > 0) {
				mark++;
				b = b >> 1;
			}
			return (int) Math.pow(2,(double)mark-1)-1;
		}else{
			int marka=0;
			while (a > 0) {
				marka++;
				b = b >> 1;
				a = a >> 1;
			}
			if(b>0){
				return (int) Math.pow(2,(double)marka-1)-1;
			}
		}
		return 0;
	}
}
