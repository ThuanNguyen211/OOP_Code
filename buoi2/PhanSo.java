package buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tu, mau;
	private Scanner sc;
	
	public PhanSo() {
		tu = 1;
		mau = 1;
	}
	public PhanSo(int tu1, int mau1) {
		tu = tu1;
		mau = mau1;
	}
	
	public void nhapPhanSo() {
		sc = new Scanner(System.in);
		do {
			System.out.print("Nhập tử số : ");
			tu = sc.nextInt();
			System.out.print("Nhập mẫu số : ");
			mau = sc.nextInt();
		}while ( mau == 0);
	}
	public void hienThi() {
		if ( tu == 0)
			System.out.println("0");
		else if ( mau == 1)
			System.out.println(tu);
		else 
			System.out.println(tu + "/" + mau + " ");
	}
	
	public void nghichDao() {
		int tamp = tu;
		tu = mau;
		mau = tamp;
	}
	public PhanSo giaTriNghichDao() {
		PhanSo tamp = new PhanSo();
		tamp.tu = mau;
		tamp.mau = tu;
		return tamp;
	}
	
	public float giaTriThuc() {
		return (float)(tu/mau);
	}
	
	public boolean lonHon(PhanSo a) {
		boolean h = false;
		if ( mau == a.mau && tu > a.tu)
			h = true;
		else if (tu * a.mau > a.tu * mau)
			h = true;
		return h;
	}
	
	public PhanSo cong(PhanSo a) {
		PhanSo temp = new PhanSo();
		if ( mau == a.mau) {
			temp.tu = tu + a.tu;
			temp.mau = mau;
		}
		else {
			temp.tu = tu * a.mau + a.tu * mau;
			temp.mau = mau * a.mau;
		}
		return temp;
	}
	public PhanSo tru(PhanSo a) {
		PhanSo temp = new PhanSo();
		if ( mau == a.mau) {
			temp.tu = tu - a.tu;
			temp.mau = mau;
		}
		else {
			temp.tu = tu * a.mau - a.tu * mau;
			temp.mau = mau * a.mau;
		}
		return temp;
	}
	public PhanSo nhan(PhanSo a) {
		PhanSo temp = new PhanSo();
		temp.tu = tu*a.tu;
		temp.mau = mau*a.mau;
		return temp;
	}
	public PhanSo chia(PhanSo a) {
		PhanSo temp = new PhanSo();
		temp.tu = tu * a.mau;
		temp.mau = mau * a.tu;
		return temp;
	}
	
	public PhanSo cong(int a) {
		PhanSo temp = new PhanSo(a,1);
		return cong(temp);
	}
	public PhanSo tru(int a) {
		PhanSo temp = new PhanSo(a,1);
		return temp;
	}
	public PhanSo nhan(int a) {
		PhanSo temp = new PhanSo(a,1);
		return nhan(temp);
	}
	public PhanSo chia(int a) {
		PhanSo temp = new PhanSo(a,1);
		return chia(temp);
	}
	public int UCLN(int a, int b){
		while( b!= 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	public PhanSo toiGian() {
		PhanSo t = new PhanSo();
		int temp = UCLN(tu,mau);
		t.tu = tu / temp;
		t.mau = mau / temp;
		return t;
	}
}
