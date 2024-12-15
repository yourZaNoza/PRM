package rpm_9.exceptions;

import java.util.List;

public class AccountRepository {
    private static AccountRepository instance;
    private List<Account> accountList;
    private AccountRepository() {}
    public static AccountRepository getInstance(){
        if(instance == null){
            instance = new AccountRepository();
            return instance;
        } else {
            return instance;
        }
    }
    public void add(Account account){
        accountList.add(account);
    }
    public Account getById(Long id) throws AccountNotFoundException{
        for (Account account : accountList) {
            if (account.getId() == id){
                return account;
            }
        }
        throw new AccountNotFoundException("Can't find account with id: " + id);
    }
}
