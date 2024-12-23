# Guia de Estudos em Java

Bem-vindo ao **Guia de Estudos em Java**! Este arquivo foi criado para auxiliar estudantes e desenvolvedores a aprenderem ou revisarem os principais conceitos e práticas dessa linguagem poderosa.

---

## Sumário
- [Introdução ao Java](#introdução-ao-java)
- [Configuração do Ambiente](#configuração-do-ambiente)
- [Sintaxe Básica](#sintaxe-básica)
- [Orientação a Objetos](#orientação-a-objetos)
- [Estruturas de Controle](#estruturas-de-controle)
- [Coleções e Streams](#coleções-e-streams)
- [Tratamento de Exceções](#tratamento-de-exceções)
- [Práticas Recomendadas](#práticas-recomendadas)
- [Recursos Adicionais](#recursos-adicionais)

---

## Introdução ao Java
Java é uma linguagem de programação orientada a objetos criada em 1995 pela Sun Microsystems. É amplamente utilizada devido à sua **portabilidade**, robustez e vasto ecossistema.

### Características principais:
- **Portabilidade:** Escreva uma vez, execute em qualquer lugar.
- **Orientação a Objetos:** Foco na modularidade e reutilização de código.
- **Segurança:** Oferece uma arquitetura robusta para evitar falhas e ameaças.

---

## Configuração do Ambiente

1. **Baixe o JDK**
   - Acesse o site oficial da Oracle ou utilize versões open-source como OpenJDK.

2. **Instale uma IDE ou Editor de Texto**
   - **IDE** recomendadas: IntelliJ IDEA, Eclipse ou NetBeans.
   - **Editores**: Visual Studio Code ou Sublime Text.

3. **Verifique a instalação**
   ```bash
   java -version
   javac -version
   ```

---

## Sintaxe Básica

### "Hello, World!"
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Tipos de Dados
- **Primitivos:** `int`, `double`, `char`, `boolean`, etc.
- **Referenciados:** Objetos, arrays e strings.

### Estruturas Básicas
#### Declaração de Variáveis
```java
int idade = 25;
String nome = "Campeão";
```
#### Operadores
- **Aritméticos:** `+`, `-`, `*`, `/`, `%`
- **Relacionais:** `==`, `!=`, `<`, `>`
- **Lógicos:** `&&`, `||`, `!`

---

## Orientação a Objetos

### Conceitos Fundamentais
- **Classe:** Molde para objetos.
- **Objeto:** Instância de uma classe.
- **Herança:** Reutilização de código entre classes.
- **Polimorfismo:** Comportamento dinâmico de métodos.
- **Encapsulamento:** Controle de acesso aos atributos e métodos.

#### Exemplo de Classe e Objeto
```java
class Pessoa {
    String nome;
    int idade;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome);
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Campeão";
        pessoa.idade = 18;
        pessoa.apresentar();
    }
}
```

---

## Estruturas de Controle

### Condicional
```java
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}
```

### Looping
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Número: " + i);
}
```

---

## Coleções e Streams

### Lista (ArrayList)
```java
import java.util.ArrayList;

ArrayList<String> nomes = new ArrayList<>();
nomes.add("Java");
nomes.add("Spring");
System.out.println(nomes);
```

### Streams (Java 8+)
```java
nomes.stream()
     .filter(nome -> nome.startsWith("J"))
     .forEach(System.out::println);
```

---

## Tratamento de Exceções

### Try-Catch
```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro: " + e.getMessage());
}
```

### Finally
```java
finally {
    System.out.println("Execução finalizada");
}
```

---

## Práticas Recomendadas

1. **Escreva código limpo e legível.**
   - Use nomes descritivos para classes, métodos e variáveis.
2. **Divida o código em métodos pequenos.**
3. **Comente partes complexas.**
4. **Use ferramentas de controle de versão como Git.**
5. **Teste seu código frequentemente.**

---

## Recursos Adicionais

- [Documentação Oficial do Java](https://docs.oracle.com/en/java/)
- [Curso gratuito na Alura](https://www.alura.com.br/)
- [Comunidade no Stack Overflow](https://stackoverflow.com/questions/tagged/java)

---

**Happy Coding!** 🚀
