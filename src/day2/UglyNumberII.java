package day2;

public class UglyNumberII {
	public static void main(String[] args) {
		nthUglyNumber(10);
	}
    public static int nthUglyNumber(int n) {
		int count = 0;
		int res = 0;
		while (count < n) {
			res++;
			int ins = res;
			while (ins >= 1) {
				if (ins == 1) {
					count++;
					break;
				} else if (ins % 2 == 0) {
					ins = ins / 2;
				} else if (ins % 3 == 0) {
					ins = ins / 3;
				} else if (ins % 5 == 0) {
					ins = ins / 5;
				} else {
					break;
				}
			}
		}

		return res;
	}
    public int nthUglyNumberBetter(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        for(int i=1;i<n;i++){
            int min = Math.min(Math.min(factor2,factor3),factor5);
            ugly[i] = min;
            if(factor2 == min)
                factor2 = 2*ugly[++index2];
            if(factor3 == min)
                factor3 = 3*ugly[++index3];
            if(factor5 == min)
                factor5 = 5*ugly[++index5];
        }
        return ugly[n-1];
    }
}
