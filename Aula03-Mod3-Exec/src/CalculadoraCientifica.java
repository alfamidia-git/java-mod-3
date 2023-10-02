public class CalculadoraCientifica implements Calculadora{


    public double raizQuadrada(double a){
        return Math.sqrt(a);
    }

    public double exponenciacao(double base, double expoente){
        return Math.pow(base, expoente);
    }
    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }

    @Override
    public double dividir(double a, double b) {
        return a / b;
    }
}
