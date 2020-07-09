package br.com.descricao.rule.impl;

import br.com.descricao.rule.CategoriasDeNumeros;
import br.com.descricao.rule.NumbersReferences;

/**
 * @author Ernesto Scaringi
 *
 */
public class ZeroToDezenove extends NumbersReferences implements CategoriasDeNumeros {
	
	private static Integer MAX = 20;
	private static Integer MIN = 0;
	
	@Override
	public Boolean accept(Integer valor) {
		return valor >= MIN && valor < MAX;
	}
	
	@Override
	public String valorToString(Integer valor) {
		return zeroToDezenove.get(valor);
	}
}
