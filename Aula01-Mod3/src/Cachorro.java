public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);
    }
    @Override
    public void comunicar(){
        System.out.println("O cachorro " + super.nome + " está latindo");
    }

    public void brincar(){
        System.out.println("O cachorro está brincando");
    }

}
