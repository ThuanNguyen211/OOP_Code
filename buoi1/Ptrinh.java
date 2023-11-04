package buoi1;

import java.util.Scanner;

public class Ptrinh {
	private int a, b, c;
	
	private static Scanner sc;
	public void read() {
		sc = new Scanner(System.in);
		System.out.print("Nhap a: ");
		a = sc.nextInt();
		System.out.print("Nhap b: ");
		b = sc.nextInt();
		System.out.print("Nhap c: ");
		c = sc.nextInt();
		
	}
	
	public static void bacNhat(int b, int c){
		if ( b==0 && c==0)
			System.out.println("Phương trình vô số nghiệm");
		else if ( b==0 )
			System.out.println("Phương trình vô nghiệm");
		else 
			System.out.println("Phuơng trình có nghiệm là ");
			System.out.print("x = " + (float)(-c/b) + " ");
	}
	
	public static void bacHai(int a, int b, int c) {
		if ( a == 0)
			bacNhat(b,c);
		else {
			double dt;
			dt = Math.sqrt(Math.pow(b, 2) - 4*a*c);
			
			if( dt<0 )
				System.out.println("Phương trình vô nghiệm");
			else if( dt==0) {
				System.out.println("Phương trình có nghiệm kép");
				System.out.print("x = " + (float)(-b/(2*a)) + " ");
			}
			else if ( dt>0){
				System.out.println("Phương trình có hai nghiệm");
				float x1 = (float)(-b + Math.sqrt(dt))/(2*a);
				float x2 = (float)(-b - Math.sqrt(dt))/(2*a);
				System.out.print("x1 = " + x1 + " \n");
				System.out.print("x2 = " + x2 + " ");
			}
		}
	}
	public static void main(String[] args) {
		Ptrinh t = new Ptrinh();
		
		t.read();
		bacHai(t.a, t.b, t.c);
	}
}
