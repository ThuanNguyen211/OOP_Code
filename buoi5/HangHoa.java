package buoi5;

import java.util.Scanner;

public class HangHoa {
	private String mso, ten, nsxuat;
	private Scanner sc;
	
	public HangHoa() {
		mso = new String();
		ten = new String();
		nsxuat = new String();
	}
	public HangHoa(HangHoa h) {
		mso = new String(h.mso);
		ten = new String(h.ten);
		nsxuat = new String(h.nsxuat);
	}
	public void nhap() {
		sc = new Scanner(System.in);
		System.out.print("Nhap ma so san pham : ");
		mso = sc.nextLine();
		System.out.print("Nhap ten san pham : ");
		ten = sc.nextLine();
		System.out.print("Nhap ngay san xuat : ");
		nsxuat = sc.nextLine();
	}
	public void in() {
		System.out.println("MS_SP : " +  mso + ", Ten : " + ten + ", NSX : " + nsxuat);
	}
	public String toString() {
		return ("MS_SP : " +  mso + ", Ten : " + ten + ", NSX : " + nsxuat);
	}
}
