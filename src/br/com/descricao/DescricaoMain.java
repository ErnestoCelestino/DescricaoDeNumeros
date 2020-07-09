package br.com.descricao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.descricao.rule.CategoriasDeNumeros;
import br.com.descricao.rule.NumbersReferences;
import br.com.descricao.rule.impl.CemToNoveCentos;
import br.com.descricao.rule.impl.MilToNoventaMil;
import br.com.descricao.rule.impl.VinteToNoventaENove;
import br.com.descricao.rule.impl.ZeroToDezenove;

public class DescricaoMain extends NumbersReferences {

	
	
	public static void main(String[] args) {

		List<CategoriasDeNumeros> iCategorias = new ArrayList<CategoriasDeNumeros>();
		iCategorias = Arrays.asList(
				new VinteToNoventaENove(), 
				new ZeroToDezenove(), 
				new MilToNoventaMil(),
				new CemToNoveCentos());
		
		Integer numero = 9150;
		
		for (CategoriasDeNumeros iCategoria : iCategorias) {
			if(iCategoria.accept(numero)) {
				System.out.println(iCategoria.valorToString(numero));
			}
		}
	}
}
