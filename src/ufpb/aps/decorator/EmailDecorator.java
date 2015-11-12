package ufpb.aps.decorator;

import ufpb.aps.exception.ValorInvalidoException;
import ufpb.aps.validador.ValidadorCampo;

public class EmailDecorator extends ValidadorDecorator{

	public EmailDecorator(ValidadorCampo componente) {
		
		super(componente);
		
	}

	@Override
	public void validar(String valor) throws ValorInvalidoException {
		
		super.getComponente().validar(valor);
		
		if(!valor.contains("@"))
			throw new ValorInvalidoException("Email inválido!");
	}

}
