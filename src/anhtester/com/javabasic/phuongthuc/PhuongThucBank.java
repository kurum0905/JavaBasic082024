package anhtester.com.javabasic.phuongthuc;

import anhtester.com.javabasic.kieudulieu.Bank;

public class PhuongThucBank {
    public static void main(String[] args) {
        Bank.getBankInfo();
        int TienGui = 1000000;
        double TongTien = (Bank.getInterestRate() / 100 * TienGui) + TienGui;
        System.out.println("Tổng tiền: " + TongTien);
    }
}
