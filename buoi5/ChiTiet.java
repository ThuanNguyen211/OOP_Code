package buoi5;

import java.util.Scanner;

public class ChiTiet {
	private int sluong;
	private float dgia;
	private HangHoa h;
	private Scanner sc;
	
	public ChiTiet() {
		sluong = 0;
		dgia = 0.0f;
		h = new HangHoa();
	}
	public ChiTiet(ChiTiet c) {
		sluong = c.sluong;
		dgia = c.dgia;
		h = new HangHoa(c.h);
	}
	public void nhap() {
		h.nhap();
		sc = new Scanner(System.in);
		System.out.print("Nhap so luong : ");
		sluong = sc.nextInt();
		System.out.print("Nhap don gia : ");
		dgia = sc.nextFloat();
	}
	public void in() {
		h.in();
		System.out.println("\tSo luong : " +  sluong + ", don gia : " + dgia +", TTien : "+ ttien());
	}
	public String toString() {
		return (h.toString() + "So luong : " +  sluong + ", don gia : " + dgia +", TTien : "+ ttien());	
	}
	public long ttien() {
		return (long)(sluong*dgia);
	}
}
