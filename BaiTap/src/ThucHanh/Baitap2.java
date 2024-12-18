package ThucHanh;

import java.util.Scanner;

public class Baitap2 {
	public static double exp(double x, int n) {
		double S = 1;
		double T= 1;
		for (int i = 1; i<=n;i++){
			T= T *x/i;
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
		
		System.out.println(" exp(x,n) = " + exp(x,n));
		System.out.println(" Math.exp(x,n) = " + Math.exp(x));
		
	}

}
