# Programação Orientada a Objetos - Avançado

### Interface
Interface é um tipo de referência, semelhante a uma classe, que pode conter apenas constantes, assinaturas de métodos, métodos padrão, métodos estáticos e tipos aninhados. Corpos de método existem apenas para métodos padrão e métodos estáticos. As interfaces não podem ser instanciadas - elas
só podem ser implementadas por classes ou estendidas por outras interfaces.


#### Caracteristicas
* Declaração de Métodos Abstratos
* Implementação por Classes.
* Herança Múltipla de Interfaces.
* Sem Construtores.

Exemplo de interface:
```java
interface Veiculo {
    // Métodos abstratos
    void ligar();
    void acelerar();
```

Exemplo de uma classe que implementa a interface

```java
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

```
##### Exemplo de multiplas heranças
Vamos criar uma outra interface chamada Seguranca
```java
interface Seguranca {
    // Métodos abstratos relacionados à segurança
    void ligarAlarme();
    void ligarTrava();
}
```

Agora vamos adicionar essa interface na nossa classe Carro.
```java
class Carro implements Veiculo, Seguranca {
    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando.");
    }

    @Override
    public void ligarAlarme() {
        System.out.println("Alarme do carro ligado.");
    }

    @Override
    public void ligarTrava() {
        System.out.println("Trava do carro ligada.");
    }
}
```


##### Qual a diferença entre interface e classe abstrata e quando utilizar?
 Interfaces são úteis quando você deseja definir contratos abstratos para as classes implementarem, enquanto classes abstratas são úteis quando você deseja fornecer alguma funcionalidade comum entre subclasses e deixar alguns métodos para serem implementados pelas subclasses.
**<center>DIFERENÇAS:</center>**

|  | Interface | Classe Abstrata |
-----------------:|:-----------:|:---------:|
| Implementação de métodos | ❌ | ✅  |
| Herança múltipla | ✅ | ❌ |
| Construtor | ❌ | ✅ |

#Exercício
1. Crie uma interface **Calculadora** com os seguintes métodos:
    * somar(double a, double b)
    * subtrair(double a, double b)
    * multiplicar(double a, double b)
    * dividir(double a, double b)
2. Crie uma classe **CalculadoraSimples** que implemente a inteface **Calculadora** e forneça as implementações.
3. Crie uma classe **CalculadoraCientifica** que implemente a inteface **Calculadora** e forneça as implementações. Além das implementações da interface, **também deverá ter métodos específicos para calcular: raiz quadrada e exponenciação**.
4.  No método main para testar as classes CalculadoraSimples e CalculadoraCientifica. No método main, crie objetos dessas classes e chame os métodos da interface Calculadora para realizar operações matemáticas.

Saída esperada:
``` linux
--- Calculadora Simples ---
Soma: 5.0
Subtração: 1.0
Multiplicação: 6.0
Divisão: 2.0

--- Calculadora Científica ---
Potência: 16.0
Raiz Quadrada: 3.0

```