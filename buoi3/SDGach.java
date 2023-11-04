package buoi3;

import java.util.Scanner;

public class SDGach {
	public static Scanner sc;
		
	public static void main(String[] args) {
		
		Gach ds[];
		sc = new Scanner(System.in);
		System.out.print("Nhập số loại gạch : ");
		int k = sc.nextInt();
		ds = new Gach[k];
		for( int i=0; i<k; i++) {
			ds[i] = new Gach();
		}
		for( int i=0; i<k; i++) {
			System.out.println("Nhập thông tin loại gạch thứ " + (i+1) + " : ");
			ds[i].nhap();
		}
		System.out.println();
		for( int i=0; i<k; i++) {
			System.out.println("Thông tin loại gạch thứ " + (i+1) + " : ");
			ds[i].in();
			System.out.println();
		}
		float max = 0.0f;
		int temp = 0;
		for( int i=0; i<k; i++) {
			if ( (float)ds[i].layGia()/ds[i].dienTichMax() >= max )
				temp = i;
		}
		System.out.println("Loại gạch có chi phí thấp nhất là " + ds[temp]);
		System.out.println();
		
		double chiphi[];
		chiphi = new double[k];
		for ( int i=0; i<k; i++) {
			chiphi[i] = ds[i].soLuongHop( 500, 2000)*ds[i].layGia();
		}
		for ( int i=0; i<k; i++) {
			System.out.println("Chi phí khi lót nền 20m*5m của loại gạch thứ " + ( i+1)+ " : " + chiphi[i]);
		}
	}
	
}
