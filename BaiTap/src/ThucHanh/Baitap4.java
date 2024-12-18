package ThucHanh;

import java.util.Scanner;

public class Baitap4 {
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
		
		System.out.println("sin(x,n) = " + sin(x,n));
		System.out.println(" Math.sin(x,n) = " + Math.sin(x));
		}
}
