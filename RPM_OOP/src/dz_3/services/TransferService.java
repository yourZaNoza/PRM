package dz_3.services;

import dz_3.entity.Account;
import dz_3.entity.Bill;

public class TransferService {
    public void transfer(Account accountFrom, Account accountTo, int amount) {
        int billFromAmount = accountFrom.getBill().getAmount();
        int billToAmount = accountTo.getBill().getAmount();

        if (billFromAmount < amount) {
            System.out.println("Перевод невозможен, недостаточно средств");
        } else {
            System.out.println("Происходит перевод средств с аккаунта - " +
                    accountFrom.getAccountHolder().getName() + " на аккаунт - " +
                    accountTo.getAccountHolder().getName());
            accountFrom.getBill().setAmount(billFromAmount - amount);
            accountTo.getBill().setAmount(billToAmount + amount);
            System.out.println("Перевод успешно завершён");
        }
    }
}
