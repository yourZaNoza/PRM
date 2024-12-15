package rpm_9.exceptions;

import dz_3.entity.Account;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(String message) {
        super(message);
    }
}
