package buoi1;

import java.util.Scanner;

public class Prime {
	private int n;
	private Scanner sc;
	
	public void nhap() {
		System.out.print("Nhập  số nguyên : ");
		sc = new Scanner(System.in);
		n = sc.nextInt();
	}
	public boolean  nguyento() {
		for( int i=2; i <= Math.sqrt(n); i++) {
			if ( n % i == 0 )
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Prime x = new Prime();
		x.nhap();
		if (x.nguyento())
			System.out.println("Số nguyên đã nhập là số nguyên tố ");
		else 
			System.out.println("Số nguyên đã nhập không phải là số nguyên tố ");
		int ds[] = new int[50];
		int i=0;
		while(x.n!=0) {
			int temp=x.n%2;
			ds[i]=temp;
			x.n=x.n/2;
			i++;
		}
		System.out.print("Dạng nhị phân của số nguyên là: ");
		for( int j=i; j>=0; j--) {
			System.out.print(ds[j]);
		}
		
	}
}
