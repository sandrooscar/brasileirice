package br.com.alura;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoDocumento {

	public static void main(String[] args) {
//		String cpf = "86288366757";
		String cpf = "86288366751";
		CPFValidator validador = new CPFValidator();
		try {
			validador.assertValid(cpf);
			System.out.println("CPF v�lido");
		}catch (InvalidStateException e) {
			System.out.println("CPF inv�lido: "+e.toString());
		}
	}

}
