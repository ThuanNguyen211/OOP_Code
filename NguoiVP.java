import java.util.Scanner;

public class NguoiVP {
	private String cccd , hten, dchi, ngaysinh;
	private Scanner sc;
	
	public NguoiVP() {
		cccd = new String();
		hten = new String();
		dchi = new String();
		ngaysinh = new String();
	}
	public NguoiVP(NguoiVP n) {
		cccd = new String(n.cccd);
		hten = new String(n.hten);
		dchi = new String(n.dchi);
		ngaysinh = new String(n.ngaysinh);
	}
	public void nhap() {
		sc = new Scanner(System.in);
		System.out.println("Nhap cccd : ");
		cccd = sc.nextLine();
		System.out.println("Nhap ho ten :");
		hten = sc.nextLine();
		System.out.println("Nhap dia chi : ");
		dchi = sc.nextLine();
		System.out.println("Nhap ngay sinh ngay-thang-nam");
		ngaysinh = sc.nextLine();
	}
	public void in() {
		System.out.println("CCCD : " + cccd + " , ho ten : " + hten
				 + " , dia chi : " + dchi + " , ngay sinh : " + ngaysinh);
	}
	public String toString() {
		return ("CCCD : " + cccd + " , ho ten : " + hten
				 + " , dia chi : " + dchi + " , ngay sinh : " + ngaysinh);
	}
	public int tuoi() {
		String nam[] = ngaysinh.split("-");
		int namsinh = Integer.valueOf(nam[2]);
		return 2023-namsinh;
	}
	public static void main(String[] args) {
		NguoiVP vp1 = new NguoiVP();
		System.out.println("\tNhap thong tin nguoi vi pham 1 ");
		vp1.nhap();
		System.out.println("\n\tThong tin nguoi vi pham 1 da nhap la");
		vp1.in();
		
		NguoiVP vp2 = new NguoiVP(vp1);
		System.out.println("\n\tThong tin nguoi vi pham 2 sao chep tu vi pham 1 ");
		vp2.in();
	}
}
