package LISTA7JAVA;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        double nota;
        double soma = 0;
        double media;

        int acimaMedia = 0;
        int abaixoSete = 0;

        System.out.println("Digite as notas.");
        System.out.println("Para encerrar digite -1");

        do {

            System.out.print("Digite uma nota: ");
            nota = entrada.nextDouble();

            if (nota != -1) {
                notas.add(nota);
            }
        } while (nota != -1);

        System.out.println("\nQuantidade de valores lidos: " + notas.size());
        System.out.println("\nValores na ordem digitada: ");

        for (int i = 0; i < notas.size(); i++) {
            System.out.print(notas.get(i) + " ");
        }

        System.out.println("\n\nValores na ordem inversa: ");

        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }
        for (int i = 0; i < notas.size(); i++) {
            soma = soma + notas.get(i);

        }
        System.out.println("\nSoma dos valores: " + soma);

        media = soma / notas.size();

        System.out.println("Média dos valores: " + media);

        for (int i = 0; i < notas.size(); i++) {

            if (notas.get(i) > media) {

                acimaMedia++;
            }
        }

        System.out.println("Quantidade acima da média: " + acimaMedia);

        for (int i = 0; i < notas.size(); i++) {

            if (notas.get(i) < 7) {

                abaixoSete++;
            }
        }

        System.out.println("Quantidade abiaxo de 7: " + abaixoSete);

        System.out.println("\nPrograma encerrado.");

        entrada.close();

    }
    
}
