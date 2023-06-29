public class Animal {
    // Atributos-características
    String nome;
    String raca;
    private double peso;
    String tipoPelo;
    String corOlhoDireito;

    //getter e setter
    public void setPeso(String chave, double peso){
        if(chave.equals("AD")){
        this.peso = peso;
    }else{
            //não pode gravar
        }
    }
    public Double getPeso(){
        return this.peso = peso;
    }

    public Animal(String _nome, String _raca) {
        this.nome = _nome;
        this.raca = _raca;
    }

    // Métodos-comportamento
    public void andar(){

        System.out.println("andou");
    }

    public void comer() {

        System.out.println("Animal comeu!!!");
    }

    //Construtor padrão
    Animal(){

    }
    // sobrecarga do construtor
    Animal (String _raca){
        this.raca = _raca;
    }
    //mais sobrecargas de construtor
}