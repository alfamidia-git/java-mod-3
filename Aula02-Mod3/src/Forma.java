abstract public class Forma {
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
