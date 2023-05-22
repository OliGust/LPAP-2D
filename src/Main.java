public class Main {
    public static void main(String[] args) {
        //Aula inicial de Orientação à Objetos
        Pessoa adao = new Pessoa();
        //Declaração
        Pessoa qualquer;
        //Instanciação
        qualquer = new Pessoa();

        //definir forma do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        //Definir comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("alto"));



    }
}