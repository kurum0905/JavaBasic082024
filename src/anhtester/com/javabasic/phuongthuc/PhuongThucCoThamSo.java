package anhtester.com.javabasic.phuongthuc;

public class PhuongThucCoThamSo {
    static float INTEREST_RATE = 7.3F;

    public static double tinhLai(long soTienGui) {
        return ((soTienGui * INTEREST_RATE) / 100);
    }

    public static double tongTienThanhToan(int donGia
            , int soLuong, double khuyenMai) {
        return (donGia - (donGia * khuyenMai)) * soLuong;
    }

    public static void main(String[] args) {
        System.out.println("Tiền lãi sau 12 tháng: " + tinhLai(7000000));
        System.out.println("Tổng tiền phải thanh toán: " + tongTienThanhToan(50000, 3, 0) + "đ");
    }
}
