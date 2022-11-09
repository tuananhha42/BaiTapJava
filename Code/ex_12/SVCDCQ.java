package ex_12;

public class SVCDCQ extends Nguoi{
    private float TDKT;
    private int SMKT;
    private float DTKTHP;

    public SVCDCQ() {

    }

    public SVCDCQ(float TDKT, int SMKT, float DTKHP) {
        this.TDKT = TDKT;
        this.SMKT = SMKT;
        this.DTKTHP = DTKHP;
    }

    @Override
    public float tinhDiem() {
        return (TDKT/SMKT +DTKTHP)/3;
    }


    @Override
    public String inThongTin() {
        return super.inThongTin() + " ĐTB: " + tinhDiem();
    }
}
