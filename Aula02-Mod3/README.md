# Programação Orientada a Objetos - Avançado

### Classes Abstratas
As classes abstratas são classes que não podem ser instanciadas diretamente, ou seja, não é possível criar objetos diretamente a partir delas. Elas servem como modelos ou estruturas para outras classes que irão derivar delas. Uma classe abstrata pode conter métodos abstratos (sem implementação) e métodos concretos (com implementação). Uma classe abstrata é criada usando a palavra-chave abstract.


#### Caracteristicas
* Não podem ser instanciadas.
* Podem conter métodos abstratos.
* Podem conter métodos concretos.
* Pode conter atributos e construtores.

#### Métodos abstratos
Métodos abstratos são métodos que são declarados, mas não possuem uma implementação na classe abstrata. Eles são seguidos pelo modificador abstract e não têm corpo entre chaves. As subclasses são obrigadas a fornecer implementações para esses métodos.

Exemplo de classe abstrata:
```java
abstract class Forma {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    // Método abstrato - não possui implementação
    abstract double calcularArea();

    // Método concreto - possui implementação
    public void exibirCor() {
        System.out.println("A cor da forma é " + cor);
    }
}
```

Para utilizar a classe abstrata, você deve criar uma classe derivada que estenda Forma e forneça a implementação para o método abstrato
```java
class Circulo extends Forma {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}
```
A classe Circulo estende a classe abstrata Forma e fornece uma implementação para o método calcularArea(). Dessa forma, agora é possível criar objetos da classe Circulo.


#Exercício
1. Crie uma classe abstrata Animal que contenha os seguintes atributos e métodos:
    * **nome (String)**: o nome do animal.
    * **idade (int)**: a idade do animal.
    * **som() (método abstrato)**: um método sem implementação que representará o som emitido pelo animal.
2. Crie uma classe Cachorro que herde de Animal e implemente o método som(). O método som() da classe Cachorro deve imprimir "Au Au".
3. Crie uma classe Gato que herde de Animal e implemente o método som(). O método som() da classe Gato deve imprimir "Miau".
4. No método main para testar a hierarquia de animais. No método main, crie objetos das classes Cachorro e Gato e chame o método som() de cada objeto.

Exemplo de saída esperada:
```yaml
Nome: Rex, Idade: 3 anos, Som: Au Au
Nome: Mia, Idade: 2 anos, Som: Miau
```
