package exercicios_matrizes;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String[][] agenda = new String[31][24]; // Matriz para armazenar os compromissos de cada dia do mês

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar compromisso");
            System.out.println("2. Consultar compromisso");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarCompromisso(agenda, scanner);
                    break;
                case 2:
                    consultarCompromisso(agenda, scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }

    public static void adicionarCompromisso(String[][] agenda, Scanner scanner) {
        System.out.print("Digite o dia do mês (1 a 31): ");
        int dia = scanner.nextInt();
        System.out.print("Digite a hora do compromisso (0 a 23): ");
        int hora = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        if (dia < 1 || dia > 31 || hora < 0 || hora > 23) {
            System.out.println("Dia ou hora inválidos!");
            return;
        }

        System.out.print("Digite o compromisso: ");
        String compromisso = scanner.nextLine();

        agenda[dia - 1][hora] = compromisso;
        System.out.println("Compromisso adicionado com sucesso para o dia " + dia + " às " + hora + " horas.");
    }
    public static void consultarCompromisso(String[][] agenda, Scanner scanner) {
    	System.out.print("Digite o dia do mês (1 a 31) para consultar: ");
        int dia = scanner.nextInt();
        System.out.print("Digite a hora para consultar (0 a 23): ");
        int hora = scanner.nextInt();
        if (dia < 1 || dia > 31 || hora < 0 || hora > 23) {
            System.out.println("Dia ou hora inválidos!");
            return;
        }
        String compromisso = agenda[dia-1][hora];
        if (compromisso != null && !compromisso.isEmpty()) {
            System.out.println("Compromisso encontrado para o dia " + dia + " às " + hora + " horas: " + compromisso);
        }else {
        	System.out.println("Nenhum compromisso encontrado para o dia " + dia + " às " + hora + " horas.");
        }
        
    }
}