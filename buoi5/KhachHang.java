package buoi5;

import java.util.Scanner;

public class KhachHang {
	private String cccd, hten;
	private int namsinh;
	private Scanner sc;
	public KhachHang() {
		cccd = new String();
		hten = new String();
		namsinh = 0;
	}
	public KhachHang(KhachHang k) {
		cccd = new String(k.cccd);
		hten = new String(k.hten);
		namsinh = k.namsinh;
	}
	public void nhap() {
			sc = new Scanner(System.in);
			System.out.print("Nhap Can cuoc cong dan : ");
			cccd = sc.nextLine();
			System.out.print("Nhap Ho ten : ");
			hten = sc.nextLine();
			System.out.print("Nhap nam sinh : ");
			namsinh = sc.nextInt();			
	}
	public void in() {
		System.out.println("CCCD : " +  cccd + ", Ho ten : " + hten + ", Nam sinh : " + namsinh);
	}
	public String toString() {
		return ("CCCD : " +  cccd + ", Ho ten : " + hten + ", Nam sinh : " + namsinh);
	}
	public float laytleGiam() {
		return 0;
	}
}
