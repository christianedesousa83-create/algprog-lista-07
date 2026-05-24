package LISTA7JAVA;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<String> respostas = new ArrayList<>();

        int quantidadeSim = 0;

        System.out.println("Telefonou para a vítima? ");
        respostas.add(entrada.nextLine());

        System.out.println("Esteve no local do crime? ");
        respostas.add(entrada.nextLine());

        System.out.println("Mora perto da vítima? ");
        respostas.add(entrada.nextLine());

        System.out.println("Devia para a vítima? ");
        respostas.add(entrada.nextLine());

        System.out.println("Já trabalhou com a vítima?");
        respostas.add(entrada.nextLine());

        for (int i = 0; i < respostas.size(); i++) {

            if (respostas.get(i).equalsIgnoreCase("sim")) {

                quantidadeSim++;
            }
        }

        System.out.println("\nResultado: ");

        if (quantidadeSim ==2) {

            System.out.println("Suspeita");
        }

        else if (quantidadeSim == 3 || quantidadeSim == 4) {
            System.out.println("Cúmplice");
        }
        else if (quantidadeSim == 5) {
            System.out.println("Assassino");

        }
        else {
            System.out.println("Inocente");
        }

        entrada.close();
    }
    
}
