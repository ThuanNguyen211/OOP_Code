package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;
public class SDSinhVienCNTT {
	private static Scanner sc;

	public static void main(String[] args) {
		
		SinhVien ds[];
		sc = new Scanner(System.in);
		System.out.print("Nhập số sinh viên cần nhập : ");
		int n = sc.nextInt();
		ds = new SinhVien[n];
		for(int i=0; i<n; i++) {
			ds[i] = new SinhVien();
		}
		int c = 0;
		for(int i=0; i<n; i++) {
			System.out.print("Nhập 1 nếu là SVCNTT, nhập 0 nếu là không phải SVCNTT : ");
			c = sc.nextInt();
			if(c == 1) 
				ds[i] = new SinhVienCNTT();			
			else
				ds[i] = new SinhVien();
			ds[i].nhapTtin();
			ds[i].nhapDiem();
		}
		for(int i=0; i<n; i++) {
			ds[i].in();
		}
		sc.nextLine();
		System.out.print("Nhập email sinh viên cần tìm : ");
		String temp = sc.nextLine();
		int found = 0;
		for(int i=0; i<n; i++) {
			if( ds[i].layEmail().equals(temp)) {
				System.out.print("ĐTBTL của sinh viên cần tìm là : " + ds[i].dTB());
				found++;			
			}

		}
		if (found == 0)
			System.out.print("Không tìm thấy sinh viên cần tìm ");

	}
}
