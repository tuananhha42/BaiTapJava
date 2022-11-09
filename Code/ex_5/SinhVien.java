package ex_5;

public class SinhVien extends Nguoi {
    private String lop;
    private String nganh;
    private Truong truong;

    // constructor no parameter
    public SinhVien() {

    }

    // constructor parameter
    public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
        super(ten, tuoi, gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    // return lop
    public String getLop() {
        return lop;
    }

    // set lop
    public void setLop(String lop) {
        this.lop = lop;
    }

    // return nhanh
    public String getNganh() {
        return nganh;
    }

    // set nganh
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    // return nganh
    public Truong getTruong() {
        return truong;
    }

    // set nganh
    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    // override
    @Override
    public String toString() {
        return super.toString() + " Lop:" + lop + " Nganh: " + nganh + " Truong: " + truong;
    }
}
