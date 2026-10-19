package baitap1;

public class BaiTap1 {
    public static void main(String[] args) {
        Diem a = new Diem(0, 0);
        Diem b = new Diem(3, 4);
        DuongThang d = new DuongThang(a, b);

        System.out.println("Do dai duong thang AB = " + d.doDai());   // 5.0
    }
}