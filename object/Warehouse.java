
public class Warehouse implements Comparable<Warehouse>{
    public Product sp;
    public int daBan,hienCo;

    public Warehouse(Product sp, int daBan, int hienCo) {
        this.sp = sp;
        this.daBan = daBan;
        this.hienCo = hienCo;
    }

    public Product getSp() {
        return sp;
    }

    public void setSp(Product o) {
        this.sp = o;
    }

    public int getDaBan() {
        return daBan;
    }

    public void setDaBan(int daBan) {
        this.daBan = daBan;
    }

    public int getHienCo() {
        return hienCo;
    }

    public void setHienCo(int hienCo) {
        this.hienCo = hienCo;
    }

    @Override
    public int compareTo(Warehouse o) {
        return this.sp.getId().compareTo(o.sp.getId());
    }

    @Override
    public String toString() {
        return sp.getId()+","+sp.getTenSP() + "," + daBan + "," + hienCo;
    }
    
}
