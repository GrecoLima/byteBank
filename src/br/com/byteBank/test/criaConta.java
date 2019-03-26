package br.com.byteBank.test;

import br.com.byteBank.beans.Conta;

public class criaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.setSaldo(200);
		
		System.out.println(primeiraConta.getSaldo());
		
		
	}
	
}
