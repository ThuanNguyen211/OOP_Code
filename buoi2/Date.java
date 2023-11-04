package buoi2;

import java.util.Scanner;

public class Date {
	private int d, m , y;
	private Scanner sc;
	
	public Date() {
		d = 1;
		m = 1;
		y = 2000;
	}
	public Date(int d1, int m1, int y1) {
		d = d1;
		m = m1;
		y = y1;
	}
	public Date(Date obj) {
		d = obj.d;
		m = obj.m;
		y = obj.y;
	}
	public void inDate(){
		System.out.println(d + "/" + m + "/" + y);
	}
	public String toString() {
		return d + "/" + m + "/" + y;
	}
	public void nhapDate() {
		do {
			sc = new Scanner(System.in);
			System.out.print("Nhập ngày : ");
			d = sc.nextInt();
			System.out.print("Nhập tháng : ");
			m = sc.nextInt();
			System.out.print("Nhập năm : ");
			y = sc.nextInt();
		}while(!hopLe());
	}
	public boolean hopLe(){
		boolean h = false;
		int max[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if ( m==2 && y%4==0) max[2]=29;
		if ( d > 0 &&  m > 0 && m < 13 && d <= max[m] &&  y > 0   ) {
			h = true;
		}
		return h;
	}
	public Date ngayHomSau() {
		Date t = new Date( d, m, y);
		t.d++;
		if ( !t.hopLe()) {
			t.d = 1;
			t.m++;
			if ( !t.hopLe()) {
				t.m = 1;
				t.y++;
			}
		}
		return t;
	}
	public Date congNgay(int n) {
		Date t = new Date( d, m, y);
		for(int i=0; i<n; i++) {
			t = t.ngayHomSau();
		}
		return t;
	}
	public void inCalendar(int nam, int k) {
		System.out.println("   Lịch năm " + nam );
		//			T0,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12
		int max[]= { 0,31,28,31,30,31,30,31,31,30, 31, 30,31};
		//		k=	Mo,Tu,We,Th,Fr,Sa,Su
		//			2, 3, 4, 5, 6 , 7, 8
		for (int i=m; i<13; i++){
			System.out.println("      Tháng " + i);
			System.out.println("Mo Tu We Th Fr Sa Su");
			
			for(int a=2; a<k; a++)
				System.out.print("   ");
			
			for( int j=d; j<=max[i]; j++) {
				
				if ( j < 10 )
					System.out.print("0" + j + " ");
				else
					System.out.print(j + " ");
				
				if (j==max[i] && k != 8)
					System.out.println();
				
				if ( k == 8 ) {
					System.out.println();
					k = 2;
				}
				else k++;
			}
			System.out.println("        ---   ");
		}
	}
}