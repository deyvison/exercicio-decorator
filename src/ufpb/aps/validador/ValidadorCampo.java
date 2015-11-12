package ufpb.aps.validador;
import ufpb.aps.exception.ValorInvalidoException;

public interface ValidadorCampo {
	
	public void validar(String valor) throws ValorInvalidoException;
}
// principal funcionalidade do decorator é expandir funcionalidades
