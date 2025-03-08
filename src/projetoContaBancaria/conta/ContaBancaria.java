package projetoContaBancaria.conta;

import java.util.Scanner;

public class ContaBancaria {
	  private String titular;
	    private double saldo;

	    public ContaBancaria(String titular, double saldoInicial) {
	        this.titular = titular;
	        this.saldo = saldoInicial;
	        System.out.println("Conta criada com sucesso para " + titular + " com saldo inicial de R$ " + saldo);
	    }

	    public void depositar(double valor) {
	        if (valor > 0) {
	            saldo += valor;
	            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Valor inválido para depósito.");
	        }
	    }

	    public void sacar(double valor) {
	        if (valor > 0 && valor <= saldo) {
	            saldo -= valor;
	            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
	        } else {
	            System.out.println("Saque não realizado. Saldo insuficiente ou valor inválido.");
	        }
	    }

	    public void exibirSaldo() {
	        System.out.println("Saldo atual: R$ " + saldo);
	    }
	

}

