package ex_11;

public abstract class giangvien {
    private String hoten;
    private String diachi;
    private String lgvien;

    public giangvien() {
    }

    public giangvien(String hoten, String diachi, String lgvien) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.lgvien = lgvien;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setLgvien(String lgvien) {
        this.lgvien = lgvien;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public String getLgvien() {
        return lgvien;
    }
    public abstract float tinhLuong();
    public String inThongTin()
    {
        return "Ho va ten: " + hoten + "\n" +
                "Dia chi: " + diachi + "\n" +
                "Loai giang vien: "  +lgvien + "\n" +
                "Luong thang: " + tinhLuong() + "\n";
    }

}
