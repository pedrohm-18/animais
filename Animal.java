package CadastroAnimais; 


public class Animal {
    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }

    public String getNome() {
        return nome;
    }
}
