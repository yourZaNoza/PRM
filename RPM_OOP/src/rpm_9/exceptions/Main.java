package rpm_9.exceptions;

public class Main {
    public static void main(String[] args) {
        AccountRepository accountRepository = AccountRepository.getInstance();
        Account account = new Account(1L, "Lori", 100);
        Account account1 = new Account(2L, "Lori", 100);
        Account account2 = new Account(3L, "Lori", 100);

        accountRepository.add(account);
        accountRepository.add(account1);
        accountRepository.add(account2);

        try {
            System.out.println(accountRepository.getById(2L));
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(accountRepository.getById(7L));
    }
}
