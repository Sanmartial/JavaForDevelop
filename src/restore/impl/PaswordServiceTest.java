package restore.impl;

import restore.PasswordResetService;

public class PaswordServiceTest {
    private PasswordResetService service;

    public PaswordServiceTest(final PasswordResetService service) {
        this.service = service;
    }

    public void test(final String email){
        System.out.println(email + " -> " + service.reset(email));
    }

    public static void main(final String[] args) {
        final PaswordServiceTest paswordServiceTest = new PaswordServiceTest(new PasswordResetService(
                new FromRamAccountRepository(),
                new DisplayAccountNotFoundByEmailHandler(),
                new DisableAccountNotActiveHandler(),
                new DefaultNumberVerifiacationCodeGenerator(6),
                new StubEmailService()
        ));
        paswordServiceTest.test("globaroma0@gmail.com");
        paswordServiceTest.test("globaroman@gmail.com");
        paswordServiceTest.test("globaroman1@gmail.com");
    }
}
