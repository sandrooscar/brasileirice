package br.com.alura;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.NITFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {

	public static void main(String[] args) {
		String cpf = "862.883.667-57";
		String cnpj = "47.324.831/0001-82";
		String tituloEleitor = "774349832321";
		String nit = "77439741678";//pis/pasep
		System.out.println(desformatarDocumentos(new CPFFormatter(), cpf));
		System.out.println(desformatarDocumentos(new CNPJFormatter(), cnpj));
		System.out.println(formatarDocumentos(new TituloEleitoralFormatter(), tituloEleitor));
		System.out.println(formatarDocumentos(new NITFormatter(), nit));
	}
	
	private static String formatarDocumentos(Formatter formatter, String documento) {
		try {
			return formatter.format(documento);
		}catch (IllegalArgumentException e) {
			System.out.println("Formato inválido de documento");
		}
		return "";
	}
	private static String desformatarDocumentos(Formatter formatter, String documento) {
		try {
			return formatter.unformat(documento);
		}catch (IllegalArgumentException e) {
			System.out.println("Formato inválido de documento");
		}
		return "";
	}

}
