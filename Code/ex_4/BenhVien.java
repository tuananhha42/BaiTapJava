package ex_4;

public class BenhVien {
    private String ten;
    private String diaChi;
    private String giamDoc;

    // constructor no parameter
    public BenhVien(){

    }

    // constructor
    public BenhVien(String ten, String diaChi, String giamDoc) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
    }

    // return name
    public String getTen() {
        return ten;
    }

    // set name
    public void setTen(String ten) {
        this.ten = ten;
    }

    // return dia Chi
    public String getDiaChi() {
        return diaChi;
    }

    // set dia chi
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    // return giamdoc
    public String getGiamDoc() {
        return giamDoc;
    }

    // set giam doc
    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    // override toString
    public String toString() {
        return "Ten: " + ten + " Dia chi: " + diaChi + " Giam doc: " + giamDoc;
    }

}
