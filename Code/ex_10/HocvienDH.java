package ex_10;

public class HocvienDH extends Hoc_vien {
    int lut;
    int dg;
    int sb;

    public HocvienDH(String hoten, String diachi, String lct) {
        super(hoten, diachi, lct);
    }

    public HocvienDH(String hoten, String diachi, String lct, int lut, int dg, int sb) {
        super(hoten, diachi, lct);
        this.lut = lut;
        this.dg = dg;
        this.sb = sb;
    }

    public void setLut(int lut) {
        this.lut = lut;
    }

    public void setDg(int dg) {
        this.dg = dg;
    }

    public void setSb(int sb) {
        this.sb = sb;
    }

    public int getLut() {
        return lut;
    }

    public int getDg() {
        return dg;
    }

    public int getSb() {
        return sb;
    }

    @Override
    public int hocPhi()
    {
        int hp;
        if (lut == 1)
            return hp = dg*sb - 1000000;
        else
            return hp = dg*sb - 50000;

    }
    @Override
    public String inThongTin()
    {
        return super.inThongTin() + "Loai uu tien: " + lut + "\n";
    }

}
