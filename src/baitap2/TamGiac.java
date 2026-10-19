package baitap2;

public class TamGiac {
    private Diem A, B, C;

    public TamGiac(Diem A, Diem B, Diem C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    // Khoảng cách giữa 2 điểm
    private double khoangCach(Diem p, Diem q) {
        double dx = q.getX() - p.getX();
        double dy = q.getY() - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double chuVi() {
        return khoangCach(A, B) + khoangCach(B, C) + khoangCach(C, A);
    }

    // Diện tích theo toạ độ 3 điểm
    public double dienTich() {
        double s = (B.getX() - A.getX()) * (C.getY() - A.getY())
                - (C.getX() - A.getX()) * (B.getY() - A.getY());
        return Math.abs(s) / 2;
    }
}