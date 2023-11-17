// Ho va ten : Nguyen Minh Thuan
// MSSV : B2207568
// So may : 01

import java.util.Scanner;

public class ChiBo {
	private String macb, tencb;
	private int slg;
	private Scanner sc;
	
	public ChiBo() {
		macb = new String();
		tencb = new String();
		slg = 0;
	}
	public ChiBo(String macb, String tencb, int slg) {
		this.macb = new String(macb);
		this.tencb = new String(tencb);
		this.slg = slg;
	}
	public ChiBo(ChiBo c) {
		macb = new String(c.macb);
		tencb = new String(c.tencb);
		slg = c.slg;
	}
	
	public void nhap() {
		sc = new Scanner(System.in);
		System.out.print("Nhap ma chi bo : ");
		macb = sc.nextLine();
		System.out.print("Nhap ten chi bo : ");
		tencb = sc.nextLine();
		System.out.print("Nhap so dang vien : ");
		slg = sc.nextInt();
	}
	public void in() {
		System.out.println("Ma chi bo : " + macb + " , Ten chi bo : " + tencb + ", so dang vien : " + slg);
	}
	public String toString() {
		return ("Ma chi bo : " + macb + " , Ten chi bo : " + tencb + ", so dang vien : " + slg);
	}
	public static void main(String[] args) {
		ChiBo cb1 = new ChiBo();
		System.out.println("\tNhap thong tin chi bo 1");
		cb1.nhap();
		System.out.println("\n\tThong tin chi bo 1 da nhap la");
		cb1.in();
		
		ChiBo cb2 = new ChiBo(cb1);
		System.out.println("\n\tThong tin chi bo 2 duoc sao chep tu chi bo 1");
		cb2.in();
	}
	public String laymacb() {
		return macb;
	}
	
}
