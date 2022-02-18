## Sobre a aplicação :desktop_computer:

### Como rodar :ferris_wheel:

```
Requisitos

Para conseguir rodar o projeto, você precisa ter instalado em seu PC:

• Java
• Maven

Passo a passo

1. Clone o projeto na sua máquina
2. Abra a pasta do projeto na IDE de sua preferência
3. Rode o comando 'mvn compile' para compilar o código fonte da aplicação
4. Execute o código a partir da class App.java, onde se encontra o método main

OBS: Em caso de erro na versão do Java, você pode alterar diretamente no arquivo pom.xml

Procure pelas propriedades abaixo e altere o valor entre as tags para a versão do Java de sua máquina.
<maven.compiler.source>11</maven.compiler.source>
<maven.compiler.target>11</maven.compiler.target>

```

### Como executar os testes unitários :hammer_and_wrench:

```
1. No diretório do projeto, digite o comando 'mvn test'
```

### Documentação do projeto :file_folder:
```
1. Para ter acesso a documentação da aplicação, basta abrir o arquivo index.html que está na pasta apidocs
2. Caminho até o arquivo: target -> site -> apidocs
```

### Tecnologias utilizadas :man_technologist:

```
• Java
• Maven
• Junit
• Javadoc
```

## Desafio de Programação - Academia Capgemini :memo:

Terceira etapa do processo de seleção para a Academia Capgemini 2022.

### Questão 1

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere \* e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

**Exemplo:**

```
Entrada:
n = 6

Saída:
     *
    **
   ***
  ****
 *****
******
```

### Questão 2

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

- Possui no mínimo 6 caracteres.
- Contém no mínimo 1 digito.
- Contém no mínimo 1 letra em minúsculo.
- Contém no mínimo 1 letra em maiúsculo.
- Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&\*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

**Exemplo:**

```
Entrada: Ya3

Saída: 3

Explicação:
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.
```

### Questão 3

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

**Exemplos:**

```
Exemplo 1)

Entrada: ovo

Saída: 3

Explicação:
A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0, 2], [0, 1], [1, 2]] respectivamente.
```

```
Exemplo 2)

Entrada: ifailuhkqq

Saída: 3

Explicação:
A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0, 3]], [[8, 9]] e [[0, 1, 2], [1, 2, 3]].
```
