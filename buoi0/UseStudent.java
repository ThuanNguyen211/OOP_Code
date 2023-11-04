package buoi0;

import java.util.Scanner;

public class UseStudent extends MyLinkedList{
	private static Scanner sc;
	private static Student tempStudent;
	private static String tempString;
	private static boolean found;
	private static Node headNode, curNode;


	public static void main(String[] args) {
		Student s = new Student();
		s.readStudent();
		s.printStudent();
		Node List = new Node(s);
		sc = new Scanner(System.in);
		int c = 7;
		while( c != 0)
		{
			System.out.println("---------------------------------------------");
			System.out.println("Enter 1. Add student : ");
			System.out.println("Enter 2. Edit student by id : ");
			System.out.println("Enter 3. Delete student by id : ");
			System.out.println("Enter 4. Sort student by gpa : ");
			System.out.println("Enter 5. Sort student by name : ");
			System.out.println("Enter 6. Show student : ");
			System.out.println("Enter 0. Exit. ");
			System.out.println("---------------------------------------------");
			System.out.print("Enter : ");
			c = sc.nextInt();
			sc.nextLine();
			switch (c) {
			
				case 1 :{
					Student tempStudent = new Student();
					tempStudent.readStudent();
					List = addToTail(List,tempStudent);
					break;
				}
				case 2 :{
					System.out.print("Enten ID : ");
					tempString = new String();
					tempString = sc.nextLine();
					headNode = List;
					found = false;
					while ( headNode != null) {
						if ( headNode.value.getID().equals(tempString) ) {
							int c2 = 0;
							found = true;
							System.out.println("Enter 1. Edit Address : ");
							System.out.println("Enter 2. Edit Age : ");
							System.out.println("Enter 3. Edit Gpa : ");
							System.out.print("Enter : ");
							c2 = sc.nextInt();
							sc.nextLine();
							if( c2 == 1)
								headNode.value.editAddress();
							else if (c2 == 2)
								headNode.value.editAge();
							else if (c2 == 3)
								headNode.value.editGpa();
							
						}
						headNode = headNode.next;
					}
					if(!found)
						System.out.println("ID not found!");	
					break;
	
				}
				case 3 : {
					System.out.print("Enter ID : ");
					tempString = new String();
					tempString = sc.nextLine();
					int i = 0;
					found = false;
					headNode = List;
					while ( headNode != null) {
						if ( headNode.value.getID().equals(tempString) ) {
							List = removeAtIndex(headNode,i);
							found = true;
							break;
						}
						else {
							i++;
							headNode = headNode.next;						
						}
					}
					if(!found)
						System.out.println("*ID not found!");
					break;

				}
				case 4 :  {
					headNode = List;
					while(headNode != null) {						
						curNode = headNode.next;
						while(curNode != null) {
							if (headNode.value.getGpa() > curNode.value.getGpa()) {
								tempStudent = new Student(headNode.value);
								headNode.value = new Student(curNode.value);
								curNode.value = new Student(tempStudent);
							}
							curNode = curNode.next;
						}
						headNode = headNode.next;
					}
					break;
				
				}
				case 5 :  {
					headNode = List;
					while(headNode != null) {						
						curNode = headNode.next;
						while(curNode != null) {
							if (headNode.value.getName().compareTo(curNode.value.getName()) > 0 ) {
								tempStudent = new Student(headNode.value);
								headNode.value = new Student(curNode.value);
								curNode.value = new Student(tempStudent);
							}
							curNode = curNode.next;
						}
						headNode = headNode.next;
					}
					break;
				}
				case 6 :{
					printLinkedList(List);
					break;				
				}
			}
		
		}while(c != 0);
		System.out.println("The program is finished");

	}
}