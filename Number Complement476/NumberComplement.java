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
}
