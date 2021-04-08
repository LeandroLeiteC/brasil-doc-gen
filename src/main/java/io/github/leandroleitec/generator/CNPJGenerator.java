package io.github.leandroleitec.generator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leandro Leite
 */
public class CNPJGenerator {
    public static List<String> generate(int quantityCnpj) {
        ArrayList<String> cnpjs = new ArrayList<>();

        while (cnpjs.size() != quantityCnpj) {
            Integer digit1 = RandomDigitGenerator.generate();
            Integer digit2 = RandomDigitGenerator.generate();
            Integer digit3 = RandomDigitGenerator.generate();
            Integer digit4 = RandomDigitGenerator.generate();
            Integer digit5 = RandomDigitGenerator.generate();
            Integer digit6 = RandomDigitGenerator.generate();
            Integer digit7 = RandomDigitGenerator.generate();
            Integer digit8 = RandomDigitGenerator.generate();
            Integer digit9 = RandomDigitGenerator.generate();
            Integer digit10 = RandomDigitGenerator.generate();
            Integer digit11 = RandomDigitGenerator.generate();
            Integer digit12 = RandomDigitGenerator.generate();

            if (!(digit1.equals(digit2) && digit2.equals(digit3) && digit3.equals(digit4) && digit4.equals(digit5) && digit5.equals(digit6) && digit6.equals(digit7) && digit7.equals(digit8) && digit8.equals(digit9))) {
                int sum = (digit1 * 5)
                        + (digit2 * 4)
                        + (digit3 * 3)
                        + (digit4 * 2)
                        + (digit5 * 9)
                        + (digit6 * 8)
                        + (digit7 * 7)
                        + (digit8 * 6)
                        + (digit9 * 5)
                        + (digit10 * 4)
                        + (digit11 * 3)
                        + (digit12 * 2);

                int rest = sum % 11;
                Integer digit13 = rest < 2 ? 0 : 11 - rest;

                sum = (digit1 * 6)
                        + (digit2 * 5)
                        + (digit3 * 4)
                        + (digit4 * 3)
                        + (digit5 * 2)
                        + (digit6 * 9)
                        + (digit7 * 8)
                        + (digit8 * 7)
                        + (digit9 * 6)
                        + (digit10 * 5)
                        + (digit11 * 4)
                        + (digit12 * 3)
                        + (digit13 * 2);

                rest = sum % 11;
                Integer digit14 = rest < 2 ? 0 : 11 - rest;

                String cnpj = digit1.toString()
                        .concat(digit2.toString())
                        .concat(digit3.toString())
                        .concat(digit4.toString())
                        .concat(digit5.toString())
                        .concat(digit6.toString())
                        .concat(digit7.toString())
                        .concat(digit8.toString())
                        .concat(digit9.toString())
                        .concat(digit10.toString())
                        .concat(digit11.toString())
                        .concat(digit12.toString())
                        .concat(digit13.toString())
                        .concat(digit14.toString());
                cnpjs.add(cnpj);
            }
        }
        return cnpjs;
    }
}
