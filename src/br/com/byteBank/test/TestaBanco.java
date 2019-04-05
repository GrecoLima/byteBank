package br.com.byteBank.test;

import br.com.byteBank.beans.Cliente;
import br.com.byteBank.beans.Conta;

public class TestaBanco {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo SIlveira");
		paulo.setCpf("123.456.789-10");
		paulo.setProfissao("Programador");
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
	}

}
