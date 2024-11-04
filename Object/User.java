package ProjectJavaNhom11.Object;

import java.util.*;

public class User implements Comparable<User>, Iterable{
    public static int count=1;
    public String id,tenNguoiDung,email,password;
    public String dob,gioiTinh,sdt,diaChiGiaoHang,NganHang,tknh;
    public ArrayList<Cart> gio;
    public User() {
    }

    public User(String tenNguoiDung, String email, String password, String dob, String gioiTinh, String sdt, String diaChiGiaoHang, String tknh) {
        this.id="KH"+String.format("%03d",count);
        this.tenNguoiDung = tenNguoiDung;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.diaChiGiaoHang = diaChiGiaoHang;
        this.NganHang = NganHang;
        this.tknh = tknh;
        this.gio=new ArrayList<>();
        count++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChiGiaoHang() {
        return diaChiGiaoHang;
    }

    public void setDiaChiGiaoHang(String diaChiGiaoHang) {
        this.diaChiGiaoHang = diaChiGiaoHang;
    }

    public String getNganHang() { return NganHang; }
    public void setNganHang(String nganHang) {
        this.NganHang = nganHang;
    }

    public String getTknh() {
        return tknh;
    }

    public void setTknh(String tknh) {
        this.tknh = tknh;
    }

    public ArrayList<Cart> getGio() {
        return gio;
    }

    public void setGio(ArrayList<Cart> gio) {
        this.gio = gio;
    }

    public void addGio(Cart o){
        gio.add(o);
    }
    
    @Override
    public int compareTo(User o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id + "," + tenNguoiDung + "," + email + "," + password + "," + dob + "," + gioiTinh + "," + sdt + "," + diaChiGiaoHang + "," + tknh;
    }

    @Override
    public Iterator iterator() {
        return gio.iterator();
    }
}
