package io.github.leandroleitec.generator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Leandro Leite
 */
public class CPFGenerator {

    public static List<String> generate(int quantityCpf) {

        ArrayList<String> cpfs = new ArrayList<>();

        while (cpfs.size() != quantityCpf) {
            Integer digit1 = RandomDigitGenerator.generate();
            Integer digit2 = RandomDigitGenerator.generate();
            Integer digit3 = RandomDigitGenerator.generate();
            Integer digit4 = RandomDigitGenerator.generate();
            Integer digit5 = RandomDigitGenerator.generate();
            Integer digit6 = RandomDigitGenerator.generate();
            Integer digit7 = RandomDigitGenerator.generate();
            Integer digit8 = RandomDigitGenerator.generate();
            Integer digit9 = RandomDigitGenerator.generate();
            if (!(digit1.equals(digit2) && digit2.equals(digit3) && digit3.equals(digit4) && digit4.equals(digit5) && digit5.equals(digit6) && digit6.equals(digit7) && digit7.equals(digit8) && digit8.equals(digit9))) {
                int sum = (digit1 * 10)
                        + (digit2 * 9)
                        + (digit3 * 8)
                        + (digit4 * 7)
                        + (digit5 * 6)
                        + (digit6 * 5)
                        + (digit7 * 4)
                        + (digit8 * 3)
                        + (digit9 * 2);

                int rest = (sum * 10) % 11;


                Integer digit10 = rest == 10 ? 0 : rest;

                sum = (digit1 * 11)
                        + (digit2 * 10)
                        + (digit3 * 9)
                        + (digit4 * 8)
                        + (digit5 * 7)
                        + (digit6 * 6)
                        + (digit7 * 5)
                        + (digit8 * 4)
                        + (digit9 * 3)
                        + (digit10 * 2);

                rest = (sum * 10) % 11;
                Integer digit11 = rest == 10 ? 0 : rest;

                String cpf = digit1.toString()
                        .concat(digit2.toString())
                        .concat(digit3.toString())
                        .concat(digit4.toString())
                        .concat(digit5.toString())
                        .concat(digit6.toString())
                        .concat(digit7.toString())
                        .concat(digit8.toString())
                        .concat(digit9.toString())
                        .concat(digit10.toString())
                        .concat(digit11.toString());
                cpfs.add(cpf);
            }

        }

        return cpfs;
    }
}
