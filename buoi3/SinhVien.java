package buoi3;

import buoi2.Date;
import java.util.Scanner;

public class SinhVien {
	private String MSSV, hTen;
	private Date ngSinh;
	private int n;
	private String mon[], diem[];
	private Scanner sc;
	
	public SinhVien() {
		MSSV = new String();
		hTen = new String();
		ngSinh = new Date();
		n = 0;
		mon = new String[60];
		diem = new String[60];
	}
	public SinhVien(SinhVien sv) {
		MSSV = new String(sv.MSSV);
		hTen = new String(sv.hTen);
		ngSinh = new Date(sv.ngSinh);
		n = sv.n;
		for( int i=0; i<n; i++) {
			mon[i] = new String(sv.mon[i]);
			diem[i] = new String(sv.diem[i]);
		}
	}
	public void nhapTtin() {
		sc = new Scanner(System.in);
		System.out.print("Nhập MSSV :");
		MSSV = sc.nextLine();
		System.out.print("Nhập Họ và tên :");
		hTen = sc.nextLine();
		System.out.println("Nhập ngày tháng năm sinh");
		ngSinh.nhapDate();
	}
	public void nhapDiem() {
		sc = new Scanner(System.in);
		do {
			System.out.print("Nhập số môn :");
			n = sc.nextInt();
		}while(!(n>0 || n<60));
		sc.nextLine();
		for( int i=0; i<n; i++) {
			System.out.print("Nhập môn thứ " + (i+1) + " :");
			mon[i] = sc.nextLine();
			System.out.print("Nhập điểm môn thứ " + (i+1) + " :");
			diem[i] = sc.nextLine();
		}
	}
	public void in() {
		System.out.print("[" + MSSV + "," + hTen + "," + ngSinh);
		System.out.println(" Điểm môn học : {");
		for(int i=0; i<n; i++) {
			System.out.print(" " + mon[i] + " : " + diem[i] );
			if ( i <= n-1 )
				System.out.print(", ");
			else
				System.out.print(" ");
		}
		System.out.println("}]");
		
	}
	public String toString() {
		String s = ("[ " + MSSV + ", " + hTen + ", " + ngSinh);
		s += (" -- Điểm môn học : { ");
		for(int i=0; i<n; i++) {
			s += (" " + mon[i] + " : " + diem[i]);
			if ( i < (n-1) )
				s += (", ");
			else
				s += (" ");
		}
		s += ("}]");
		return s;
	}
	public float dTB(){
		float d = 0.0f;
		for (int i=0; i<n; i++) {
			if( diem[i].equals("A")) d += 4.0;
			else if( diem[i].equals("B+")) d+= 3.5;
			else if( diem[i].equals("B")) d+= 3.0;
			else if( diem[i].equals("C+")) d+= 2.5;
			else if( diem[i].equals("C")) d+= 2.0;
			else if( diem[i].equals("D+")) d+= 1.5;
			else if( diem[i].equals("D")) d+= 1.0;
		}
		return (d/n * 10) / 10;
	}
	public void them1HP(String m, String d) {
		if (n < mon.length) {
			mon[n] = new String(m);
			diem[n] = new String(d);
			n++;
		}
		else
			System.out.println("Lỗi, mảng đầy!");
	}
	public void xoa1HP(String m) {
		int i=0;
		for( i=0; i<n; i++) {
			if(mon[i].equals(m)) break;
		}
		if(i<n) {
			for(int j=i; j<n-1; j++) {
				mon[j] = mon[j+1];
				diem[j] = diem[j+1];
			}
			n--;
		}
	}
	public String layTen(){
		String ten = new String();
		hTen = hTen.trim();
		int p = hTen.lastIndexOf(" ");
		ten = hTen.substring(p+1);
		return ten; 
	}
	public String layEmail() {
		return "";
	}
}
		