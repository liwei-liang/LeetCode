package leetcode_day1;

//Divide the numbers in ranges like [2-3], [4-7], [8-15] and so on. And try to generate new range from previous.
public class CountingBits {
	public int[] countBits(int num) {
	    int[] ret = new int[num+1];
	    ret[0] = 0;
	    int pow = 1;
	    for(int i = 1, t = 0; i <= num; i++, t++) {
	        if(i == pow) {
	            pow *= 2;
	            t = 0;
	        }
	        ret[i] = ret[t] + 1;
	    }
	    return ret;
	}
}
