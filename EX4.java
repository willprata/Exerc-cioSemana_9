import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        System.out.print("Digite o número que deseja contar: ");
        int alvo = scanner.nextInt();

        int contagem = 0;
        for (int numero : numeros) {
            if (numero == alvo) {
                contagem++;
            }
        }

        System.out.println("O número " + alvo + " aparece " + contagem + " vezes na lista.");

        scanner.close();
    }
}
