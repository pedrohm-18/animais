package CadastroAnimais;

public class Main {
    public static void main(String[] args) {
        // Criando objetos dos tipos Leão, Elefante e Gato
        Animal leao = new Leao("Simba");
        Animal elefante = new Elefante("Dumbo");
        Animal gato = new Gato("Mingau");

        // Chamando o método emitirSom para cada animal
        leao.emitirSom();
        elefante.emitirSom();
        gato.emitirSom();
    }
}
