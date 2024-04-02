import java.util.Scanner;

public class CNguoi {
	private String id, hten, ngay;
	private char phai;
	private Scanner sc;
	
	public CNguoi() {
		id = new String();
		hten = new String();
		ngay = new String();
		phai = 'M';
	}
	public CNguoi(CNguoi c) {
		id = new String(c.id);
		hten = new String(c.hten);
		ngay = new String(c.ngay);
		phai = c.phai;
	}
	public void nhap() {
		sc = new Scanner(System.in);
		System.out.println("Nhap id : ");
		id = sc.nextLine();
		System.out.println("Nhap ho ten : ");
		hten = sc.nextLine();
		System.out.println("Nhap ngay-thang-nam sinh : ");
		ngay = sc.nextLine();
		System.out.println("Nhap phai (M:nam, F:nu) : ");
		phai = sc.nextLine().charAt(0);
	}
	public void in() {
		System.out.println("ID : " + id + " , ho ten : " + hten + ", ngay sinh : " 
				+ ngay + ", phai : " + phai);
	}
	public String toString() {
		return ("ID : " + id + " , ho ten : " + hten + ", ngay sinh : " 
				+ ngay + ", phai : " + phai);
	}
	public boolean xacnhan() {
		return false;
	}
	public double tinhLuong() {
		return 0;
	}
	public String cauthu() {
		return " ";
	}
	public int laynamsinh() {
		String nam[] = ngay.split("-");
		int namsinh = Integer.valueOf(nam[2]);
		return namsinh;
	}
	public String layclbo() {
		return " ";
	}
	public String laymua() {
		return " ";
	}
	public long laybthang() {
		return 0;
	}
	public static void main(String[] args) {
		CNguoi c1 = new CNguoi();
		System.out.println("\tNhap thong tin c1 ");
		c1.nhap();
		System.out.println("\tThong tin c1 da nhap la ");
		c1.in();
		CNguoi c2 = new CNguoi(c1);
		System.out.println("\tc2 duoc sao chep tu c1");
		c2.in();
	}
}
