public class Main {
    public static void main(String[] args) {
        // Aula inicial de Orientação à Objetos
        Pessoa adao = new Pessoa();
        // Declaração
        Pessoa qualquer;
        // Instanciação
        qualquer = new Pessoa();
        // Definir forma do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        // Definir comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("alto"));

        // Criar mais objetos
        Animal cao = new Animal();
        Animal gato = new Animal();
        Animal gato2 = new Animal();
        Animal roedor; // Declarar
        roedor = new Animal(); // Instanciar
        Animal x;
        x = new Animal();

        // Consultar dados do objeto cao
        cao.nome = "Pluto"; // Atribuição
        System.out.println(cao.nome);
        cao.comer(); // chamada de método
        Pessoa nova = new Pessoa();
        nova.nome = "Tina";
        nova.comer();
    }
}