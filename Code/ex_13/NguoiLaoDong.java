package ex_13;

public abstract class NguoiLaoDong {
    private String hoTen;
    private String diaChi;
    private LoaiLaoDong loaiLaoDong;



    public NguoiLaoDong(){

    }


    public NguoiLaoDong(String hoTen, String diaChi, LoaiLaoDong loaiLaoDong){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiLaoDong = loaiLaoDong;
    }


    public void nhapThongTin(String hoTen, String diaChi, LoaiLaoDong loaiLaoDong){
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiLaoDong = loaiLaoDong;
    }

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public LoaiLaoDong getLoaiLaoDong() {
        return loaiLaoDong;
    }
    public void setLoaiLaoDong(LoaiLaoDong loaiLaoDong) {
        this.loaiLaoDong = loaiLaoDong;
    }



    public abstract float tinhLuong();


    public String inThongTin() {
        return "Họ Tên: " + hoTen + " địa chỉ: " + diaChi + " loại lao động: " + loaiLaoDong + "Lương: ";
    }
}
