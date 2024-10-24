
public class Admin implements Comparable<Admin>{
    public static int count=1;
    public String id,tenNhanVien,email,password;
    public String dob,diaChi,sdt,gioiTinh;

    public Admin() {
    }

    public Admin(String tenNhanVien, String email, String password, String dob, String diaChi, String sdt, String gioiTinh) {
        this.id="NV"+String.format("%03d", count); count++;
        this.tenNhanVien = tenNhanVien;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public int compareTo(Admin o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id + "," + tenNhanVien + "," + email + "," + password + "," + dob + "," + diaChi + "," + sdt + "," + gioiTinh;
    }
    
}
