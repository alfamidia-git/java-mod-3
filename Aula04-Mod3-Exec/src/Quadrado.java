public class Quadrado extends Forma{
    public Quadrado(String cor) {
        super(cor);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um quadrado na cor: " + super.cor);
    }
}
