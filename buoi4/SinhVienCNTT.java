package buoi4;

import java.util.Scanner;

import buoi3.SinhVien;
public class SinhVienCNTT extends SinhVien {

	private String tkhoan, mkhau, email;
	private Scanner sc;
	
	public SinhVienCNTT() {
		super();
		tkhoan = new String();
		mkhau = new String();
		email = new String();
	}
	public SinhVienCNTT(SinhVienCNTT sv) {
		super(sv);
		tkhoan = new String(sv.tkhoan);
		mkhau = new String(sv.mkhau);
		email = new String(sv.email);
	}
	public void  nhapTtin() {
		super.nhapTtin();
		sc = new Scanner(System.in);
		System.out.print("Nhập tài khoản : ");
		tkhoan = sc.nextLine();
		System.out.print("Nhập mật khẩu : ");
		mkhau = sc.nextLine();
		System.out.print("Nhập email : ");
		email = sc.nextLine();
	}
	public void nhapDiem() {
		super.nhapDiem();
	}
	public void in() {
		super.in();
		System.out.print("Tài khoản sv là : " + tkhoan + " , email : " + email + "\n");
	}
	public String toSring() {
		return super.toString() + "Tài khoản sv là : " + tkhoan + " , email : " + email + "\n";
	}
	public void doiMkhau(String newpass) {
		mkhau = new String(newpass);
	}
	public String layEmail() {
		return email;
	}	
}
