
public class Main {
    public static void main(String[] args) {

        CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();

        System.out.println("--- Calculadora Simples ---");
        System.out.println(calculadoraSimples.somar(2.5, 2.5));
        System.out.println(calculadoraSimples.subtrair(2, 1));
        System.out.println(calculadoraSimples.multiplicar(3, 2));
        System.out.println(calculadoraSimples.dividir(4, 2));


        System.out.println("--- Calculadora Científica ---");
        System.out.println(calculadoraCientifica.exponenciacao(2, 4));
        System.out.println(calculadoraCientifica.raizQuadrada(9));

    }
}