package anhtester.com.javabasic.kieudulieu;

public class Bank {
    static int VAT = 10000;
    static float INTEREST_RATE = 7.3F;
    static String BANK_NAME = "BIDV";
    static String ADDRESS = "Hương Trà, Thừa Thiên Huế";
    static String PHONE = "0332135706";
    public static void getBankInfo(){
        System.out.println("Bank name: " + BANK_NAME);
        System.out.println("Địa chỉ: " + ADDRESS);
        System.out.println("Số điện thoại: " + PHONE);
        System.out.println("Lãi suất: " + INTEREST_RATE);
    }
    public static float getInterestRate(){
        return INTEREST_RATE;
    }
}
