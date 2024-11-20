package dz_3.services;

import dz_3.entity.Account;
import dz_3.entity.Bill;

public class PaymentService {
    public void pay(Account account, int amount) {
        Bill bill = account.getBill();
        if (bill.getAmount() < amount){
            System.out.println("Платёж невозможен, недостаточно средств");
        }
        else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Происходит операция платежа, текущее значение счета: " + currentBillAmount);
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Платёж завершён, новое значение счёта: " + bill.getAmount());
        }
    }
}
