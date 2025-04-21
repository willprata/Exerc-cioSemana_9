import java.util.ArrayList;
import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        while (true) {
            System.out.print("Digite aqui seu número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);

            System.out.print("Deseja adicionar outro número? (s/n): ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Números digitados:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
