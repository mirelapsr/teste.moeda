import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //classe + objeto= está fazendo uma classe scanner chamado leitor
        Moeda moeda = new Moeda();
        //objeto sendo instanciado
        System.out.println("Informe o valor em reais: R$");
        moeda.valorReal = leitor.nextDouble();
        //nextDouble é um método(codificação de uma classe e acesso através do objeto)
        System.out.println("informe a cotação do dolar de hj");
        moeda.cotacaoDolar = leitor.nextDouble();
        moeda.calcularConversao();
        System.out.println(moeda.quantidadeDolar);
        System.out.println(moeda.retornarCalculoConversao());


        }
    }