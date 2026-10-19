package baitap1;

public class DuongThang {
    private Diem A;
    private Diem B;

    public DuongThang(Diem A, Diem B) {
        this.A = A;
        this.B = B;
    }

    public Diem getA() { return A; }
    public Diem getB() { return B; }

    // Độ dài = căn bậc hai của (dx² + dy²)
    public double doDai() {
        double dx = B.getX() - A.getX();
        double dy = B.getY() - A.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}