package Step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class wangyui {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int e = n;
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
			while(n>0){
   	   			n--;
   	            int c = in.nextInt();
   	   			list2.add(c);
   			}
   		int m = in.nextInt();
   		int w = m;
   			while(m>0){
   	   			m--;
   	            int c = in.nextInt();
   	   			list.add(c);
   			}
	   	 for(int i =0;i<w;i++){
	 		int sum =0;
		   	 for(int j =0;j<e;j++){
		   		sum += list2.get(j);
		   		if (list.get(i)<=sum){
			   		 System.out.println(j+1);
			   		 break;   	
		   		}
		   	 }
	   	 }
   		
	}
	
	public static int helper(List<Integer> appleList, int q){
		int sum =0;
	   	 for(int i =0;i<appleList.size();i++){
	   		sum += appleList.get(i);
	   		if (q<=sum){
	   			return i+1;
	   		}
	   	 }
		return 0;
	}
}
