// Nguyen Minh Thuan
// B2207568
// So may : 01


//import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenXe {
	private int mso;
	private String tenlx, nden;
	private float dthu;
	private Xe x;
	private static Scanner sc;
	
	public ChuyenXe() {
		mso = 0;
		tenlx = new String();
		nden = new String();
		dthu = 0.0f;
		x = new Xe();
	}
	public ChuyenXe(ChuyenXe x) {
		mso = x.mso;
		tenlx = new String(x.tenlx);
		nden = new String(x.nden);
		dthu = x.dthu;
		this.x = new Xe(x.x);
	}
	public void nhap() {
		x.nhap();
		sc = new Scanner(System.in);
		System.out.print("Nhap ma so : ");
		mso = sc.nextInt();
		System.out.print("Nhap ten lai xe : ");
		sc.nextLine();
		tenlx = sc.nextLine();
		System.out.print("Nhap noi den : ");
		nden = sc.nextLine();
		System.out.print("Nhap doanh thu : ");
		dthu = sc.nextFloat();
		
	}
	public void in() {
		x.in();
		System.out.println("Ma so : " + mso + ", ten lai xe : " + tenlx + ", noi den : " + nden + ", doanh thu : " + dthu);
	}
	public String toString() {
		return x.toString() +  ("Ma so : " + mso + ", ten lai xe : " + tenlx + ", noi den : " + nden + ", doanh thu : " + dthu) ;
	}
	public int laymso() {
		return mso;
	}
	public static void main(String[] args) {
		ChuyenXe ds[];
		System.out.print("Nhap m chuyen xe : ");
		sc = new Scanner(System.in);
		int m = sc.nextInt();
		ds = new ChuyenXe[m];
		for(int i=0; i<m; i++) {
			System.out.println("Nhap thong tin thu " + (i+1));
			ds[i] = new ChuyenXe();
			ds[i].nhap();
		}
		for(int i=0; i<m; i++) {
			System.out.print("Thong tin chuyen xe thu " + (i+1));
			ds[i].in();
		}
		for(int i=0; i<m; i++) {
			System.out.println("Tat ca cac chuyen xe bi huy hoac doanh thu duoi 100.000");
			if ( ds[i].x.laytthai() == 'K' || ds[i].dthu < 100)
				System.out.println("Xe thu " + (i+1) + " ma so : " + ds[i].laymso());
		}/*
		ArrayList<String> loaixe = new ArrayList<String>();
		for(ChuyenXe list : ds) {	
				if ( !loaixe.contains(list.x.layloai()))
					loaixe.add(list.x.layloai());
		}
		for(String lx : loaixe) {
			ArrayList<String> thangnam = new ArrayList<String>();
			for(ChuyenXe list : ds) {				
				if ( list.x.layloai().equals(lx)) {
					if ( !thangnam.contains(list.x.laythangnam()))
						thangnam.add(list.x.laythangnam());
				}
			}
			for(String d : thangnam) {
				float tong = 0.0f;
				for(ChuyenXe list : ds) {
					if ( list.x.layloai().equals(lx) && list.x.laythangnam().equals(d)) {
						tong += list.dthu;
					}
				}
				tong *= 0.3;
				System.out.println("Tong doanh thu loai xe " + lx + " theo thang nam : " + d  + " , tong la :" + tong );
			}
		}*/
		String loaixe[];
		loaixe = new String[m];
		int k = 0;
		for(ChuyenXe c : ds) {
			boolean check = false;
			for(int i=0; i<=k; i++) {
				if ( loaixe[i] == null)
					break;
				else if (c.x.layloai().equals(loaixe[i])) {
					check = true;
					break;
				}
			}
			if ( !check) {
				loaixe[k] = new String(c.x.layloai());
				k++;
			}
		}
		String thangnam[];
		thangnam = new String[m];
		int h = 0;
		for(ChuyenXe c : ds) {
			boolean check = false;
			for(int i=0; i<=h; i++) {
				if ( thangnam[i] == null)
					break;
				else if (c.x.laythangnam().equals(thangnam[i])) {
					check = true;
					break;
				}
			}
			if ( !check) {
				thangnam[h] = new String(c.x.laythangnam());
				h++;
			}
		}
		for(String lx : loaixe) {
			if ( lx != null) {
				System.out.println("Tong doanh thu loai xe " + lx);
				for(String t : thangnam) {
					if ( t != null ) {
						float tong = 0.0f;
						for(ChuyenXe list : ds) {
							if ( list.x.layloai().equals(lx) && list.x.laythangnam().equals(t)) {
								tong += list.dthu;
							}
						}
						tong *= 0.3;
						System.out.println("Theo thang nam : " + t  + " , tong la :" + tong );
					}
				}
			}
		}
	}
}
