package buoi5;

import java.util.Scanner;

public class HoaDon {
	private String mso, tde, nvien;
	private KhachHang h;
	private Date d;
	private ChiTiet c[];
	private Scanner sc;
	
	public HoaDon() {
		mso = new String();
		tde = new String();
		nvien = new String();
		h = new KhachHang();
		d = new Date();
		c = new ChiTiet[20];
	}
	public HoaDon(HoaDon h) {
		mso = new String(h.mso);
		tde = new String(h.tde);
		nvien = new String(h.nvien);
		this.h = new KhachHang(h.h);
		d = new Date(h.d);
		c = new ChiTiet[20];
		for(int i=0; i<h.c.length; i++) {
			if ( h.c[i] == null)
				break;
			else 
				c[i] = new ChiTiet(h.c[i]);
		}
	}
	public void nhap() {
		sc = new Scanner(System.in);
		System.out.print("Nhap ma so hoa don : ");
		mso = sc.nextLine();
		System.out.print("Nhap tieu de : ");
		tde = sc.nextLine();
		System.out.print("Nhap ten nhan vien : ");
		nvien = sc.nextLine();
		System.out.print("Nhap so loai hang hoa :");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Loai thu :" + ( i+1));
			c[i] = new ChiTiet();
			c[i].nhap();
		}
		int c;
		sc.nextLine();
		do {
			System.out.print("Chon KhachHang(0) hoac KhachHangVip(1) :");
			c = sc.nextInt();
		}while ( !(c == 0 || c == 1));
		if ( c == 0) {
			h = new KhachHang();
		}
		else if( c == 1) {
			h = new KhachHangVip();
		}
		h.nhap();
		System.out.println("Ngay xuat hoa don : ");
		d.nhap();
	}
	public void in() {
		System.out.println("\nMa so : " +  mso + "\n\tTieu de : " + tde + "\tNhan vien : " + nvien );
		System.out.print("Ngay xuat hoa don : ");
		d.in();
		for(int i=0; i<c.length; i++) {
			if ( c[i] == null)
				break;
			else 
				c[i].in();
		}
		System.out.println("Tong tien can thanh toan la : " + tong());
		System.out.println("\tThong tin khach hang");
		h.in();
	}
	public String toString() {
		String s = new String();
		s += ("Ma so : " +  mso + "\nTieu de : " + tde + "\tNhan vien : " + nvien );
		s += d.toString();	
		for(int i=0; i<c.length; i++) {
			if ( c[i] == null)
				break;
			else 
				s += c[i].toString();
		}
		s += ("Tong tien can thanh toan la : " + tong());
		s += ("\tThong tin khach hang");
		s += h.toString();
		return s;
		}
	public double tong() {
		double t = 0;
		for(int i=0; i<c.length; i++) {
			if ( c[i] == null)
				break;
			else 
				t += c[i].ttien();
		}
		t *= ( 1 - h.laytleGiam());
		return t;
	}
}
