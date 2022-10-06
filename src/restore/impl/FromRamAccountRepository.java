package restore.impl;

import restore.Account;
import restore.AccountRepository;

public class FromRamAccountRepository implements AccountRepository {

    private DefaultAccount[] account = {new DefaultAccount("globaroman@gmail.com", true),
            new DefaultAccount("globaroman1@gmail.com", false)};

    @Override
    public Account findByEmail(final String email) {
        for (final DefaultAccount account : account) {
            if (email.equals(account.getEmail())) {
                return account;
            }
        }
        return null;
    }

    @Override
    public void update(final Account account) {
//do nothing
    }
}
