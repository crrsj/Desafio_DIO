package projetoContaBancaria.conta;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Bem-vindo ao sistema bancário!");
	        System.out.print("Digite o nome do titular da conta: ");
	        String nomeTitular = scanner.nextLine();
	        System.out.print("Digite o saldo inicial: ");
	        double saldoInicial = scanner.nextDouble();
	        
	        ContaBancaria conta = new ContaBancaria(nomeTitular, saldoInicial);
	        
	        int opcao;
	        do {
	            System.out.println("\nEscolha uma operação:");
	            System.out.println("1 - Depositar");
	            System.out.println("2 - Sacar");
	            System.out.println("3 - Consultar Saldo");
	            System.out.println("0 - Sair");
	            System.out.print("Opção: ");
	            opcao = scanner.nextInt();
	            
	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o valor para depósito: ");
	                    double valorDeposito = scanner.nextDouble();
	                    conta.depositar(valorDeposito);
	                    break;
	                case 2:
	                    System.out.print("Digite o valor para saque: ");
	                    double valorSaque = scanner.nextDouble();
	                    conta.sacar(valorSaque);
	                    break;
	                case 3:
	                    conta.exibirSaldo();
	                    break;
	                case 0:
	                    System.out.println("Obrigado por utilizar nosso banco!");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (opcao != 0);
	        
	        scanner.close();
	    }
	}

