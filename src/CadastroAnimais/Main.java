package CadastroAnimais;

public class Main {

    public static void main(String[] args) {
        // Polimorfismo: todos são tratados como Animal,
        // mas cada um executa o seu próprio emitirSom().
        Animal[] animais = {
            new Leao("Simba"),
            new Elefante("Dumbo"),
            new Gato("Mingau"),
            new Cachorro("Rex")
        };

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
