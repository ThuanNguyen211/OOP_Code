package buoi3;

import buoi2.Diem;
public class SDDoanThang {

	public static void main(String[] args) {
		
		Diem A = new Diem(2,5);
		Diem B = new Diem(20,25);
		DoanThang AB = new DoanThang(A,B);
		System.out.println("Đoạn thẳng AB là : " + AB );
		AB.doiDT(5, 3);
		System.out.println("Đoạn thẳng AB sau khi tịnh tiến một đoạn (5,3) là : " + AB);
		
		
		DoanThang CD = new DoanThang();
		System.out.println("Nhập giá trị đoạn thẳng CD là : ");
		CD.nhap();
		System.out.println("Đoạn thẳng CD đã nhập là : " + CD);
		System.out.println("Góc CD với trục hoành là : " + CD.goc());
	}
}
