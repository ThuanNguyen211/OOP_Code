package buoi3;

import java.util.Scanner;

public class Gach {
	private String maso, mau;
	private int n, dai, ngang; // n là SL viên trong 1 hộp
	private long gia; // gia là Giá của 1 hộp
	private Scanner sc;
	public Gach() {
		maso = new String();
		mau = new String();
		n = 0;
		dai = 0;
		ngang = 0;
		gia = 0;
	}
	public Gach(Gach obj) {
		maso = new String(obj.maso);
		mau = new String(obj.mau);
		n = obj.n;
		dai = obj.dai;
		ngang = obj.ngang;
		gia = obj.gia;
	}
	public void nhap() {
		sc = new Scanner(System.in);
		System.out.print("Nhập Mã số Gạch : ");
		maso = sc.nextLine();
		System.out.print("Nhập màu Gạch : ");
		mau = sc.nextLine();
		System.out.print("Nhập số lượng viên trong 1 hộp: ");
		n = sc.nextInt();
		System.out.print("Nhập chiều dài viên gạch (tính theo cm) :");
		dai = sc.nextInt();
		System.out.print("Nhập chiều ngang viên gạch (tính theo cm) :");
		ngang = sc.nextInt();
		System.out.print("Nhập giá của 1 hộp gạch : ");
		gia = sc.nextLong();
	}
	public void in() {
		System.out.println("Mã số gạch : " + maso + " , màu gạch : " + mau);
		System.out.println("Số viên trong hộp : " + n + " , kích thước gạch : " + dai + "*" + ngang);
	}
	public String toString() {
		String s = new String();
		s += ("Mã số gạch : " + maso + " , màu gạch : " + mau + " ." );
		s += ("Số viên trong hộp : " + n + " , kích thước gạch : " + dai + "*" + ngang);
		return s;
	}
	public long layGia() {
		return gia;
	}
	public float giaBanLe() { // bán từng viên 1
		return (gia*1.2f);
	}
	public int dienTichMax() {
		return (dai*ngang)*n;
	}
	public int soLuongHop(int D, int N) {
		int DT  = dienTichMax();
		int temp = (D*N)/DT;
		if( D%dai!=0) temp++;
		if (N%ngang!=0) temp++;
		return temp;
	}
}
