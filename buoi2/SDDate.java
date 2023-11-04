package buoi2;

import java.util.Scanner;

public class SDDate {
	private static Scanner sc;

	public static void main(String args[]) {
		Date A = new Date(8,9,2023);
		System.out.print("Ngày hôm nay là : ");
		A.inDate();
		
		Date B = new Date();
		System.out.println("Nhập, Ngày bạn muốn");
		B.nhapDate();
		System.out.print("Ngày bạn đã nhập là : ");
		B.inDate();
		System.out.print("Ngày hôm sau đó : ");
		B.ngayHomSau().inDate();
		sc = new Scanner(System.in);
		System.out.print("Nhập, n : ");
		int n = sc.nextInt();
		System.out.print("Ngày bạn đã nhập sau n ngày là : ");
		B.congNgay(n).inDate();
	}
}
