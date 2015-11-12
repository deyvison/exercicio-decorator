package ufpb.aps.decorator;

import ufpb.aps.exception.ValorInvalidoException;
import ufpb.aps.validador.ValidadorCampo;

public abstract class ValidadorDecorator implements ValidadorCampo {
	
	private ValidadorCampo componente;
	
	public ValidadorDecorator(ValidadorCampo componente) {
		this.componente = componente;
	}
		
	public abstract void validar(String valor) throws ValorInvalidoException;
	
	public ValidadorCampo getComponente(){
		return this.componente;
	}
	
}
