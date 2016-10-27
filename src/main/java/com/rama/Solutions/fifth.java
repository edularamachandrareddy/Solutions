package com.rama.Solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class fifth {
	
	static long largestPrimeFactor(long n) {
		while(true) {
			long p = getFactor(n);
			if(p < n) {
				n = n/p;
			} else
				return n;
		}
	}
	
	static long getFactor(long n) {
		for(long i = 2 ; i <= n/2 ; i++) {
			if(n % i == 0)
				return i;
		}
		return n;
	}
	
	public static void main(String[] a) {
		long max = 600851475143L;
		System.out.println(largestPrimeFactor(max));
	}
}