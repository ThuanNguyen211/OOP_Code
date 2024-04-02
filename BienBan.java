import java.util.Scanner;

public class BienBan {
	private String mabb, ngay;
	private int solan;
	private String bienso;
	private NguoiVP vp;
	private static  Scanner sc;
	
	public BienBan() {
		mabb = new String();
		ngay = new String();
		solan = 0;
		bienso = new String();
		vp = new NguoiVP();
	}
	public BienBan(BienBan b) {
		mabb = new String(b.mabb);
		ngay = new String(b.ngay);
		solan = b.solan;
		bienso = new String(b.bienso);
		vp = new NguoiVP(b.vp);
	}
	
	public void nhap() {
		vp.nhap();
		sc = new Scanner(System.in);
		System.out.println("Nhap ma bien ban : ");
		mabb = sc.nextLine();
		System.out.println("Nhap ngay vi pham (ngay-thang-nam) :");
		ngay = sc.nextLine();
		System.out.println("Nhap so lan vi pham : ");
		solan = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap bien so xx-xxxx");
		bienso = sc.nextLine();
	}
	
	public void in() {
		vp.in();
		System.out.println("Ma bien ba : " + mabb + " , ngay vi pham : " + ngay
				 + " , so lan : " + solan + " , bien so : " + bienso);
	}
	public String toString() {
		return vp.toString() +("\nMa bien ba : " + mabb + " , ngay vi pham : " + ngay
				 + " , so lan : " + solan + " , bien so : " + bienso);
	}
	public double tienphat() {
		double tien = 300.0f;
		if ( solan != 0)
			for(int i=0; i<solan; i++) {
				tien *= 1.2;
			}
		return tien;
	}
	public String laynam() {
		String nam = new String();
		ngay = ngay.trim();
		int p = ngay.lastIndexOf('-');
		nam = ngay.substring(p+1);
		return nam;
	}
	public String laytinh() {
		String tinh[] = bienso.split("-");
		return tinh[0];
	}
	public static void main(String[] args) {
		BienBan ds[];
		System.out.println("Nhap n bien ban :");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		ds = new BienBan[n];
		for(int i=0; i<n; i++) {
			ds[i] = new BienBan();
			System.out.println("Nhap thong tin bien ban thu " + (i+1));
			ds[i].nhap();
		}
		for(int i=0; i<n; i++) {
			System.out.println("\tThong tin bien ban thu " + (i+1) + " da nhap la : \n" + ds[i]);
		}
		System.out.println("\n\tThong ke may khua bi phat tren 1tr va tu du 16t tro len");
		for(BienBan b : ds) {
			if ( b.tienphat() >= 1000.0 && b.vp.tuoi() >= 16 ) {
				b.vp.in();
			}
		}
		System.out.println("\n\tDanh sach bi bat nhot do 16t tro xuong");
		for(BienBan b : ds) {
			if (b.vp.tuoi() < 16 ) {
				b.vp.in();
			}
		}
		
		
	}
}
