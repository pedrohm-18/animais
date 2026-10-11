# 🦁 Zoológico OO — Herança e Polimorfismo em Java

Um zoológico em código: uma hierarquia de animais onde cada espécie sobrescreve o método `emitirSom()`. Exemplo didático de **Programação Orientada a Objetos** em Java.

## Conceitos praticados

- Herança (`extends`)
- Classe abstrata e método abstrato (`Animal`)
- Sobrescrita de métodos (`@Override`)
- Polimorfismo (um `Animal[]` com objetos de classes diferentes)
- Encapsulamento (atributo `nome` privado, acessado por `getNome()`)
- Organização em pacotes (`zoologico`)

## Estrutura

```text
src/zoologico/
├── Animal.java      # classe base abstrata
├── Leao.java
├── Elefante.java
├── Gato.java
├── Cachorro.java
└── Zoologico.java   # demonstração (método main)
```

## Como executar

Requisito: **JDK 17+**.

```bash
git clone https://github.com/pedrohm-18/animais.git
cd animais

javac -d out src/zoologico/*.java
java -cp out zoologico.Zoologico
```

Saída esperada:

```text
O leão Simba faz: Roooaar!
O elefante Dumbo faz: Paaaaa!
O gato Mingau faz: Miau!
O cachorro Rex faz: Au Au!
```

## Autor

Pedro — [@pedrohm-18](https://github.com/pedrohm-18)
