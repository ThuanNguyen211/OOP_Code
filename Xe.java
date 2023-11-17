// Nguyen Minh Thuan
// B2207568
// So may : 01

import java.util.Scanner;

public class Xe {
	private String soxe, loai, ngay;
	private char tthai;
	private Scanner sc;
	
	public Xe() {
		soxe = new String();
		loai = new String();
		ngay = new String();
		tthai = ' ';
	}
	public Xe(Xe x) {
		soxe = new String(x.soxe);
		loai = new String(x.loai);
		ngay = new String(x.ngay);
		tthai = x.tthai;
	}
	
	public void nhap() {
		sc = new Scanner(System.in);
		System.out.print("Nhap so xe : ");
		soxe = sc.nextLine();
		System.out.print("Nhap loai xe (Vios,City,..) : ");
		loai = sc.nextLine();
		System.out.print("Nhap ngay theo dinh danh (ngay-thang-nam): ");
		ngay = sc.nextLine();
		do {
			System.out.print("Nhap trang thai xe : ");
			tthai = sc.nextLine().charAt(0);			
		}while ( tthai != 'C' && tthai != 'K');
	}
	public void in() {
		System.out.println("So xe : " + soxe + ", loai : " + loai + ", ngay : " + ngay + ", trang thai : " + tthai);
	}
	public String toString() {
		return "So xe : " + soxe + ", loai : " + loai + ", ngay : " + ngay + ", trang thai : " + tthai;
	}
	public char laytthai() {
		return tthai;
	}
	public String layloai() {
		return loai;
	}
	public String laythangnam() {
		String thangnam = new String();
		ngay = ngay.trim();
		int p = ngay.indexOf('-');
		thangnam = ngay.substring(p+1);
		return thangnam;
	}
	public static void main(String[] args) {
		Xe x1 = new Xe();
		x1.nhap();
		x1.in();
		
		Xe x2 = new Xe(x1);
		x2.in();
		
	}
}