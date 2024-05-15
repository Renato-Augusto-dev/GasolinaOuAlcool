//Importando o scanner
import java.util.Scanner;

public class GasolinaOuAlcool {
    public static void main(String[] args) {

        //Criando a classe scanner
        Scanner leitor = new Scanner(System.in);

        //Pegando os dado do usuario
        System.out.print("Qual é o valor da gasolina: ");
        double gasolina = leitor.nextDouble();

        System.out.print("Qual é o valor do álcool: ");
        double alcool = leitor.nextDouble();

        //Calculando o valor da gasolina
        double valorDaGasolina = gasolina * 0.7;

        //Mostrando os dados para o usuario
        System.out.println("--------------------------------------");
        System.out.println("COMPARADOR DE GASOLINA OU ÁLCOOL");
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.printf("Preço da gasolina: %s \n", gasolina);
        System.out.printf("Preço do álcool: %s \n",alcool);
        System.out.println("");
        System.out.println("---------------------------------------");

        //Comparando a gasolina ou alcool
        if (valorDaGasolina > alcool) {
            System.out.printf("O álcool é a melhor opção \n");
        }else {
            System.out.printf("A gasolina é a melhor opção \n");
        }
        System.out.println("---------------------------------------");
    }
}