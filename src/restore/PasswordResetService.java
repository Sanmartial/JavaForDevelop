package restore;

public final class PasswordResetService {

    private AccountRepository accountRepository;
    private AccountNotFoundByEmailHandler accountNotFoundByEmailHandler;
    private AccountNotActiveHandler accountNotActiveHandler;
    private VerifiacationCodeGenerator verifiacationCodeGenerator;
    private EmailService emailService;

    public PasswordResetService(final AccountRepository accountRepository,
                                final AccountNotFoundByEmailHandler accountNotFoundByEmailHandler,
                                final AccountNotActiveHandler accountNotActiveHandler,
                                final VerifiacationCodeGenerator verifiacationCodeGenerator,
                                final EmailService emailService) {
        this.accountRepository = accountRepository;
        this.accountNotFoundByEmailHandler = accountNotFoundByEmailHandler;
        this.accountNotActiveHandler = accountNotActiveHandler;
        this.verifiacationCodeGenerator = verifiacationCodeGenerator;
        this.emailService = emailService;
    }

    public String reset(final String email) {
        final Account account = accountRepository.findByEmail(email);
        if (account == null) {
            return accountNotFoundByEmailHandler.handle(email);
        } else if (account.isNotActive()) {
            final String result = accountNotActiveHandler.handle(account);
            if (result != null) {
                return result;
            }
        }
        final String code = verifiacationCodeGenerator.generate();
        account.setCode(code);
        accountRepository.update(account);
        emailService.sendPasswordResetEmail(email, code);

        return "password_reset_success.html";
    }
}
