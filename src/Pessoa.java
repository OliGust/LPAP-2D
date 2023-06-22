public class Pessoa extends Animal {
    // Atributos
    String sobrenome;

    // métodos
    public void falar() {
        System.out.println("falei");
    }

    // sobrecarga do método falar()
    public String falar(String volume) {
        return "falei " + volume;
    }

    //Construtor
    Pessoa() {

    }
    Pessoa(String _nome) {
        this.nome = _nome;
    }
    public void comer() {
        System.out.println("Pessoa Comeu!!!");
    }
}