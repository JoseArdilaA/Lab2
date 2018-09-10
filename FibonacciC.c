#include <stdio.h>

short fibonacciS(int i){
	if(i==0||i==1){
		return 1;
	}else{
		return (fibonacciS(i-1) + fibonacciS(i-2));
	}
}

int fibonacciI(int i){
	if(i==0||i==1){
		return 1;
	}else{
		return (fibonacciI(i-1) + fibonacciI(i-2));
	}
}

long fibonacciL(int i){
	if(i==0||i==1){
		return 1;
	}else{
		return (fibonacciL(i-1) + fibonacciL(i-2));
	}
}

int main(void) {
	// your code goes here
	/*
	int n = 22;
	short s1 = fibonacciS(n);
	int n2 = 23;
	short s2 = fibonacciS(n2);
	printf("en 14 el fibonacci de short se desborda: \n");
	printf("n = %i => f = %i\n",n,s1); 
	printf("n = %i => f = %i\n",n2,s2);
	*/
	
	int n = 45;
	int i1 = fibonacciI(n);
	printf("en 46 el fibonacci de entero se desborda:\n");
	printf("n = %i => f = %i\n",n,i1); 
	
	/*
	int n = 22;
	int l1 = fibonacciL(n);
	printf("en 14 el fibonacci de entero se desborda:\n");
	printf("n = %i => f = %i\n",n,l1); 
	*/
}
