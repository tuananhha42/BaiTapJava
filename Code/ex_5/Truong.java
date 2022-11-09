package ex_5;

public class Truong {
    private String ten;
    private String diaChi;
    private String hieuTruong;

    // constructor no parameter
    public Truong() {

    }

    // constructor parameter
    public Truong(String ten, String diaChi, String hieuTruong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }

    //	return ten
    public String getTen() {
        return ten;
    }

    //	set ten
    public void setTen(String ten) {
        this.ten = ten;
    }

    // return diaChi
    public String getDiaChi() {
        return diaChi;
    }
    // set diaChi
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    // return hieuTruong
    public String getHieuTruong() {
        return hieuTruong;
    }

    //	set hieu truong
    public void setHieuTruong(String hieuTruong) {
        this.hieuTruong = hieuTruong;
    }

    @Override
    public String toString() {
        return "Ten: "+ ten + "dia chi:" + diaChi + "Hieu Truong" + hieuTruong;
    }

}
