package restore.impl;

import restore.AccountNotFoundByEmailHandler;

public final class DisplayAccountNotFoundByEmailHandler implements AccountNotFoundByEmailHandler {

    @Override
    public String handle(final String email) {
        return "Account_not_found.html?email=" + email;
    }
}
