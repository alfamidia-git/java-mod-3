public class Gato extends Animal{
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void som() {
        System.out.println("Miau");
    }
}
