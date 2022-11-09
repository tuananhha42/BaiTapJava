package ex_4;

public class Nguoi {
    // ten
    private String ten;

    // tuoi
    private int tuoi;

    // gioi tinh
    private char gioiTinh;

    // constructor no paramter
    public Nguoi(){

    }

    // constructor parameter
    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }


    // return ten
    public String getTen() {
        return ten;
    }


    // set ten
    public void setTen(String ten) {
        this.ten = ten;
    }

    // return tuoi
    public int getTuoi() {
        return tuoi;
    }

    // set tuoi
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    // return gioiTinh
    public char getGioiTinh() {
        return gioiTinh;
    }

    // set gioiTinh
    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    // override toString
    public String toString() {
        return "Ten: " + ten + " tuoi: " + tuoi + " gioi Tinh: " + gioiTinh;
    }

}
