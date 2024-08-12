package anhtester.com.javabasic.kieudulieu;

public class KieuDuLieu1 {
    boolean checkValue = true;
    int numberInt = 1000000;
    public static void main(String[] args) {
        KieuDuLieu1 kdl = new KieuDuLieu1();
        System.out.println(kdl.numberInt);
        System.out.println(Bank.BANK_NAME);
        System.out.println(Bank.VAT);
        System.out.println(Bank.INTEREST_RATE);
        System.out.println(Bank.ADDRESS);
        System.out.println(Bank.PHONE);
    }
}
