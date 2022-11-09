package ex_11;

public class GVThinhGiang extends giangvien {
    float lcb;
    int hso;
    int thamnien;

    public GVThinhGiang(String hoten, String diachi, String lgvien) {
        super(hoten, diachi, lgvien);
    }

    public GVThinhGiang(String hoten, String diachi, String lgvien, float lcb, int hso, int thamnien) {
        super(hoten, diachi, lgvien);
        this.lcb = lcb;
        this.hso = hso;
        this.thamnien = thamnien;
    }

    public void setLcb(float lcb) {
        this.lcb = lcb;
    }

    public void setHso(int hso) {
        this.hso = hso;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public float getLcb() {
        return lcb;
    }

    public int getHso() {
        return hso;
    }

    public int getThamnien() {
        return thamnien;
    }
    @Override
    public float tinhLuong()
    {   float phucap;
        float luong;
        if(thamnien < 5) {
            phucap = 0;
            return luong = lcb * hso;
        }
        else
        {
            phucap = (lcb * thamnien)/100;
            return luong = lcb*hso -phucap;
        }

    }

    @Override
    public String inThongTin() {
        return super.inThongTin();
    }
}
