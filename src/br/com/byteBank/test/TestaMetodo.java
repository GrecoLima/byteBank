package br.com.byteBank.test;

import br.com.byteBank.beans.Conta;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setSaldo(100);
		conta.deposita(100);
		
		System.out.println(conta.getSaldo());
		
		//Armazena valor do retorno do método saca
		boolean saldoResgatado = conta.saca(200);
		
		System.out.println("Saldo resgatado: " + saldoResgatado);
		System.out.println("Saldo atual: " + conta.getSaldo());
		
	}

}
