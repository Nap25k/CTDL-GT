package ThucHanh;

import java.util.Scanner;

public class Baitap1 {
	public static double power( double x, int n){
		if(n == 0) 
			return 1; 
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap X: ");
		double x = sc.nextDouble();
		System.out.print("Nhap N: ");
		int n = sc.nextInt();
		
		double resultPower = power(x,n);
		System.out.println(x + "^" + n + "=" + resultPower);
	
	
	}

}
