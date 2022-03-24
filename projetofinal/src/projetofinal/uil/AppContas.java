package projetofinal.uil;

import java.util.Scanner;

import projetofinal.controller.GerenciaConta;
import projetofinal.model.Conta;
import projetofinal.model.ContaCorrente;
import projetofinal.model.ContaCorrenteEspecial;

public class AppContas {

	public static void main(String[] args) {
	       Scanner teclado = new Scanner(System.in);
	        GerenciaConta contas = new GerenciaConta();
	        int opcao = 0;
	        int numeroConta;
	        double saldo, limite, valorDoSaque, valorDoDeposito;
	        Conta conta;

	        while (opcao != 7) {
	            System.out.println("------------------------------------");
	            System.out.println("Sistema de Cadastro de Contas");
	            System.out.println("------------------------------------");
	            System.out.println("1 - Cadastrar nova conta corrente");
	            System.out.println("2 - Cadastrar Nova conta especial");
	            System.out.println("3 - Pesquisar conta conta");
	            System.out.println("4 - Excluir conta");
	            System.out.println("5 - Realizar saque");
	            System.out.println("6 - Realizar depósito");
	            System.out.println("7 - Sair do programa");
	            System.out.println("------------------------------------");
	            System.out.print("Informe a operação que deseja:   ");
	            opcao = teclado.nextInt();
	            
	            switch (opcao) {
	                case 1:

	                    System.out.println("------------------------------------");
	                    System.out.println("Cadastrar nova conta corrente");
	                    System.out.println("------------------------------------");
	                    System.out.println("Digite o número da conta:");
	                    numeroConta = teclado.nextInt();
	                    System.out.println("Digite o saldo da conta:");
	                    saldo = teclado.nextDouble();
	                    conta = new ContaCorrente(numeroConta, saldo);
	                    contas.adicionar(conta);
	                    break;

	                case 2:

	                    System.out.println("------------------------------------");
	                    System.out.println("Cadastrar conta corrente especial");
	                    System.out.println("------------------------------------");
	                    System.out.println("Digite o número da conta:");
	                    numeroConta = teclado.nextInt();
	                    System.out.println("Digite o saldo da conta:");
	                    saldo = teclado.nextDouble();
	                    System.out.println("Digite o limite da conta:");
	                    limite = teclado.nextDouble();
	                    conta = new ContaCorrenteEspecial(numeroConta, saldo, limite);
	                    contas.adicionar(conta);
	                    break;

	                case 3:

	                    System.out.println("------------------------------------");
	                    System.out.println("Pesquia Conta");
	                    System.out.println("------------------------------------");
	                    System.out.println("Digite o número da conta:");
	                    numeroConta = teclado.nextInt();
	                    System.out.println("------------------------------------");
	                    System.out.println(contas.exibir(numeroConta));
	                    break;

	                case 4:

	                    System.out.println("------------------------------------");
	                    System.out.println("Excluir conta");
	                    System.out.println("------------------------------------");
	                    System.out.println("Digite o número da conta que deseja excluir:");
	                    numeroConta = teclado.nextInt();
	                    System.out.println("------------------------------------");
	                    boolean removeu = contas.remover(numeroConta);
	                    if(removeu) {
	                        System.out.println("Conta excluida com sucesso.");
	                    } else {
	                        System.out.println("Não foi possível realizar a exclusão.");
	                    }
	                    break;

	                case 5:

	                    System.out.println("------------------------------------");
	                    System.out.println("Operação Saque  ");
	                    System.out.println("------------------------------------");
	                    System.out.println("Qual conta deseja efetuar o sacar:");
	                    numeroConta = teclado.nextInt();
	                    System.out.println("Qual valor desejado? :");
	                    valorDoSaque = teclado.nextDouble();
	                    System.out.println("------------------------------------");
	                    System.out.println(contas.saca(numeroConta, valorDoSaque));
	                    break;
	                
	                case 6:

	                    System.out.println("------------------------------------");
	                    System.out.println("Operação Deposito");
	                    System.out.println("------------------------------------");
	                    System.out.println("Qual conta para o despósito:");
	                    numeroConta = teclado.nextInt();
	                    System.out.println("Qual valor do deposito:");
	                    valorDoDeposito = teclado.nextDouble();
	                    System.out.println("------------------------------------");
	                    System.out.println(contas.deposita(numeroConta, valorDoDeposito));
	                    break;

	                case 7:

	                    System.out.println("Saindo do Programa");
	                    break;

	                default:

	                    System.out.println("Opção inválida");
	                    break;

	            }
	        }

	        teclado.close();

	}

}
