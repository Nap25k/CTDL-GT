package ThucHanh;

import java.util.Scanner;

public class Baitap3 {
	public static double cos( double x, int n) {
		double S =1;
		double T =1;
		for (int i = 1; i<=n;i++){
			T =-T*x*x/((2*i-1) * (2*i));
			S+= T;
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
		
		System.out.println("cos(x,n) = " + cos(x,n));
		System.out.println(" Math.cos(x,n) = " + Math.cos(x));
	}

}
