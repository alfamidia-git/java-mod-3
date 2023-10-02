# Programação Orientada a Objetos - Avançado

Neste novo módulo, daremos continuidade à nossa jornada na programação orientada a objetos, expandindo nossos conhecimentos além do que já aprendemos no módulo anterior. Vamos explorar conceitos avançados e poderosos que nos permitirão criar programas mais robustos, flexíveis e fáceis de manter.

## Na aula de hoje veremos...
### Herança
O conceito de herança é fundamental na programação orientada a objetos (POO) e permite que uma classe, chamada de classe derivada ou subclasse, herde características e comportamentos de outra classe, chamada de classe base ou superclasse.

A herança é uma forma de reutilização de código, onde uma classe pode aproveitar as propriedades e métodos já definidos em outra classe, evitando a necessidade de reescrever o mesmo código várias vezes. Essa abordagem promove a extensibilidade e a organização do código, permitindo criar hierarquias de classes bem estruturadas.

A sintaxe para definir uma classe derivada em Java é a seguinte:
```java
public class ClasseFilha extends ClassePai {
    
}
```
Onde:
* **ClasseFilha** é o nome da classe que está herdando (ou seja, a subclasse).
* **ClassePai** é o nome da classe que está sendo herdada (ou seja, a superclasse).

Vamos a um exemplo simples para ilustrar a herança:
```java
// Classe pai (superclasse)
public class Animal {
    protected String nome;
    
    public Animal(String nome) {
        this.nome = nome;
    }
    
    public void comunicar() {
        System.out.println("O animal está emitindo um som.");
    }
}

// Classe filha (subclasse)
public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }
    
    public void comunicar() {
        System.out.println("O cachorro " + nome + " está latindo.");
    }

    // A classe filha pode ter seus próprios métodos
    public void brincar(){
        System.out.println("O cachorro " + nome + " está brincando.");
    }
}
```

### Algumas palavrinhas mágicas...
* **super**: quando a classe “pai” tem algum construtor e você quer passar os
parâmetros através da classe filha, deve-se utilizar a palavra super no
construtor. Também é utilizado quando queremos utilizar um atributo da classe pai.
* **@Override (sobreposição)**: quando você altera o escopo de um método herdado da
classe “pai”.

#Exercício
1. Crie uma classe Veiculo que contenha os seguintes atributos:
    * marca (String): a marca do veículo.
    * modelo (String): o modelo do veículo.
    * ano (int): o ano de fabricação do veículo.
Além disso, crie um construtor que permita inicializar os atributos da classe Veiculo.
2. Crie duas classes derivadas (subclasses) de Veiculo: Carro e Moto. Essas classes devem herdar os atributos da classe Veiculo.
    * a classe Carro deve ter um campo extra: **numPortas** (int)
    * a classe Moto deve ter um campo extra: **cilindradas** (int)

3. Crie construtores com todos argumentos para as 3 classes.

4. Crie o método toString() em todas as classes.

5. Instancie um Veiculo, Carro e Moto e exiba a informaçao dos três nesse formato:

``` linux
--- Informações do Veículo ---
Marca: Toyota
Modelo: Corolla
Ano: 2022

--- Informações do Carro ---
Marca: Toyota
Modelo: Corolla
Ano: 2022
Número de Portas: 4

--- Informações da Moto ---
Marca: Honda
Modelo: CB500
Ano: 2021
Cilindradas: 500
```