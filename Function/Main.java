package ProjectJavaNhom11.Function;

import ProjectJavaNhom11.Function.UserManager;

import java.util.Scanner;

public class Main {
    private static UserManager userManager = new UserManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Đăng ký");
            System.out.println("2. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới

            if (choice == 1) {
                registerUser(scanner);
            } else if (choice == 2) {
                System.out.println("Thoát chương trình.");
                break;
            } else {
                System.out.println("Lựa chọn không hợp lệ.");
            }
        }

        scanner.close();
    }

    private static void registerUser(Scanner scanner) {
        System.out.println("=== Đăng Ký Tài Khoản ===");

        System.out.print("Nhập tên người dùng: ");
        String tenNguoiDung = scanner.nextLine();

        System.out.print("Nhập email: ");
        String email = scanner.nextLine();

        System.out.print("Nhập mật khẩu: ");
        String password = scanner.nextLine();

        System.out.print("Nhập ngày sinh (dd-mm-yyyy): ");
        String dob = scanner.nextLine();

        System.out.print("Nhập giới tính: ");
        String gioiTinh = scanner.nextLine();

        System.out.print("Nhập số điện thoại: ");
        String sdt = scanner.nextLine();

        System.out.print("Nhập địa chỉ giao hàng: ");
        String diaChiGiaoHang = scanner.nextLine();

        System.out.print("Nhập số tài khoản ngân hàng: ");
        String tknh = scanner.nextLine();

        // Gọi phương thức register để tạo tài khoản
        String result = userManager.register(tenNguoiDung, email, password, dob, gioiTinh, sdt, diaChiGiaoHang,NganHang,tknh);
        System.out.println(result);
    }
}
