import java.util.ArrayList;
import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        while (true) {
            System.out.print("Digite o número: ");
            Double numero = scanner.nextDouble();

                if (numero == -1){
                    break;  
                 }
            numeros.add(numero);
        
        }

        Double soma = 0.0;
        for (Double numero : numeros){  
           soma += numero;
          }

          Double media = soma / numeros.size();

          System.out.println("Soma: " + soma);
          System.out.println("Média: " + media);

         scanner.close();

    }

}
