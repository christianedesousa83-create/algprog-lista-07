package LISTA7JAVA;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList <Double> temperaturas = new ArrayList<Double>();
        

        String[] meses = {
            "janeiro", "Fevereiro", "Março", "Abril", "Maio", "Maio", "Junho", "Julho", "Agosto", "Setembro","Outubro", "Novembro", "Dezembro"
        };

        double soma = 0;
        double media;

        for (int i = 0; i < 12; i++){
            System.out.print("Digite a temperatura de " + meses[i] + ": ");

            double temp = entrada.nextDouble();

            temperaturas.add(temp);

            soma = soma + temp;
        }
        media = soma / temperaturas.size();
        System.out.println("\nMédia anual: " + media);

        System.out.println("\nTemperatura acima da media: ");

        for (int i = 0; i < temperaturas.size(); i++) {

            if (temperaturas.get(i) > media) {

                System.out.println(meses[i] + "-" + temperaturas.get(i));
            }
        }

        entrada.close();
    }
}
