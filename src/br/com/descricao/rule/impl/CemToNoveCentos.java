package br.com.descricao.rule.impl;

import br.com.descricao.rule.CategoriasDeNumeros;
import br.com.descricao.rule.NumbersReferences;

/**
 * @author Ernesto Scaringi
 *
 */
public class CemToNoveCentos extends NumbersReferences implements CategoriasDeNumeros {
	
	private static String E_DESCRIPTION = " e ";
	private static String CEM_DESCRIPTION = "cem";
	private static Integer MAX = 999;
	private static Integer MIN = 99;
	private static Integer CEM_CONST = 100;

	@Override
	public Boolean accept(Integer valor) {
		return valor > MIN && valor <= MAX;
	}

	@Override
	public String valorToString(Integer valor) {
		return valor == CEM_CONST ? CEM_DESCRIPTION : buildName(valor);
	}

	private String buildName(Integer valor) {
		
		initCategorias();
		String digitos = valor.toString();
		char pos1 = digitos.charAt(0);
		Integer val1 = Integer.parseInt(pos1 + "");
		Integer val2 = valor - (val1 * 100);
		String desc1 = cemToNovencetos.get(val1);
		String desc2 = "";
		
		for (CategoriasDeNumeros icat : iCategorias) {
			if (icat.accept(val2)) {
				desc2 = icat.valorToString(val2);
			}
		}
		return val2 > 0 ? (desc1 + E_DESCRIPTION + desc2) :(desc1) ;
	}

}
