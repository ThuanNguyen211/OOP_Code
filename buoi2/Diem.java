package buoi2;

import java.util.Scanner;

public class Diem {
	private int x, y;
	private Scanner sc;
	
	public Diem() {
		x = 0;
		y = 0;
	}
	public Diem(int x1, int y1) {
		x = x1;
		y = y1;
	}
	public Diem(Diem obj) {
		x = obj.x;
		y = obj.y;
	}
	public void nhapDiem() {
		sc = new Scanner(System.in);
		System.out.print("Nhập, x : ");
		x = sc.nextInt();
		System.out.print("Nhập, y : ");
		y = sc.nextInt();
	}
	public void hienThi() {
		System.out.print("(" + x + "," + y + ")");
	}
	public String toString() {
		String s = new String();
		s += ("(" + x + "," + y + ")");
		return s;
	}
	public void doiDiem(int dx, int dy) {
		x += dx;
		y += dy;
	}
	public int layX() {
		return x;
	}
	public int layY() {
		return y;
	}
	public float khoangCach() {
		return (float)Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
	}
	public float khoangCach(Diem d) {
		return (float)Math.sqrt( Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2));
	}
	
}
