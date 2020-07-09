package br.com.descricao.rule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.descricao.rule.impl.CemToNoveCentos;
import br.com.descricao.rule.impl.MilToNoventaMil;
import br.com.descricao.rule.impl.VinteToNoventaENove;
import br.com.descricao.rule.impl.ZeroToDezenove;



/**
 * @author Ernesto Scaringi
 *
 */
public abstract class NumbersReferences {
	
	protected static Map<Integer, String> zeroToDezenove = new HashMap<Integer, String>();
	protected static Map<Integer, String> vinteToNoventa = new HashMap<Integer, String>();
	protected static Map<Integer, String> cemToNovencetos = new HashMap<Integer, String>();
	protected static List<CategoriasDeNumeros> iCategorias = new ArrayList<CategoriasDeNumeros>();
			
	public NumbersReferences() {
		initZeroToDezenove();
		initVinteToNoventa();
		initCemToNovencetos();		
	}
	
	public void initCategorias() {
		iCategorias = Arrays.asList(
				new VinteToNoventaENove(), 
				new ZeroToDezenove(), 
				new MilToNoventaMil(),
				new CemToNoveCentos());
	}
	private void initCemToNovencetos() {
		cemToNovencetos.put(1,"cento");
		cemToNovencetos.put(2,"duzentos");
		cemToNovencetos.put(3,"trezentos");
		cemToNovencetos.put(4,"quatrocentos");
		cemToNovencetos.put(5,"quinhentos");
		cemToNovencetos.put(6,"seiscentos");
		cemToNovencetos.put(7,"setecentos");
		cemToNovencetos.put(8,"oitocentos");
		cemToNovencetos.put(9,"novecentos");
	}
	private void initVinteToNoventa() {
		vinteToNoventa.put(2,"vinte");
		vinteToNoventa.put(3,"trinta");
		vinteToNoventa.put(4,"quarenta");
		vinteToNoventa.put(5,"cinquenta");
		vinteToNoventa.put(6,"sessenta");
		vinteToNoventa.put(7,"setenta");
		vinteToNoventa.put(8,"oitenta");
		vinteToNoventa.put(9,"noventa");		
	}
	private void initZeroToDezenove() {
		zeroToDezenove.put(0,"zero");
		zeroToDezenove.put(1,"um");
		zeroToDezenove.put(2,"dois");
		zeroToDezenove.put(3,"tres");
		zeroToDezenove.put(4,"quatro");
		zeroToDezenove.put(5,"cinco");
		zeroToDezenove.put(6,"seis");
		zeroToDezenove.put(7,"sete");
		zeroToDezenove.put(8,"oito");
		zeroToDezenove.put(9,"nove");
		zeroToDezenove.put(10,"dez");
		zeroToDezenove.put(11,"onze");
		zeroToDezenove.put(12,"doze");
		zeroToDezenove.put(13,"treze");
		zeroToDezenove.put(14,"quatorze");
		zeroToDezenove.put(15,"quinze");
		zeroToDezenove.put(16,"dezeseis");
		zeroToDezenove.put(17,"dezesete");
		zeroToDezenove.put(18,"dezoito");
		zeroToDezenove.put(19,"dezenove");
	}

}
