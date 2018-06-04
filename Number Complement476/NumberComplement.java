package leetcode_day1;

public class NumberComplement {
	public static int findComplement(int num) {
		int res = num ^ comBit(num);
		return res;
	}

	private static int comBit(int num) {
		int mark = 0;
		while (num > 0) {
			mark++;
			num = num >> 1;
		}
		if(mark != 31){
			return (int) Math.pow(2,(double)mark)-1;
		}
		return (int) Math.pow(2,(double)mark);

	}
	
	public static void main(String[] args){
		findComplement(2147483647);
		System.out.println(Math.pow(2,31));
		System.out.println((int) Math.pow(2,31));

	}
	//for example:
//100110, its complement is 011001, the sum is 111111. So we only need get the min number large or equal to num, then do substraction

    public int findComplement(int num) 
    {
        int i = 0;
        int j = 0;
        
        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
        }
        
        return i - num;
    }
}
