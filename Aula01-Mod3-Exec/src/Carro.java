public class Carro extends Veiculo{
    private int numPortas;
    public Carro(int ano, String marca, String modelo, int numPortas) {
        super(ano, marca, modelo);
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Número de portas: " + this.numPortas;
    }
}
