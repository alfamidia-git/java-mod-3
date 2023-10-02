# Programação Orientada a Objetos - Avançado

### Polimorfismo
Polimorfismo é um dos princípios fundamentais da programação orientada a objetos (POO). O termo "polimorfismo" vem do grego e significa "muitas formas". Em POO, o polimorfismo permite que objetos de diferentes classes sejam tratados de maneira uniforme, ou seja, um único código pode trabalhar com objetos de tipos diferentes sem se preocupar com a classe específica de cada objeto.

#### Duas principais formas:


**1. Polimorfismo de classe:** Esse tipo de polimorfismo ocorre quando uma classe derivada (subclasse) é tratada como uma classe base (superclasse). Isso significa que você pode usar um objeto da classe derivada onde um objeto da classe base é esperado.

Exemplo:
```java
// Classe pai (superclasse)
class Animal {
    void emitirSom() {
        System.out.println("O animal está emitindo um som.");
    }
}

// Classe filha (subclasse)
class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O cachorro está latindo.");
    }
}
```
Neste exemplo, o método emitirSom() é sobrescrito na classe Cachorro. Assim, você pode tratar um objeto do tipo Cachorro como um objeto do tipo Animal, e ao chamar o método emitirSom(), a versão da classe Cachorro será executada.

```java
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cachorro = new Cachorro();

        System.out.println("----ANIMAL----");
        animal.emitirSom();
        
        System.out.println("----CACHORRO----");
        cachorro.emitirSom();
}
```
Essa será a saída:
``` linux
----ANIMAL----
O animal está emitindo um som.
----CACHORRO----
O cachorro está latindo.
```
***
**2. Polimorfismo de Interfaces:** Esse tipo de polimorfismo ocorre quando diferentes classes implementam a mesma interface e, em seguida, são tratadas como objetos dessa interface. As interfaces definem um conjunto de métodos que devem ser implementados pelas classes que a utilizam.

```java
// Interface
interface Veiculo {
    void ligar();
    void acelerar();
}

// Classes que implementam a interface
class Carro implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando.");
    }
}

class Moto implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Moto ligada.");
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando.");
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        System.out.println("----CARRO----");
        carro.ligar();
        
        System.out.println("----MOTO----");
        moto.ligar();
}
```
Essa será a saída:
``` linux
----CARRO----
Carro ligado
----MOTO----
Moto ligada
```

#Exercício

1. Crie uma interface Desenho com um método abstrato desenhar().
2. Crie uma classe abstrata Forma que implemente a interface Desenho e tenha um atributo cor (String).
3. Crie duas classes filhas (subclasses) de Forma: Circulo e Quadrado. Implemente o método desenhar() em cada classe para imprimir a forma específica sendo desenhada e a cor.
4. Crie uma classe Artista com um método chamado criarDesenho(). Esse método deve receber um objeto da interface Desenho como parâmetro e chamar o método desenhar() desse objeto.
5. No método main, crie objetos das classes Circulo e Quadrado, passe-os como parâmetro para o método criarDesenho() da classe Artista.