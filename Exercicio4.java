package LISTA7JAVA;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Double> salarios = new ArrayList<>();

        int[] faixas = new int[9];

        double vendas;
        double salario;

        System.out.println("Digite as vendas brutas dos vendedores.");
        System.out.println("Para encerrar digite -1");

        do {

            System.out.print("Digite o valor de vendas: ");
            vendas = entrada.nextDouble();

            if (vendas != -1) {

                salario = 200 + (vendas * 0.09);

                salarios.add(salario);
            }

        } while (vendas != -1);

        for (int i = 0; i < salarios.size(); i++) {

            salario = salarios.get(i);

            if (salario >= 200 && salario <= 299) {

                faixas[0]++;
            }

            else if (salario >= 300 && salario <= 399) {

                faixas[1]++;
            }

            else if (salario >= 400 && salario <= 499) {

                faixas[2]++;
            }

            else if (salario >= 500 && salario <= 599) {

                faixas[3]++;
            }

            else if (salario >= 600 && salario <= 699) {

                faixas[4]++;

            }

            else if (salario >= 700 && salario <= 799) {

                faixas[5]++;
            }

            else if (salario >= 800 && salario <= 899) {

                faixas[6]++;
            }

            else if (salario >= 900 && salario <= 999) {

                faixas[7]++;

            }

            else {

                faixas[8]++;
            }
        }

        System.out.println("\nQuantidade de vendedores por faixa salarial: ");

        System.out.println("$200 - $299 = " + faixas[0]);
        System.out.println("$300 - $399 = " + faixas[1]);
        System.out.println("$400 - $499 = " + faixas[2]);
        System.out.println("$500 - $599 = " + faixas[3]);
        System.out.println("$600 - $699 = " + faixas[4]);
        System.out.println("$700 - $799 = " + faixas[5]);
        System.out.println("$800 - $899 = " + faixas[6]);
        System.out.println("$900 - $999 = " + faixas[7]);
        System.out.println("$1000 em diante = " + faixas[8]);

        System.out.println("\nPrograma encerrado.");

        entrada.close();

    }
    
}
