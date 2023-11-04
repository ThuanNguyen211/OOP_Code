package buoi2;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem(3,4);
		System.out.print("Tọa độ điểm A là : ");
		A.hienThi();	
		Diem B = new Diem();
		B.nhapDiem();
		System.out.print("Tọa độ điểm B là : ");
		B.hienThi();
		Diem C = new Diem(-B.layX(),-B.layY());
		System.out.print("Tọa độ điểm C là : ");
		C.hienThi();
		System.out.println("Khoảng cách từ điểm B đến tâm O là : " + B.khoangCach());
		System.out.println("Khoảng cách từ điểm A đến điểm B là : " + A.khoangCach(B));
    }
}