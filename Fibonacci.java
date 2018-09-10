/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	
	public static byte fibonacciB(int i){
		byte f = 0;
		if (i == 0 || i == 1){
			f = 1;
		}else{
			f = (byte)(fibonacciB(i-1) + fibonacciB(i-2));
		}
		return f;
	}
	
	public static short fibonacciC(int i){
		short f = 0;
		if (i == 0 || i == 1){
			f = 1;
		}else{
			f = (short)(fibonacciC(i-1) + fibonacciC(i-2));
		}
		return f;
	}
	
	public static int fibonacciI(int i){
		int f = 0;
		if (i == 0 || i == 1){
			f = 1;
		}else{
			f = (fibonacciI(i-1) + fibonacciI(i-2));
		}
		return f;
	}
	
	public static long fibonacciL(int i){
		long f = 0;
		if (i == 0 || i == 1){
			f = 1;
		}else{
			f = (fibonacciL(i-1) + fibonacciL(i-2));
		}
		return f;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = 13;
		/*
		byte b1 = fibonacciB(n);
		int n2 = 14;
		byte b2 = fibonacciB(n2);
		System.out.println("en 14 el fibonacci de bytes se desborda: ");
		System.out.println("n = " + n + " => f = " + b1); 
		System.out.println("n = " + n2 + " => f = " + b2);
		
		n = 22;
		short c1 = fibonacciC(n);
		n = 23;
		short c2 = fibonacciC(n2);
		System.out.println("en 23 el fibonacci de short se desborda: ");
		System.out.println("n = " + n + " => f = " + c1); 
		System.out.println("n = " + n2 + " => f = " + c2);*/
		
		n = 44;
		int  i1 = fibonacciI(n);
		//long l1 = fibonacciL(n);
		
		System.out.println("Int: " + i1);
		//System.out.println("Long: " + l1);
		
	}
}