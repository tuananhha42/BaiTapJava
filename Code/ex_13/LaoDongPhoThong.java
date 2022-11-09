package ex_13;

public class LaoDongPhoThong extends NguoiLaoDong {
    private int soNgayCong;
    private double donGia;
    private double thuong;


    public LaoDongPhoThong() {

    }


    public LaoDongPhoThong(int soNgayCong, double donGia) {
        this.soNgayCong = soNgayCong;
        this.donGia = donGia;
    }




    @Override
    public float tinhLuong() {
        if(soNgayCong >= 25) {
            thuong = 1000000;
        }
        else if(soNgayCong <25 && soNgayCong >=15)
            thuong = 700000;
        else
            thuong = 0;
        return (float) (soNgayCong * donGia + thuong);
    }


    @Override
    public String inThongTin() {
        return super.inThongTin() + tinhLuong();
    }

}
