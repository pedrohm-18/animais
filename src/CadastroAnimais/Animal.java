package CadastroAnimais;

/**
 * Classe base abstrata: todo animal tem um nome e sabe emitir um som,
 * mas cada espécie define o seu próprio som.
 */
public abstract class Animal {

    private final String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void emitirSom();
}
