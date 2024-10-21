import javax.swing.*;
import java.awt.*;

public class DangKyUI extends JFrame { // Jframe Lớp chính tạo

    private JLabel lblTen, lblEmail, lblMatKhau;
    private JTextField txtTen, txtEmail;
    private JPasswordField txtMatKhau;
    private JButton btnDangKy;
    private JLabel lblThongBao;

    public DangKyUI() {
        setTitle("Đăng ký tài khoản");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo các thành phần
        lblTen = new JLabel("Tên:");
        lblEmail = new JLabel("Email:");
        lblMatKhau = new JLabel("Mật khẩu:");
        txtTen = new JTextField(20);
        txtEmail = new JTextField(20);
        txtMatKhau = new JPasswordField(20);
        btnDangKy = new JButton("Đăng ký");
        lblThongBao = new JLabel("");

        // Sắp xếp các thành phần trên giao diện
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.add(lblTen);
        panel.add(txtTen);
        panel.add(lblEmail);
        panel.add(txtEmail);
        panel.add(lblMatKhau);
        panel.add(txtMatKhau);
        panel.add(btnDangKy);
        panel.add(lblThongBao);

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DangKyUI();
    }
}