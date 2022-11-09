package ex_2;

public class Diachi {
    // thon
    private String thon;
    // xa
    private String xa;
    // huyen
    private String huyen;
    // tinh
    private String tinh;

    // constructor no parameter
    public Diachi() {

    }

    // constructor parameter
    public Diachi(String thon, String xa, String huyen, String tinh) {
        this.thon = thon;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }


    // return thon
    public String getThon() {
        return thon;
    }


    // set thon
    public void setThon(String thon) {
        this.thon = thon;
    }


    // return xa
    public String getXa() {
        return xa;
    }

    // set xa
    public void setXa(String xa) {
        this.xa = xa;
    }

    // return huyen
    public String getHuyen() {
        return huyen;
    }
    // set huyen
    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }
    // return tinh
    public String getTinh() {
        return tinh;
    }

    // set tinh
    public void setTinh(String tinh) {
        this.tinh = tinh;
    }


    // toString
    @Override
    public String toString() {
        return "Thon: " + thon + " xa: " + xa + " huyen: " + huyen + " tinh: " + tinh;
    }

}
