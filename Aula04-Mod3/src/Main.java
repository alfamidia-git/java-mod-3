public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal cachorro = new Cachorro();

        animal.emitirSom();
        cachorro.emitirSom();

        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        carro.ligar();
        moto.ligar();
    }
}