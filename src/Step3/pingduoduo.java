package Step3;

import java.util.Scanner;

public class pingduoduo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String array = in.next();
        int length = array.length();
        int k = length/4;
        for(int i =0; i< k+1; i++){
        	StringBuilder reString = new StringBuilder();
        	for(int j = 0; j<k+1;j++){
        		if(i == 0){
        			reString.append(array.charAt(j));
        		}else if(i!=k){
        			if(j==0)
        				reString.append(array.charAt(length-i));
        			else if(j==k)
        				reString.append(array.charAt(k+i));
        			else {
        				reString.append(" ");
					}
        		}else{
        			reString.append(array.charAt(length-j-k));
        		}
        	}
        	
        	System.out.println(reString.toString());
        }
    }
}
