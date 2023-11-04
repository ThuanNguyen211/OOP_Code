package buoi0;

import java.util.Scanner;

public class Student {

	private String id, name , address;
	private int age;
	private float gpa;
	private Scanner sc;
	
	public Student() {
		id = new String();
		name = new String();
		address = new String();
		age = 0;
		gpa = 0.0f;
	}
	public Student(Student s) {
		id = new String(s.id);
		name = new String(s.name);
		address = new String(s.address);
		age = s.age;
		gpa = s.gpa;
	}
	public void readStudent() {
		sc = new Scanner(System.in);
		System.out.print("Enter ID : ");
		id = sc.nextLine();
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		System.out.print("Enter Age : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Address : ");
		address = sc.nextLine();
		System.out.print("Enter GPA : ");
		gpa = sc.nextFloat();
		sc.nextLine();
	}
	public void printStudent() {
		System.out.println( id + ", " + name + ", " + age + ", " + address + ", " + gpa + "\n");
	}
	public String toString() {
		return ( id + ", " + name + ", " + age + ", " + address + ", " + gpa + "\n" );
	}
	public void editAddress() {
		System.out.print("Enter new address : ");
		sc = new Scanner(System.in);
		address = sc.nextLine();
	}
	public void editAge() {
		System.out.print("Enter new age : ");
		sc = new Scanner(System.in);
		age = sc.nextInt();
	}
	public void editGpa() {
		System.out.print("Enter new gpa : ");
		sc = new Scanner(System.in);
		gpa = sc.nextFloat();
	}
	public String getID() {
		return id;
	}
	public float getGpa() {
		return gpa;
	}
	public String getName() {
		return name;
	}
}
