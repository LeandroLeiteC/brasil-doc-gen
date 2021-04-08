# Brasil Doc Gen

### Aplicação para gerar documentos válidos de cpf e cnpj e exportar para um arquivo.



Para utilizar a aplicação clone o projeto e compile utilizado o maven.
```mvn clean package```

Após isso vá até a pasta 'target' e execute ```java -jar brasil-doc-gen.jar <Quantidade> <Tipo> <Path>```

- Quantidade: Inteiro maior que 0
- Tipo: CPF, CNPJ, AMBOS
- Path: Caminho completo onde o arquivo será gerado, ex: ```C:/Users/Leandro/Desktop/arquivo.csv```


** Quando escolhido AMBOS é gerado metade da quantidade para cada documento.

