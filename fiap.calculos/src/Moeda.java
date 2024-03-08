public class Moeda {
    public double valorReal;
    public double cotacaoDolar;
    public double quantidadeDolar;
    public void calcularConversao(){
        this.quantidadeDolar = this.valorReal/this.cotacaoDolar;
    //variavel/atributo está associado ao objeto
    //this.texto : diferencia atributos e métodos, “estou usando um atributo desta classe expecífica”, está linkado a esta classe

    }
    public double retornarCalculoConversao(){
        double dolar = this.valorReal/this.cotacaoDolar;
        return dolar;
    }

}
