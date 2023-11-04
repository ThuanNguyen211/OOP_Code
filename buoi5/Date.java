package buoi5;

import java.util.Scanner;

public class Date {
	private int ngay, thang, nam;
	private Scanner sc;
	
	public Date() {
		ngay = 0;
		thang = 0;
		nam = 0;
	}
	public Date(Date d) {
		ngay = d.ngay;
		thang = d.thang;
		nam = d.nam;
	}
	
	public void nhap() {
		do {
			sc = new Scanner(System.in);
			System.out.print("Nhap ngay : ");
			ngay = sc.nextInt();
			System.out.print("Nhap thang : ");
			thang = sc.nextInt();
			System.out.print("Nhap nam : ");
			nam = sc.nextInt();			
		}
		while(!hople());
	}
	public boolean hople() {
		boolean h = false;
		int m[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if ( nam % 400 == 0|| ( nam % 4 == 0 && nam % 100 != 0))
				m[2] = 29;
		if ( ngay > 0 && thang > 0 && thang < 13 && nam > 0 && ngay <= m[thang] )
			h = true;
		return h;
	}
	public void in() {
		System.out.println(ngay + "/" + thang + "/" + nam);
	}
	public String toString() {
		return (ngay + "/" + thang + "/" + nam);
	}
}
