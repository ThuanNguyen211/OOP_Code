package buoi3;

import java.util.Scanner;

public class SDSinhVien {
	private static Scanner sc;

	public static void main(String[] args) {
		/*SinhVien sv = new SinhVien();
		sv.nhapDiem();
		System.out.println("TTin-Sinh Vien :" + sv);
		sv.them1hp( "LTHDT", "A");
		System.out.println(sv);
		System.out.println("Ten : " + sv.layTen() + " Điểm TB : " + sv.dTB());
		*/
		
		SinhVien ds[]; 
		sc = new Scanner(System.in);
		System.out.print("Nhập số sinh viên :");
		int n = sc.nextInt();
		ds = new SinhVien[n];
		for(int i=0; i<n; i++) {
			ds[i] = new SinhVien();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("Nhập thông tin sinh viên thứ " + (i+1) );
			System.out.println("{");
			ds[i].nhapTtin();
			System.out.println("}");
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("Nhập điểm sinh viên thứ " + (i+1) );
			System.out.println("{");
			ds[i].nhapDiem();
			System.out.println("}");
		}
		
	
		
		for ( int i=0; i<n; i++) {
			System.out.println("TTin-SV " + (i+1) + " :" + ds[i]);
			System.err.println("Tên : " + ds[i].layTen());
			System.err.println("DTB : " + ds[i].dTB() + " ");
		}
		System.out.println("Danh sách sinh viên bị cảnh báo học vụ : ");
		for(int i=0; i<n; i++) {
			if (ds[i].dTB() <= 1.0)
				ds[i].in();
		}
		
		float maxDiem = 0.0f;
		int temp = 0;
		for(int i=0; i<n; i++) {
			if ( ds[i].dTB() >= maxDiem) {
				maxDiem = ds[i].dTB();
				temp = i;
			}
		}
		System.out.println("Sinh viên có điểm TB cao nhất là: ");
		ds[temp].in();
		
		for(int i=0; i<n-1; i++)
			for(int j=i+1; j<n; j++) {
				if( ds[i].layTen().compareTo(ds[j].layTen()) > 0 ) {
					SinhVien temp1 = new SinhVien(ds[i]);
                	ds[i] = new SinhVien(ds[j]);
                	ds[j] = new SinhVien(temp1);
				}
				 
			}
		System.out.println("Danh sách sinh viên trên theo thứ tự Alphabet của Tên là :");
		for ( int i=0; i<n; i++) {
			System.err.println("Tên : " + ds[i].layTen());
			System.out.println("TTin-SV " + (i+1) + " :" + ds[i]);
			
			System.err.println("DTB : " + ds[i].dTB() + " ");
		} 
		
	}
}
