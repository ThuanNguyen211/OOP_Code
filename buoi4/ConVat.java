package buoi4;

import java.util.Scanner;

public class ConVat {

	private String giong, maulong;
	private int cannang;
	private Scanner sc;
	
	public ConVat() {
		giong = new String();
		maulong = new String();
		cannang = 0;
	}
	public ConVat(ConVat cv) {
		giong = new String(cv.giong);
		maulong = new String(cv.maulong);
		cannang = cv.cannang;
	}
	public void nhap() {
		sc = new Scanner(System.in);
		System.out.print("Nhập giống của con vật : ");
		giong = sc.nextLine();
		System.out.print("Nhập màu lông của con vật : ");
		maulong = sc.nextLine();
		System.out.print("Nhập cân nặng của con vật : ");
		cannang = sc.nextInt();
	}
	public void Keu() {
		System.out.println("--------");
	}
	public String toString() {
		return "--------------";
	}
}
