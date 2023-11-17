// Nguyen Minh Thuan
// B2207568
// 01
import java.util.Scanner;
public class GDich {
	private int mgd;
	private String hten, ngay;
	private boolean tthai;
	private Scanner sc;
	
	public GDich() {
		mgd = 0;
		hten = new String();
		ngay = new String();
		tthai = true;
	}
	public GDich(GDich g) {
		mgd = g.mgd;
		hten = new String(g.hten);
		ngay = new String(g.ngay);
		tthai = g.tthai;
	}
	
	public void nhap() {
		System.out.println("Nhap ma giao dich : ");
		sc = new Scanner(System.in);
		mgd = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ho ten : ");
		hten = sc.nextLine();
		System.out.println("Nhao ngay (ngay-thang-nam) : ");
		ngay = sc.nextLine();
		System.out.println("Nhap trang thai giao dich : ");
		tthai = sc.nextBoolean();
	}
	public void in() {
		System.out.println("Ma giao dich : " + mgd + " , Ho va ten : " + hten
				+ ", ngay giao dich : " + ngay + ", trang thai : " + tthai);
	}
	public String toString() {
		return ("Ma giao dich : " + mgd + " , Ho va ten : " + hten
				+ ", ngay giao dich : " + ngay + ", trang thai : " + tthai);
	}
	public double laygiatri() {
		return 0;
	}
	public int laymgd() {
		return mgd;
	}
	public String laythangnam() {
		String thangnam = new String();
		ngay = ngay.trim();
		int p = ngay.indexOf('-');
		thangnam = ngay.substring(p+1);
		return thangnam;
	}
	public int xacnhan() {
		return 0;
	}
	public static void main(String[] args) {
		GDich gd1 = new GDich();
		System.out.println("Nhap thong tin giao dich 1");
		gd1.nhap();
		System.out.println("Giao dich 1 da nhap la ");
		gd1.in();
		
		GDich gd2 = new GDich(gd1);
		System.out.println("Giao dich 2 sao chep tu giao dich 1");
		gd2.in();
	}
}
