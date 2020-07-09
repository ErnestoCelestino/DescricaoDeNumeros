package br.com.descricao.rule.impl;

import br.com.descricao.rule.CategoriasDeNumeros;
import br.com.descricao.rule.NumbersReferences;

/**
 * @author Ernesto Scaringi
 *
 */
public class MilToNoventaMil extends NumbersReferences implements CategoriasDeNumeros {
	
	private static Integer MAX = 1000;
	private static Integer MIN = 9999;
	private static Integer CONST_CEM = 100;
	private static Integer CONST_ZERO = 0;
	private static String MIL_DESCRIPTION = " mil";
	private static String E_DESCRIPTION = " e ";
	

	@Override
	public Boolean accept(Integer valor) {
		return valor >= MAX && valor <= MIN;
	}

	@Override
	public String valorToString(Integer valor) {
		
		initCategorias();
		
		String result = "";
		String desc1 = "";
		String desc2 = "";
		
		try {
			
			char pos1 = valor.toString().charAt(CONST_ZERO);
			Integer val1 = Integer.parseInt(pos1 + "");
			Integer val2 = valor - (val1 * MAX);

			for (CategoriasDeNumeros icat : iCategorias) {
				if (icat.accept(val1)) {
					desc1 = icat.valorToString(val1) + MIL_DESCRIPTION;
				}
			}
			
			if (val2 > CONST_ZERO) {
				for (CategoriasDeNumeros icat : iCategorias) {
					if (icat.accept(val2)) {
						desc2 = icat.valorToString(val2);
					}
				}
			}
			
			result = val2 >= CONST_CEM ? 
					(desc2.length() > 0 ? (desc1 + " " + desc2) : desc1) : 
					(desc2.length() > 0  ? (desc1 + E_DESCRIPTION + desc2) : desc1);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return result;
	}
}
