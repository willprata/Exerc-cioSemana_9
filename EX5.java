import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        while (true) {
            System.out.print("Digite um número inteiro (ou -1 para parar): ");
            int numero = scanner.nextInt();

            if (numero == -1) {
                break;
            }

            numeros.add(numero);
        }

        Collections.sort(numeros);

        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
