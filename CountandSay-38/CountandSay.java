package leetcode_day1;

public class CountandSay {
    static public String countAndSay(int n) {
    	if(n==1)
    		return new String("1");
        String a = "11";
        int mark =2 ;
        String result = new String(a);
        while(mark<n){
        	char[] charArray = result.toCharArray();
        	int count = 1;
        	StringBuffer newString = new StringBuffer();
        	for(int i = 0;i<result.length()-1;i++){
        		if(charArray[i]==charArray[i+1]){
        			count++;
        			if(i == result.length()-2){
        				newString.append(count);
        				newString.append(charArray[i]);
        			}
        		}else{
        			newString.append(count);
        			newString.append(charArray[i]);
        			if(i == result.length()-2){
        				newString.append(1);
        				newString.append(charArray[i+1]);
        			}
        			count = 1;
        		}
        	}
        	result = newString.toString();
        	mark++;
        }
        return result;
    }
	public static void main(String[] args) {
		System.out.print(countAndSay(5));
	}
}
