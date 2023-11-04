package buoi1;

import java.util.Scanner;
public class Ten {

	private String hTen;
	private static Scanner sc;
	
	public String layTen(){
		String ten = new String();
		hTen = hTen.trim();
		int p = hTen.lastIndexOf(" ");
		ten = hTen.substring(p+1);
		return ten;
	}
	public static void main(String[] args) {
		Ten t = new Ten();
		t.hTen = new String();
		sc = new Scanner(System.in);
		System.out.print("Nhập họ tên : ");
		t.hTen = sc.nextLine();
		System.out.println("Tên của họ tên đó là : " + t.layTen());
	}
}
