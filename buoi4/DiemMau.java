package buoi4;

import java.util.Scanner;
import buoi2.Diem;

public class DiemMau extends Diem {
	
	private String mau;
	private Scanner sc;
	
	public DiemMau() {
		super();
		mau = new String();
	}
	public DiemMau(int x1, int y1, String mau1) {
		super(x1,y1);
		mau = new String(mau1);
	}
	public void ganMau(String mau1) {
		mau = new String(mau1);
	}
	public void nhapDiem() {
		super.nhapDiem();
		sc = new Scanner(System.in);
		System.out.print("Nhập màu cho điểm : ");
		mau = sc.nextLine();
	}
	public void hienThi() {
		super.hienThi();
		System.out.print(" , với màu của điểm là : " + mau + "\n");
	}
	public String toString() {
		return super.toString() + " , với màu của điểm là : " + mau + "\n";
	}
	
	
	
	
}
