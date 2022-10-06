package restore.impl;

import restore.VerifiacationCodeGenerator;

import java.math.BigDecimal;
import java.util.Random;

public final class DefaultNumberVerifiacationCodeGenerator implements VerifiacationCodeGenerator {

    private Random random = new Random();
    private int lenght;

    public DefaultNumberVerifiacationCodeGenerator(final int length) {
        this.lenght = length;
    }

    public DefaultNumberVerifiacationCodeGenerator() {
        this(20);
    }

    @Override
    public String generate() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lenght; i++) {
            sb.append(random.nextInt(10));

        }
        return sb.substring(0);
    }
}
