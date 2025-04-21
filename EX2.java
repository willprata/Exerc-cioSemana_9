import java.util.ArrayList;
import java.util.Scanner;

public class aula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite aqui o nome: ");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        System.out.print("Digite aqui o nome que deseja remover: ");
        String remover = scanner.nextLine();

        if (nomes.contains(remover)) {
            nomes.remove(remover);
            System.out.println("Nome removido!");
        } else {
            System.out.println("Nome não encontrado na lista.");
        }

        System.out.println("Nomes restantes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        scanner.close();
    }
}
