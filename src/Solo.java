public class Solo {
    //Atributos solo
    String tipoSolo;
    boolean fertil;
    String cor;

    //Método
    public Planta gerarPlanta(Semente semente){
        return new Planta(semente);
    }
}
