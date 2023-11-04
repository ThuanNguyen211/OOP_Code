package buoi2;

import java.util.Scanner;

public class SDPhanSo {
	private static Scanner sc;
	
	public static void main(String[] args) {
		PhanSo a = new PhanSo(3,4);
		System.out.print("Phân số a là : ");
		a.hienThi();
		
		PhanSo b = new PhanSo(4,9);
		System.out.print("Phân số b là : ");
		b.hienThi();
		
		PhanSo x = new PhanSo();
		System.out.println("Nhập phân số x ");
		x.nhapPhanSo();
		
		PhanSo y = new PhanSo();
		System.out.println("Nhập phân số y ");
		y.nhapPhanSo();
		
		System.out.print("Giá trị nghịch đảo của x là : ");
		x.giaTriNghichDao().hienThi();
		
		System.out.print("Tổng hai phân số x + y là : ");
		x.cong(y).hienThi();
		System.out.print("Tối giản phân số x + y là : ");
		x.cong(y).toiGian().hienThi();
		
		PhanSo ds[];
		System.out.println("Nhập vào số lượng phân số : ");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		ds = new PhanSo[n];
		for(int i=0; i<n; i++) {
			ds[i] = new PhanSo();
		}
		for(int i=0; i<n; i++) {
			System.out.println("Nhập phân số thứ " + (i+1) + " ");
			ds[i].nhapPhanSo();
		}
		PhanSo sum = new PhanSo(1,1);
		for(int i=0; i<n; i++) {
			sum = sum.cong(ds[i]);
		}
		System.out.print("Tổng n phân số là : ");
		sum.hienThi();
		System.out.print("Tối giản tổng n phân số là : ");
		sum.toiGian().hienThi();
		PhanSo max = new PhanSo();
		for ( int i=0; i<n; i++) {
			if( ds[i].lonHon(max))
				max = ds[i];
		}
		System.out.print("Phân số lớn nhất trong danh sách là : ");
		max.hienThi();
		System.out.print("Tối giản phân số max là : ");
		max.toiGian().hienThi();
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(ds[i].lonHon(ds[j])){
					PhanSo temp = new PhanSo();
					temp = ds[i];
					ds[i] = ds[j];
					ds[j] = temp;
				}
			}
		}
		System.out.println("Danh sách đã được sắp xếp từ nhỏ đến lớn : ");
		for (int i=0; i<n; i++) {
			ds[i].hienThi();
		}
	}
}
