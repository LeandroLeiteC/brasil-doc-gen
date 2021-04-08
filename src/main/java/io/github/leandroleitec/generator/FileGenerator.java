package io.github.leandroleitec.generator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * @author Leandro Leite
 */
public class FileGenerator {
    public static void write(List<String> docs, String path) throws IOException {
        try (FileWriter fileWriter = new FileWriter(path)) {
            for (String doc : docs) {
                fileWriter.append(doc);
                fileWriter.append("\n");
            }
        }
        System.out.println("Arquivo Gerado!");
    }
}
