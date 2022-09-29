package atividadecadfuncionario;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeCadFuncionario {
    
    static Funcionario func;
    public static ArrayList<Funcionario> admin = new ArrayList<Funcionario>();
    public static ArrayList<Funcionario> producao = new ArrayList<Funcionario>();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        
        do {   
            menu();
            opcao = Integer.parseInt(entrada.nextLine());
            
            if (opcao == 1) {
                cadastramento();
            }
            if (opcao == 2) {
                listagemAdmin();
            }
            if (opcao == 3) {
                listagemProducao();
            }
            if (opcao == 4) {
                listagemAdmin();
                listagemProducao();
            }
            
        } while (opcao!=5);
    }
    
    public static void menu(){
        System.out.println("===CADASTRAMENTO DE FUNCIONÁRIOS===");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Listar funcionários da Administração");
            System.out.println("3 - Listar funcionários da Produção");
            System.out.println("4 - Listar todos os funcionários");
            System.out.print("5 - SAIR\n");
    }
    public static void cadastramento() {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.print("Digite 1 para funcionário da Administração, 2 para funcionário da Produção e 3 para sair: ");
            opcao = Integer.parseInt(entrada.nextLine());
            try {
                if (opcao == 1) {
                    System.out.println("ADMINISTRAÇÃO");
                    func = new Funcionario();
                    System.out.print("Digite o nome: ");
                    func.nome = entrada.nextLine();
                    System.out.print("Digite a idade: ");
                    func.idade = Long.parseLong(entrada.nextLine());
                    System.out.print("Digite o CPF: ");
                    func.cpf = Long.parseLong(entrada.nextLine());
                    System.out.print("Digite o setor: ");
                    func.setor = entrada.nextLine();
                    System.out.print("Digite o cargo: ");
                    func.cargo = entrada.nextLine();
                    System.out.print("Digite o endereço: ");
                    func.endereco = entrada.nextLine();
                    System.out.print("Digite o e-mail: ");
                    func.email = entrada.nextLine();
                    admin.add(func);
                }
                if (opcao == 2) {
                     System.out.println("PRODUÇÃO");
                    func = new Funcionario();
                    System.out.print("Digite o nome: ");
                    func.nome = entrada.nextLine();
                    System.out.print("Digite a idade: ");
                    func.idade = Long.parseLong(entrada.nextLine());
                    System.out.print("Digite o CPF: ");
                    func.cpf = Long.parseLong(entrada.nextLine());
                    System.out.print("Digite o setor: ");
                    func.setor = entrada.nextLine();
                    System.out.print("Digite o cargo: ");
                    func.cargo = entrada.nextLine();
                    System.out.print("Digite o endereço: ");
                    func.endereco = entrada.nextLine();
                    System.out.print("Digite o e-mail: ");
                    func.email = entrada.nextLine();
                    producao.add(func);
                }

            } catch (Exception e) {
                System.out.println("Opção inválida! Digite 1, 2 ou 3");
            }

        } while (opcao != 3);
        opcao = 0;
    }
    public static void listagemAdmin() {
        func = new Funcionario();
        if (admin.isEmpty()) {
            System.out.println("Não há funcionários na lista da Administração\n");
        } else {
            System.out.println("ADMINISTRAÇÃO");
            for (int j = 0; j < admin.size(); j++) {
                func = admin.get(j);                
                System.out.println("Nome: " + func.nome);
                System.out.println("Idade: " + func.idade);
                System.out.println("Peso: " + func.cpf);
                System.out.println("Posição: " + func.setor);
                System.out.println("Posição: " + func.cargo);
                System.out.println("Posição: " + func.endereco);
                System.out.println("Altura: " + func.email + "\n");
            }
        }
    }
    public static void listagemProducao() {
        func = new Funcionario();
        if (producao.isEmpty()) {
            System.out.println("Não há funcionários na lista da Produção\n");
        } else {
            System.out.println("PRODUÇÃO");
            for (int j = 0; j < producao.size(); j++) {
                func = producao.get(j);                
                System.out.println("Nome: " + func.nome);
                System.out.println("Idade: " + func.idade);
                System.out.println("Peso: " + func.cpf);
                System.out.println("Posição: " + func.setor);
                System.out.println("Posição: " + func.cargo);
                System.out.println("Posição: " + func.endereco);
                System.out.println("Altura: " + func.email + "\n");
            }
        }
    }
}
