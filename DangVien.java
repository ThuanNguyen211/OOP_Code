// Ho va ten : Nguyen Minh Thuan
// MSSV : B2207568
// So may : 01

import java.util.Scanner;

public class DangVien {
	private String sothe, hoten, ngaysinh;
	private float heso;
	private ChiBo cb;
	private static Scanner sc;
	
	public DangVien() {
		sothe = new String();
		hoten = new String();
		ngaysinh = new String();
		heso = 0.0f;
		cb = new ChiBo();
	}
	public DangVien(DangVien dv) {
		sothe = new String(dv.sothe);
		hoten = new String(dv.hoten);
		ngaysinh = new String(dv.ngaysinh);
		heso = dv.heso;
		cb = new ChiBo(dv.cb);
	}
	public void nhap() {
		cb.nhap();
		sc = new Scanner(System.in);
		System.out.print("Nhap so the dang vien : ");
		sothe = sc.nextLine();
		System.out.print("Nhap ho va ten : ");
		hoten = sc.nextLine();
		System.out.print("Nhap ngay sinh (ngay-thang-nam) : ");
		ngaysinh = sc.nextLine();
		System.out.print("Nhap he so luong : ");
		heso = sc.nextFloat();
	}
	public void in() {
		cb.in();
		System.out.println("So the dang vien : " + sothe + ", ho va ten : " + hoten 
				+ " , ngay sinh : " + ngaysinh + ", he so luong : " + heso);
	}
	public String toString() {
		return cb.toString() + ("So the dang vien : " + sothe + ", ho va ten : " + hoten 
				+ " , ngay sinh : " + ngaysinh + ", he so luong : " + heso);
	}
	public String laynamsinh() {
		String nam = new String();
		ngaysinh = ngaysinh.trim();
		int p = ngaysinh.lastIndexOf('-');
		nam = ngaysinh.substring(p+1);
		return nam;
	}
	public String layhoten() {
		return hoten;
	}
	public float layheso() {
		return heso;
	}
	public static void main(String[] args) {
		DangVien ds[];
		System.out.print("Nhap n doi tuomg Dang Vien : ");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		ds = new DangVien[n];
		for(int i=0; i<n; i++) {
			System.out.println("\tNhap thong tin Dang Vien thu " + ( i+1) + " : ");
			ds[i] = new DangVien();
			ds[i].nhap();
		}
		for(int i=0; i<n; i++) {
			System.out.println("\tDanh sach Dang Vien thu " + ( i+1) + " , da nhap la : ");
			ds[i].in();
		}
		System.out.println("\n\tHo ten Dang Vien sinh sau nam 1975 ");
		for(DangVien d : ds) {
			if ( d.laynamsinh().compareTo("1975") > 0)
				System.out.println("Ho ten la : " + d.layhoten());
		}
		System.out.println("\n\tDangVien ChiBo mmt va he so luong tu 4.32 ");
		for(DangVien d : ds) {
			if ( d.cb.laymacb().equals("mmt") && ( d.layheso() > 4.32 || d.layheso() == 4.32) )
				d.in();
		}
	}
}
