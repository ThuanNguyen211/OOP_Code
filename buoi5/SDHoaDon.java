package buoi5;

import java.util.Scanner;
public class SDHoaDon {
	private static Scanner sc;
	public static void main(String[] args) {
		    
		HoaDon h1 = new HoaDon();
		h1.nhap();
		h1.in();
		
		
		HoaDon h2 = new HoaDon(h1);
		h2.nhap();
		h2.in();
		
		HoaDon dsHD[];
		System.out.print("Nhap so luong hoa don : ");
		sc = new Scanner(System.in);
		int n = 0; 
		n = sc.nextInt();
		dsHD = new HoaDon[n];
		for(int i=0; i<n; i++) {
			dsHD[i] = new HoaDon();
			dsHD[i].nhap();
		}
		for(int i=0; i<n; i++) {
			dsHD[i].in();
		}
	}
}
