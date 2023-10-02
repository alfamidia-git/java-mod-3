public class Moto implements Veiculo{
    @Override
    public void ligar() {
        System.out.println("A moto está ligada");
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando");
    }
}
