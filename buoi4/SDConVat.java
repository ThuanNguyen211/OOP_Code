package buoi4;

import java.util.Scanner;

public class SDConVat {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Nhập vào số lượng con vật : ");
		int n = sc.nextInt();
		sc.nextLine();
		ConVat ds[] ; // Khởi tạo ds
		ds = new ConVat[n]; // Cấp phát n vùng nhớ
		for ( int i=0; i<n ; i++) {
			ds[i] = new ConVat(); // Cấp phát mỗi vùng là 1 con vật
		}
		for(int i=0; i<n; i++) {
			System.out.print("Nhập để con loại con vật : (1.Bò, 2.Heo, 3.Dê) ");
			int temp = sc.nextInt();
			if( temp == 1)
				ds[i] = new Bo();
			else if( temp == 2 )
				ds[i] = new Heo();
			else if( temp == 3)
				ds[i] = new De();
			ds[i].nhap();
			ds[i].Keu();			
		}
	
	
	}
}
