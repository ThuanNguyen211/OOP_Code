//import java.util.ArrayList;
import java.util.Scanner;

public class GDichTTe extends GDich{
	private float dgia, tgia;
	private int sluong;
	private char loai;
	private static Scanner sc;
	
	public GDichTTe() {
		super();
		dgia = 0.0f; tgia = 0.0f;
		sluong = 0;
		loai = ' ';
	}
	public GDichTTe(GDichTTe g) {
		super(g);
		dgia = g.dgia; tgia = g.tgia;
		sluong = g.sluong;
		loai = g.loai;
	}
	
	public void nhap() {
		super.nhap();
		sc = new Scanner(System.in);
		System.out.println("Nhap don gia : ");
		dgia = sc.nextFloat();
		System.out.println("Nhap so luong : ");
		sc.nextLine();
		sluong = sc.nextInt();
		System.out.println("Nhap loai tien te ( V / U / E ) : ");
		sc.nextLine();
		loai = sc.nextLine().charAt(0);
		System.out.println("Nhap ti gia : ");
		tgia = sc.nextFloat();
	}
	public void in() {
		super.in();
		System.out.println("Don gia : " + dgia + " , so luong : " + sluong
				+ ", loai tien te : " + loai + ", ti gia : " + tgia);
	}
	public String toString() {
		return super.toString() + ("Don gia : " + dgia + " , so luong : " + sluong
				+ ", loai tien te : " + loai + ", ti gia : " + tgia);
	} 
	public double laygiatri() {
		return (double)( (float)sluong * dgia * tgia);
	}
	public int xacnhan() {
		return 1;
	}
	public static void main(String[] args) {
		GDich ds[];
		System.out.println("Nhap n doi tuong giao dich va giao dich tien te : ");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		ds = new GDich[n];
		for(int i= 0; i<n; i++) {
			System.out.println("Chon doi tuong giao dich (0) hoac giao dich tien te (1) :");
			int c = sc.nextInt();
			if ( c == 0 )
				ds[i] = new GDich();
			if ( c == 1 )
				ds[i] = new GDichTTe();
			ds[i].nhap();
		}
		for(int i=0; i<n; i++) {
			System.out.println("Thong tin thu " + (i+1) + " , da nhap la");
			ds[i].in();
		}
		System.out.println("Ma so giao dich co gia tri tren 100.000 VND");
		for(int i=0; i<n; i++) {
			if ( ds[i].laygiatri() > 100)
				System.out.println("Giao dich thu " + ( i+1) + ", co ma giao dich : " + ds[i].laymgd());
		}
		/*
		ArrayList<String> thangnam = new ArrayList<String>();
		for(GDich d : ds) {
			if( !thangnam.contains(d.laythangnam()))
				thangnam.add(d.laythangnam());
		}
		for(String t : thangnam) {
			double tong = 0;
			for(GDich d : ds) {
				if ( d.xacnhan() == 1 && d.laythangnam().equals(t))
					tong += d.laygiatri();
			}
			System.out.println("Tong tien " + tong + ", theo thang nam " + t);
		}*/
		String thangnam[];
		thangnam = new String[n];
		int c = 0;
		for(GDich d : ds) {
			boolean h = false;
			for(int j=0; j<=c; j++) {
				if ( thangnam[j] == null)
					break;
				else if ( thangnam[j].equals(d.laythangnam())){
					h = true;
					break;
				}
			}
			if(!h){
				thangnam[c] = new String(d.laythangnam());
				c++;
			}
		}
		for(String t : thangnam) {
			if ( t != null) {
				double tong = 0;
				for(GDich d : ds) {
					if ( d.xacnhan() == 1 && d.laythangnam().equals(t)) {
						tong += d.laygiatri();
					}
				}
				System.out.println("Theo thang nam : " + t + ", so tien la : " + tong);			
			}
		}
	}
}
