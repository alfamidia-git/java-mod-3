public class Carro implements Veiculo, Seguranca{
    @Override
    public void ligar() {
        System.out.println("O carro está ligado");
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }

    @Override
    public void ligarAlarme() {
        System.out.println("O alarme está ligado");
    }

    @Override
    public void ligarTrava() {
        System.out.println("A trava está ligada");
    }
}
