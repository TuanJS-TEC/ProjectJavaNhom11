package ProjectJavaNhom11.Function;

import ProjectJavaNhom11.Function.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {
    private JTextField nameField, emailField, dobField, genderField, phoneField, addressField, bankField;
    private JPasswordField passwordField;
    private JButton registerButton;

    private UserManager userManager;

    public RegistrationForm(UserManager userManager) {
        this.userManager = userManager;

        setTitle("Đăng Ký Tài Khoản");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Đặt cửa sổ ở giữa màn hình

        // Tạo panel chính
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2, 10, 10));

        // Thêm các nhãn và ô nhập liệu vào giao diện
        panel.add(new JLabel("Tên người dùng:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Mật khẩu:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        panel.add(new JLabel("Ngày sinh (dd-mm-yyyy):"));
        dobField = new JTextField();
        panel.add(dobField);

        panel.add(new JLabel("Giới tính:"));
        genderField = new JTextField();
        panel.add(genderField);

        panel.add(new JLabel("Số điện thoại:"));
        phoneField = new JTextField();
        panel.add(phoneField);

        panel.add(new JLabel("Địa chỉ giao hàng:"));
        addressField = new JTextField();
        panel.add(addressField);

        panel.add(new JLabel("Tài khoản ngân hàng:"));
        bankField = new JTextField();
        panel.add(bankField);

        // Thêm nút đăng ký
        registerButton = new JButton("Đăng Ký");
        registerButton.addActionListener(this); // Lắng nghe sự kiện
        panel.add(registerButton);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registerButton) {
            // Lấy dữ liệu từ các ô nhập
            String name = nameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());
            String dob = dobField.getText();
            String gender = genderField.getText();
            String phone = phoneField.getText();
            String address = addressField.getText();
            String bankAccount = bankField.getText();

            // Gọi phương thức register của userManager để đăng ký
            String result = userManager.register(name, email, password, dob, gender, phone, address, bankAccount);
            JOptionPane.showMessageDialog(this, result); // Hiển thị kết quả đăng ký
        }
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        RegistrationForm registrationForm = new RegistrationForm(userManager);
        registrationForm.setVisible(true);
    }
}

