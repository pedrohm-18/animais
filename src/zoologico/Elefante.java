package zoologico;

public class Elefante extends Animal {

    public Elefante(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("O elefante " + getNome() + " faz: Paaaaa!");
    }
}
