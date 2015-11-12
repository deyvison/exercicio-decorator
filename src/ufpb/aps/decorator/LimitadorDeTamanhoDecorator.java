package ufpb.aps.decorator;

import ufpb.aps.exception.ValorInvalidoException;
import ufpb.aps.validador.ValidadorCampo;

public class LimitadorDeTamanhoDecorator extends ValidadorDecorator {
	
	private int min;
	private int max;

	public LimitadorDeTamanhoDecorator(int min, int max, ValidadorCampo componente) {
		
		super(componente);
		this.min = min;
		this.max = max;
	}

	@Override
	public void validar(String valor) throws ValorInvalidoException {
		
		super.getComponente().validar(valor);
		
		if(valor.length() < this.min || valor.length() > this.max)
			throw new ValorInvalidoException("Tamanho da entrada inválida!");
	}

}

// além de verificar se é texto, deve verificar também se está o tamanho correto
//(expande as funcionalidades)