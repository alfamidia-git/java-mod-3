public class Veiculo {

    protected int ano;
    protected String marca;
    protected String modelo;

    public Veiculo(int ano, String marca, String modelo) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }


    public String toString(){
        return "------Informações do " + getClass().getName() + "-------\n" +
                "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Ano: " + this.ano;
     }
}
