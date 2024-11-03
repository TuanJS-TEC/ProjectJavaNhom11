package ProjectJavaNhom11.Object;

public class Product implements Comparable<Product> {
    public static int count=1;
    public String id,tenSP,loaiSP;
    public int mua,ban;
    public String moTa,hinhAnh;

    public Product(String tenSP, String loaiSP, int mua, int ban, String moTa, String hinhAnh) {
        this.id="SP"+String.format("%03d", count); count++;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.mua = mua;
        this.ban = ban;
        this.moTa = moTa;
        this.hinhAnh = hinhAnh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public int getMua() {
        return mua;
    }

    public void setMua(int mua) {
        this.mua = mua;
    }

    public int getBan() {
        return ban;
    }

    public void setBan(int ban) {
        this.ban = ban;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    @Override
    public int compareTo(Product o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id + "," + tenSP + "," + loaiSP + "," + mua + "," + ban + "," + moTa + "," + hinhAnh;
    }
    
}
    
