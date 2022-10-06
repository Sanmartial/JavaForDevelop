package restore.impl;

import restore.Account;
import restore.AccountNotActiveHandler;

public final class DisableAccountNotActiveHandler implements AccountNotActiveHandler {
    @Override
    public String handle(final Account account) {
        return null;
    }
}
