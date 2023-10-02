public class Moto extends Veiculo{

    private int cilindradas;
    public Moto(int ano, String marca, String modelo, int cilindradas) {
        super(ano, marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Cilindradas: " + this.cilindradas;
    }
}
