public class Circulo extends Forma{
    public Circulo(String cor) {
        super(cor);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um circulo na cor: " + super.cor);
    }
}
