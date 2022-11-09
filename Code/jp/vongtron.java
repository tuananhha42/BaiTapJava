package jp;

public class vongtron {
    private int r;
    public void setR(int r)
    {
        this.r = r;
    }
    protected double tinhCV()
    {
        return Math.PI*r*2;
    }
    void hienthi()
    {
        System.out.print("Ban kinh hinh tron la: " + r + "\nChu vi hinh tron la: "+ tinhCV());
    }
}
