package io.github.leandroleitec;

import io.github.leandroleitec.banner.Banner;
import io.github.leandroleitec.enums.DocType;
import io.github.leandroleitec.generator.CNPJGenerator;
import io.github.leandroleitec.generator.CPFGenerator;
import io.github.leandroleitec.generator.FileGenerator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Leandro Leite
 */
public class DocGenApplication {

    public static void main(String[] args) throws IOException {
        Banner.printBanner();

        if (args.length > 3 || args.length == 0) {
            System.out.println("Todos os parâmetros devem ser informados <Quantidade> <Tipo Documento> <Caminho Arquivo>\n" +
                    "Quantidade: Inteiro\n" +
                    "Tipo Documento: CPF, CNPJ, AMBOS\n" +
                    "Caminho Arquivo: Path onde o csv será salvo");
        } else {
            int quantity = getQuantity(args);
            DocType docType = getDocType(args);
            String path = args[2];
            generateDocs(quantity, docType, path);
        }
    }

    private static void generateDocs(int quantity, DocType docType, String path) throws IOException {
        int quantityCpf = 0;
        int quantityCnpj = 0;

        switch (docType) {
            case CPF:
                quantityCpf = quantity;
                break;
            case CNPJ:
                quantityCnpj = quantity;
                break;
            case AMBOS:
                quantityCpf = quantity/2;
                quantityCnpj = quantity/2;
                break;
        }

        List<String> cpfs = CPFGenerator.generate(quantityCpf);
        List<String> cnpjs = CNPJGenerator.generate(quantityCnpj);
        List<String> docs = new ArrayList<>();
        docs.addAll(cpfs);
        docs.addAll(cnpjs);

        FileGenerator.write(docs, path);
    }

    private static int getQuantity(String[] arg) {
        try {
            return Integer.parseInt(arg[0]);
        } catch (Exception exception) {
            System.out.println("Quantidade é inválida.");
            return 0;
        }
    }

    private static DocType getDocType(String[] args) {
        try {
            return DocType.valueOf(args[1]);
        } catch (Exception exception) {
            return DocType.CPF;
        }
    }
}
