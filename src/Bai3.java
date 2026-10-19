import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap day so, cach nhau bang dau cach: ");
        String dong = sc.nextLine();

        String[] cacMau = dong.trim().split(" ");

        int soPhanTu = cacMau.length;
        int tong = 0;

        for (int i = 0; i < cacMau.length; i++) {
            tong = tong + Integer.parseInt(cacMau[i]);
        }

        System.out.println("So phan tu: " + soPhanTu + "; Tong: " + tong);
    }
}