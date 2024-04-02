import java.util.ArrayList;
import java.util.Scanner;

public class CThu extends CNguoi{
	private int so;
	private String vtri;
	private long bthang;
	private String mua, clbo;
	private static Scanner sc;
	
	public CThu() {
		super();
		so = 0;
		vtri = new String();
		bthang = 0;
		mua = new String();
		clbo = new String();
	}
	public CThu(CThu c) {
		super(c);
		so = c.so;
		vtri = new String(c.vtri);
		bthang = c.bthang;
		mua = new String(c.mua);
		clbo = new String(c.clbo);
	}
	public void nhap() {
		super.nhap();
		sc = new Scanner(System.in);
		System.out.println("Nhap so ao thi dau : ");
		so = sc.nextInt();
		System.out.println("Nhap vi tri ( thu mon, hau ve, trung ve, tien ve, tien dao ) : ");
		sc.nextLine();
		vtri = sc.nextLine();
		System.out.println("Nhap ban thang : ");
		bthang = sc.nextLong();
		System.out.println("Nhap mua giai : ");
		sc.nextLine();
		mua = sc.nextLine();
		System.out.println("Nhap ten clb : ");
		clbo = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println("So ao : " + so + " , vi tri : " + vtri + ", mua giai : " 
				+ mua + ", CLB : " + clbo);
	}
	public String toString() {
		return super.toString() + ("\nSo ao : " + so + " , vi tri : " + vtri + ", mua giai : " 
				+ mua + ", CLB : " + clbo);
	}
	public double tinhLuong() {
		double coban = 7000000.0f;
		switch (vtri) {
			case "thu mon" : { coban += 3000000; break; }
			case "hau ve" : { coban += 4000000; break; }
			case "trung ve" : { coban += 4500000; break; }
			case "tien ve" : { coban += 5000000; break; }
			case "tien dao" : { coban += 7000000; break; }
		}
		coban += ( bthang * 500000.0); // moi ban thang 500
		coban *= 0.9; // 90%
		return coban;
	}
	public boolean xacnhan() { 
		return true;
	}
	public String cauthu() {
		return "Cau thu ao so " + so + ", thuoc clb "  + clbo;
	}
	public String layclbo() {
		return clbo;
	}
	public String laymua() {
		return mua;
	}
	public long laybthang() {
		return bthang;
	}
	public static void main(String[] args) {
		CNguoi ds[];
		System.out.println("Nhap n doi tuong con nguoi va cau thu : ");
		sc = new Scanner(System.in);
		int n = sc.nextInt();
		ds = new CNguoi[n];
		for(int i=0; i<n; i++) {
			int c = 0;
			do{
				System.out.println("Chon Con nguoi (0) hoac cau thu (1) :");
				c= sc.nextInt();
				if ( c == 0)
					ds[i] = new CNguoi();
				if ( c == 1)
					ds[i] = new CThu();
			}while( c != 0 && c != 1);
			ds[i].nhap();
		}
		for(int i=0; i<n; i++) {
			System.out.println("Thong tin da nhap thu " + (i+1) );
			ds[i].in();
		}
		System.out.println("\n\tDanh sach tien luong cau thu ");
		for(CNguoi c : ds) {
			if ( c.xacnhan())
				System.out.println(c.cauthu() + " , tien luong : " + c.tinhLuong());
		}
		ArrayList<String> dsclbo = new ArrayList<String>();
		ArrayList<String> dsmua = new ArrayList<String>();
		for(CNguoi c : ds) {
			if ( c.xacnhan()) {
				if ( !dsclbo.contains(c.layclbo()) )
						dsclbo.add(c.layclbo());
				if ( !dsmua.contains(c.laymua()) )
					dsmua.add(c.laymua());
			}
		}
		for(String clb : dsclbo) {
			System.out.println("\n\tCLB : " + clb);
			for(String muagiai : dsmua) {
				System.out.println("\tMua giai : " + muagiai);
				long t1 = 0 , t2 = 0, t3 = 0;
				for(CNguoi c : ds) {
					if ( c.xacnhan() && c.laymua().equals(muagiai) && c.layclbo().equals(clb) ); {
						int tuoi = 2023 - c.laynamsinh();
						if ( tuoi >= 18 && tuoi <=24 ) t1 += c.laybthang();
						if ( tuoi >= 25 && tuoi <=28 ) t2 += c.laybthang();
						if ( tuoi > 28 ) t3 += c.laybthang();
					}
				}
				System.out.println("Do tuoi 18-24 : " + t1);
				System.out.println("Do tuoi 25-28 : " + t2);
				System.out.println("Do tuoi > 28 : " + t3);
			}
		}
	}
}
