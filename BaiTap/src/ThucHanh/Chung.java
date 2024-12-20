package ThucHanh;

import java.util.Scanner;

public class Chung {
	public static double power( double x, int n){
		if(n == 0) return 1;
		if(n < 0) {
			x=1/x;
			n=-n;
		}
		double half = power(x, n/2);
		if (n % 2 == 0) {
			return half*half;
			
		} else {
			return half * half * x;
			
		}
	}                                             
	public static double exp(double x, int n) {
		double S= 1;
		double T= 1;
		for (int i = 1; i<=n;i++){
			T= T *x/i;
			S+= T;
		}
		return S;
	}
	public static double cos( double x, int n) {
		double S =1;
		double T =1;
		for (int i = 1; i<=n;i++){
			T =-T*x*x/((2*i-1) * (2*i));
			S+= T;
		}
		return S;
	}
	public static double sin(double x, int n) {
		double S =x;
		double T=x;
		for(int i=1;i<=n;i++){
			T= -T*x*x/((2*i)*(2*i+1));
			S+=T;
		}
		return S;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap X: ");
		double x = sc.nextDouble();
		System.out.print("Nhap N: ");
		int n = sc.nextInt();
		
		double resultExp = exp(x,n);
		System.out.println(" exp(x,n) = " + resultExp);
		System.out.println(" Math.exp(x,n) = " + Math.exp(x));
		
		double resultCos = cos(x,n);
		System.out.println("cos(x,n) = " + resultCos);
		System.out.println(" Math.cos(x,n) = " + Math.cos(x));
		
		double resultSin = sin(x,n);
		System.out.println("sin(x,n) = " + resultSin);
		System.out.println(" Math.sin(x,n) = " + Math.sin(x));
	}

}