package br.com.alura;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento {

	public static void main(String[] args) {
		String cpf = "86288366757";
//		String cpf = "86288366751";
		validarDocumentos(new CPFValidator(), cpf);

		String cnpj = "47324831000182";
		validarDocumentos(new CNPJValidator(), cnpj);

		String tituloEleitor = "47324831000182";
		validarDocumentos(new TituloEleitoralValidator(), tituloEleitor);
		
	}

	private static void validarDocumentos(Validator<String> validador, String documento) {
		try {
			validador.assertValid(documento);
			System.out.println("Documento válido");
		} catch (InvalidStateException e) {
			System.out.println("Documento inválido");
		}
	}

}
