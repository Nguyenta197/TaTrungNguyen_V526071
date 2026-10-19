public class Bai2 {

    // Hàm nhận 2 mảng, in ra mảng tổng
    public static void inMangTong(int[] a, int[] b) {
        int doDai = Math.max(a.length, b.length);

        int[] c = new int[doDai];

        for (int i = 0; i < doDai; i++) {
            int x = (i < a.length) ? a[i] : 0;
            int y = (i < b.length) ? b[i] : 0;
            c[i] = x + y;
        }

        for (int i = 0; i < doDai; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {10, 20};
        inMangTong(a, b);                           // in ra: 11 22 3
    }
}