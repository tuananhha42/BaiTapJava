package ex_4;

public class BenhNhan extends Nguoi {
    private String tienSu;
    private String chuanDoan;
    private BenhVien benhVien;


    // constructor no parameter
    public BenhNhan() {

    }

    // constructor parameter
    public BenhNhan(String name, int tuoi, char gioiTinh, String tienSu, String chuanDoan, BenhVien benhVien) {
        super(name, tuoi, gioiTinh);
        this.tienSu = tienSu;
        this.chuanDoan = chuanDoan;
        this.benhVien = benhVien;
    }
    // return tien su
    public String getTienSu() {
        return tienSu;
    }
    // set tien su
    public void setTienSu(String tienSu) {
        this.tienSu = tienSu;
    }

    // return chuan doan
    public String getChuanDoan() {
        return chuanDoan;
    }

    // set chuan doan
    public void setChuanDoan(String chuanDoan) {
        this.chuanDoan = chuanDoan;
    }


    // return benh vien
    public BenhVien getBenhVien() {
        return benhVien;
    }

    //	xet benh vien
    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }

    // override toString
    @Override
    public String toString() {
        return super.toString() +  "Tien su: " + tienSu + " chuan doan: " + chuanDoan + " benhVien: " + benhVien;
    }
}
