
public class Cart implements Comparable<Cart>{
    public Product sp;
    public int soLuong,gia,trangThai,tong;

    public Cart(Product sp, int soLuong) {
        this.sp = sp;
        this.soLuong = soLuong;
        this.gia=sp.getBan();
        this.trangThai =0;
        this.tong = gia*soLuong;
    }

    public Cart() {
    }

    public Product getSp() {
        return sp;
    }

    public void setSp(Product sp) {
        this.sp = sp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getTong() {
        return tong;
    }

    public void setTong(int tong) {
        this.tong = tong;
    }

    @Override
    public int compareTo(Cart o) {
        return this.getSp().getId().compareTo(o.getSp().getId());
    }

    @Override
    public String toString() {
        return sp + "," + soLuong + "," + gia + "," + trangThai + "," + tong + '}';
    }
    
}
