package buoi3;

import buoi2.Diem;

public class DoanThang {
	
	private Diem d1,d2;
	
	public DoanThang() {
		d1 = new Diem();
		d2 = new Diem();
	}
	public DoanThang(Diem obj1, Diem obj2) {
		d1 = new Diem(obj1);
		d2 = new Diem(obj2);
	}
	public DoanThang(int ax, int ay, int bx, int by) {
		d1 = new Diem(ax,ay);
		d2 = new Diem(bx,by);
	}
	
	public void nhap() {
		System.out.println("Nhập tọa độ điểm thứ nhất : ");
		d1.nhapDiem();
		System.out.println("Nhập tọa độ điểm thứ hai : ");
		d2.nhapDiem();
	}
	public void in() {
		System.out.print(" giá trị của hai đầu mút là : [ " + d1 + " , " + d2 + "]");
	}
	public String toString() {
		String s = new String();
		s += (" giá trị của hai đầu mút là : [ " + d1 + " , " + d2 + "]");
		return s;
	}
	public void doiDT(int dx, int dy) {
		d1.doiDiem(dx, dy);
		d2.doiDiem(dx, dy);
	}
	public float doDai() {
		return d1.khoangCach(d2);
	}
	public double goc() {
		float temp = 0.0f;
		if ( d1.layY() == d2.layY() )
			return  0;
		else if ( d1.layX() == d2.layX())
			return  90;
		else {
			int doi = Math.abs(d1.layY()-d2.layY());
			temp = (float) ( Math.asin( (double) doi /d2.khoangCach(d1)) * 180 )/(float)Math.PI;
			return (temp *10)/10;
		}
	}
	
}
