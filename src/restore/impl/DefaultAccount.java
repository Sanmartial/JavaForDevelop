package restore.impl;

import restore.Account;

public final class DefaultAccount implements Account {

    private String email;
    private boolean active;
    private String code;

    public DefaultAccount(final String email, final boolean active) {
        this.email = email;
        this.active = active;
    }

    @Override
    public boolean isNotActive() {
        return !active;
    }

    @Override
    public void setCode(final String code) {
        this.code = code;

    }

    public String getEmail() {
        return email;
    }
}
