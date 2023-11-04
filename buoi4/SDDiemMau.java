package buoi4;

public class SDDiemMau {
	public static void main(String[] args) {
		/*
		Viết lớp SDDiemMau có hàm main() thực hiện các công việc sau:
		+ Tạo 1 điểm màu A có tọa độ là (5, 10) và màu là trắng. Hiển thị thông tin ra màn hình.
		+ Tạo 1 điểm màu tổng quát B. Nhập giá trị từ bàn phím cho điểm B. Dời điểm B đi 1 độ dời
		(10,8). Hiển thị tọa độ điểm B ra màn hình. Gán màu mới cho điểm B là màu “Vàng”.
		*/
		DiemMau A = new DiemMau(5,10,"trắng");
		System.out.print("Điểm A là : " + A);
		DiemMau B = new DiemMau();
		B.nhapDiem();
		B.doiDiem(10, 8);
		System.out.print("Điểm B là : " + B);
		B.ganMau("Vàng");
		System.out.print("Điểm B là : " + B);
	}

}
