package br.com.descricao.rule;
/**
 * 
 */

/**
 * @author Ernesto Scaringi
 *
 */
public interface CategoriasDeNumeros {
	
	/**
	 * @param valor
	 * @return
	 */
	public Boolean accept(Integer valor);
	
	/**
	 * @param valor
	 * @return
	 */
	public String valorToString(Integer valor);
}
