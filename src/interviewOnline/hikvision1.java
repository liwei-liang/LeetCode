package interviewOnline;

import java.util.ArrayList;
import java.util.List;

public class hikvision1 {
	public static void main(String[] args){
		List<Integer> list = new ArrayList<>();
		list.add(1);
		for(int i = 2; i<=1000; i++){

				int sum = 0;
				for(int j = 1;j<=i/2;j++){
					if(i%j==0)
						sum += j;
				}
				if(sum == i)
					list.add(i);
			
		}
		for(Integer integer: list){
			System.out.println(integer);
		}
	}
}
