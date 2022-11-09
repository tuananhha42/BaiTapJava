package ex_14;

public class CNKSP extends CongNhan{
    private int soSP;
    private float donGia;
    private float thuong;


    public CNKSP() {

    }
    public CNKSP(int soSP, float donGia) {
        this.soSP = soSP;
        this.donGia = donGia;
    }




    @Override
    public float tinhLuong() {
        if(soSP <= 1000)
            thuong = 0;
        else if((soSP -1000) == 100 )
            thuong = 1000000;
        else if((soSP - 1000) == 150)
            thuong = 1500000;
        return soSP *donGia + thuong;
    }

    @Override
    public String inThongTin() {

        return super.inThongTin() + tinhLuong();
    }

}
