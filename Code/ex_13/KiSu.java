package ex_13;

public class KiSu extends NguoiLaoDong{
    private double luongCB;
    private int heSoLuong;
    private int ngayCong;
    private double thuong;

    public KiSu() {

    }

    public KiSu(double luongCB, int heSoLuong, int ngayCong ) {
        this.luongCB = luongCB;
        this.heSoLuong = heSoLuong;
        this.ngayCong =  ngayCong;
    }

    @Override
    public float tinhLuong() {
        if(ngayCong >=25)
            thuong = 2000000;
        else if(ngayCong <25 && ngayCong >=15)
            thuong = 1000000;
        else
            thuong = 500000;
        return (float) (luongCB * heSoLuong + thuong);
    }


    @Override
    public String inThongTin() {
        return super.inThongTin() + tinhLuong();
    }

}
