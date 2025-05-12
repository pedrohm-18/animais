package CadastroAnimais;  // Pacote em que essa classe está

public class Leao extends Animal {  // Leão é uma subclasse de Animal

    // Construtor para inicializar o nome do leão
    public Leao(String nome) {
        super(nome);  // Chama o construtor da superclasse (Animal)
    }

    // Sobrescreve o método emitirSom para o som do leão
    @Override
    public void emitirSom() {
        System.out.println("O leão " + getNome() + " faz: Roooaar!");
    }
}
