package ProjectJavaNhom11.Function;

import ProjectJavaNhom11.Function.UserManager;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng UserManager
        UserManager userManager = new UserManager();

        // Đăng ký tài khoản mới
        String result1 = userManager.register("Nguyen Van A", "email@example.com", "password123", "01-01-1990", "Nam", "0901234567", "123 Đường ABC", "123456789");
        System.out.println(result1);  // Kết quả sẽ là thông báo thành công hoặc lỗi

        // Thử đăng ký tài khoản khác với cùng email để kiểm tra tính duy nhất
        String result2 = userManager.register("Tran Thi B", "email@example.com", "password123", "02-02-1992", "Nu", "0912345678", "456 Đường XYZ", "987654321");
        System.out.println(result2);  // Kết quả: Email đã được sử dụng.

        // Đăng ký tài khoản khác với email mới
        String result3 = userManager.register("Le Van C", "newemail@example.com", "password456", "03-03-1993", "Nam", "0933333333", "789 Đường DEF", "123123123");
        System.out.println(result3);  // Kết quả sẽ là thông báo thành công cho tài khoản mới
    }
}