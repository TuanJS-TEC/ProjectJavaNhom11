
public class Shipper implements Comparable<Shipper>{
    public static int count=1;
    public String id,tenCongTy,diaChi,sdt,email,khuVucVanChuyen;
    public int giaVanChuyen;

    public Shipper() {
    }

    public Shipper(String tenCongTy, String diaChi, String sdt, String email, String khuVucVanChuyen, int giaVanChuyen) {
        this.id = "S"+String.format("%03d",count); count++;
        this.tenCongTy = tenCongTy;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
        this.khuVucVanChuyen = khuVucVanChuyen;
        this.giaVanChuyen = giaVanChuyen;
    }

    @Override
    public int compareTo(Shipper o) {
        return this.id.compareTo(o.id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKhuVucVanChuyen() {
        return khuVucVanChuyen;
    }

    public void setKhuVucVanChuyen(String khuVucVanChuyen) {
        this.khuVucVanChuyen = khuVucVanChuyen;
    }

    public int getGiaVanChuyen() {
        return giaVanChuyen;
    }

    public void setGiaVanChuyen(int giaVanChuyen) {
        this.giaVanChuyen = giaVanChuyen;
    }

    @Override
    public String toString() {
        return id + "," + tenCongTy + "," + diaChi + "," + sdt + "," + email + "," + khuVucVanChuyen + "," + giaVanChuyen;
    }
    
}
