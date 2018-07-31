package day2;

public class RotateFunction {
    public int maxRotateFunction(int[] A) {
     int res =0;
     int sum =0;
     int init =0;
     for(int i=0;i<A.length;i++){
    	 sum+=A[i];
    	 res+=i*A[i];
    	 init = res;
     }
     for(int i=1;i<A.length;i++){
    	 init = init+sum-A.length*A[A.length-i];
    	 res = Math.max(res, init);
    	 
     }
     return res;
    }
}
