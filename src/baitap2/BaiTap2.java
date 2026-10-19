package baitap2;

import java.util.Random;

public class BaiTap2 {
    public static void main(String[] args) {
        Random rd = new Random();

        // 2 tam giác
        for (int i = 1; i <= 2; i++) {
            TamGiac t = new TamGiac(
                    new Diem(rd.nextInt(10), rd.nextInt(10)),
                    new Diem(rd.nextInt(10), rd.nextInt(10)),
                    new Diem(rd.nextInt(10), rd.nextInt(10)));
            System.out.printf("Tam giac %d: chu vi = %.2f, dien tich = %.2f%n",
                    i, t.chuVi(), t.dienTich());
        }

        // 2 chữ nhật
        for (int i = 1; i <= 2; i++) {
            ChuNhat c = new ChuNhat(rd.nextInt(10) + 1, rd.nextInt(10) + 1);
            System.out.printf("Chu nhat %d: chu vi = %.2f, dien tich = %.2f%n",
                    i, c.chuVi(), c.dienTich());
        }

        // 2 hình tròn
        for (int i = 1; i <= 2; i++) {
            HinhTron h = new HinhTron(new Diem(rd.nextInt(10), rd.nextInt(10)),
                    rd.nextInt(10) + 1);
            System.out.printf("Hinh tron %d: chu vi = %.2f, dien tich = %.2f%n",
                    i, h.chuVi(), h.dienTich());
        }
    }
}