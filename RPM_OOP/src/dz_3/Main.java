package dz_3;

import dz_3.entity.*;
import dz_3.services.DepositService;
import dz_3.services.PaymentService;
import dz_3.services.TransferService;

public class Main {
    public static void main(String[] args) {
        Person loriPerson = new Person("Lori", "+78005553535", "Cat");
        Bill loriBill = new Bill(10000);
        Account loriAccount = new Account(loriPerson, loriBill);

        Person martinPerson = new Person("Martin", "+78005553636", "Dog");
        Bill martinBill = new Bill(8000);
        Account martinAccount = new Account(martinPerson, martinBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(loriAccount, 1000);
        paymentService.pay(martinAccount, 1500);
        System.out.println("");

        DepositService depositService = new DepositService();
        depositService.deposit(loriAccount, 3000);
        depositService.deposit(martinAccount, 3500);
        System.out.println("");

        TransferService transferService = new TransferService();
        transferService.transfer(loriAccount, martinAccount, 30000);
    }
}
