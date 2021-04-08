package io.github.leandroleitec.generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Leandro Leite
 */
public class RandomDigitGenerator {

    public static int generate() {
        List<Integer> digits = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collections.shuffle(digits);
        return digits.get(0);
    }
}
