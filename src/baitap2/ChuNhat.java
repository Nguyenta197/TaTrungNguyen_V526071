package baitap2;

public class ChuNhat {
    private double dai;
    private double rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double chuVi() { return 2 * (dai + rong); }
    public double dienTich() { return dai * rong; }
}