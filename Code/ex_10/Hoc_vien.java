package ex_10;

import java.util.Scanner;

public abstract class Hoc_vien {
    private String hoten;
    private String diachi;
    private String lct;

    public String getHoten() {
        return hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getLct() {
        return lct;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setLct(String lct) {
        this.lct = lct;
    }

    public Hoc_vien() {
    }

    public Hoc_vien(String hoten, String diachi, String lct) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.lct = lct;
    }

    public void nhapThongTin(String hoten, String diachi, String lct)
    {
       this.setHoten(new Scanner(System.in).nextLine());
       this.setDiachi(new Scanner(System.in).nextLine());
       this.setLct(new Scanner(System.in).nextLine());
    }
    public abstract int hocPhi();

    public String inThongTin()
    {
        return "Ho va ten" + hoten + "\n"
                + "Dia chi: " + diachi + "\n"
                +  "loai chuong trinhb: " + lct + "\n"
                +  "Hoc phi: "+ hocPhi() +"\n";
    }
}
