public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista();
        Quadrado quadrado = new Quadrado("vermelho");
        Circulo circulo = new Circulo("verde");


        artista.criarDesenho(quadrado);
        artista.criarDesenho(circulo);
    }
}