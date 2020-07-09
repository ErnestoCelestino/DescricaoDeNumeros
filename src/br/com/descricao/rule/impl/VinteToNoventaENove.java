package br.com.descricao.rule.impl;

import br.com.descricao.rule.CategoriasDeNumeros;
import br.com.descricao.rule.NumbersReferences;

/**
 * @author Ernesto Scaringi
 *
 */
public class VinteToNoventaENove extends NumbersReferences implements CategoriasDeNumeros {
	
	private static String E_DESCRIPTION = " e ";
	private static Integer MAX = 99;
	private static Integer MIN = 19;
	private static char ZERO_CHAR = '0';

	@Override
	public Boolean accept(Integer valor) {
		return valor > MIN && valor <= MAX; 
	}

	@Override
	public String valorToString(Integer valor) {
		
		ZeroToDezenove icategoria = new ZeroToDezenove();

		String resultado = "";
		if(valor > MIN) {
			String digitos = valor.toString();
			char pos1 = digitos.charAt(0);
			char pos2 = digitos.charAt(1);
			Integer val1 = Integer.parseInt(pos1 + "");
			Integer val2 = Integer.parseInt(pos2 + "");
			String desc1 = vinteToNoventa.get(val1);
			resultado = pos2 == ZERO_CHAR ? desc1 : desc1 + E_DESCRIPTION + icategoria.valorToString(val2);
		}
		return resultado;
	}

}
