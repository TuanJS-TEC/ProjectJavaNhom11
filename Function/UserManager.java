package ProjectJavaNhom11.Function;

import ProjectJavaNhom11.Object.User;

import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> usersList;

    public UserManager() {
        usersList = new ArrayList<>();
    }

    public String register(String tenNguoiDund, String email,String password,String dob,String gioiTinh,String sdt,String diaChiGiaoHang,String tknh) {
        //kiem tra email da duoc su dung chua
        if(findUserByEmail(email) != null){
            return "Email Already Exists";
        }

        //Tao doi tuong User moi va them vao danh sach
        User newUser = new User(tenNguoiDund, email, password, dob, gioiTinh, sdt, diaChiGiaoHang, tknh);
        usersList.add(newUser);

        return "Register Success";
    }

    //Phuong thuc tim kiem nguoi dung bang email
    private User findUserByEmail(String email) {
        for (User user : usersList) {
            if(user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }
}

