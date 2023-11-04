package buoi5;

import java.util.Scanner;

public class KhachHangVip extends KhachHang{
	private float tleGiam;
	private Date d;
	private Scanner sc;
	
	public KhachHangVip() {
		super();
		tleGiam = 0.0f;
		d = new Date();
	}
	public KhachHangVip(KhachHangVip k) {
		super(k);
		tleGiam = k.tleGiam;
		d = new Date(k.d);
	}
	public void nhap() {
		super.nhap();
		sc = new Scanner(System.in);
		System.out.print("Nhap ti le giam : ");
		tleGiam = sc.nextFloat();
		System.out.println("Ngay tham gia VIP");
		d.nhap();
	}
	public void in() {
		super.in();
		System.out.println("Ngay tham gia VIP : " + d + "\tTi le giam  : " +  tleGiam + "\n");
	}
	public String toString() {
		return (super.toString() + "Ngay tham gia VIP : " + d + "\tTi le giam  : " +  tleGiam + "\n");
	}
	public float laytleGiam() {
		return tleGiam;
	}
}
