package dz_3.services;

import dz_3.entity.Account;
import dz_3.entity.Bill;

public class DepositService {
    public void deposit(Account account, int amount) {
        Bill bill = account.getBill();
        int currentBillAmount = bill.getAmount();
        System.out.println("Происходит операция пополнения, текущее значение счёта: " + currentBillAmount);
        bill.setAmount(currentBillAmount + amount);
        System.out.println("Пополнение завершёно, новое значение счёта: " + bill.getAmount());
    }

}
