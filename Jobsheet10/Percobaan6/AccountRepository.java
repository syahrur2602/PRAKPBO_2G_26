package Jobsheet10.Percobaan6;

import Jobsheet10.Percobaan5.Account;
import java.util.Collection;

public interface AccountRepository {
    void save(Account account);

    Account findByNumber(String accountNumber);

    Collection<Account> findAll();
}