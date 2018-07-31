package day2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;


public class Test {

	public static void main(String[] args) {
		String a = new String("OK");
		String b = "OK";
		String c = "OK";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.hashCode());
	}

}
