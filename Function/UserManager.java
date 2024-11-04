package ProjectJavaNhom11.Function;

import ProjectJavaNhom11.Object.User;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> usersList;
    private static final String File_Name = "Users.txt";

    public UserManager() {
        this.usersList = new ArrayList<>();
    }

    public String register(String tenNguoiDund, String email,String password,String dob,String gioiTinh,String sdt,String diaChiGiaoHang,String NganHang,String tknh) {
        //kiem tra email da duoc su dung chua
        if(findUserByEmail(email) != null){
            return "Email Already Exists";
        }

        //Tao doi tuong User moi va them vao danh sach
        User newUser = new User(tenNguoiDund,email,password,dob,gioiTinh,sdt,diaChiGiaoHang,NganHang,tknh);
        usersList.add(newUser);

        //Ghi thong tin nguoi dung vao file CSV
        saveUserToFile(newUser);

        return "Register Success.Your UserId is:" + newUser.getId();
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

    //Phuong thuc de in tat ca nguoi dung
    public void printUsers() {
        for (User user : usersList) {
            System.out.println(user);
        }
    }

    private void saveUserToFile(User user) {
        try(FileWriter writer = new FileWriter(File_Name,true)){
            writer.write("ID User: " + user.getId()+"\n" + "User Name: "+user.getTenNguoiDung()+"\n"+"User's Email: "+user.getEmail()+"\n"+"User's DOB: "+user.getDob()+"\n"+"User's Gender: "+user.getGioiTinh()+"\n"+"User's SDT: "+user.getSdt()+"\n"+"User's TKNH: "+user.getTknh()+"\n");
        }catch (IOException e){
            System.out.println("Error saving user"+e.getMessage());
        }
    }
}

