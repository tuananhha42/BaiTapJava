package ex_11;

public class GVCoHuu extends giangvien{
    int tiet;
    float dg;

    public GVCoHuu(String hoten, String diachi, String lgvien) {
        super(hoten, diachi, lgvien);
    }

    public GVCoHuu(String hoten, String diachi, String lgvien, int tiet, float dg) {
        super(hoten, diachi, lgvien);
        this.tiet = tiet;
        this.dg = dg;
    }

    public void setTiet(int tiet) {
        this.tiet = tiet;
    }

    public void setDg(float dg) {
        this.dg = dg;
    }

    public int getTiet() {
        return tiet;
    }

    public float getDg() {
        return dg;
    }
    @Override
    public float tinhLuong()
    {
        float luong,pcap;
        pcap = 15*(tiet*dg)/100;
        luong = tiet*dg - pcap;
        return luong;
    }
    @Override
    public String inThongTin()
    {
        return super.inThongTin();
    }
}
