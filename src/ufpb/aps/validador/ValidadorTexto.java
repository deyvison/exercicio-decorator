package ufpb.aps.validador;
import ufpb.aps.exception.ValorInvalidoException;

public class ValidadorTexto implements ValidadorCampo {

	@Override
	public void validar(String valor) throws ValorInvalidoException {
		
		try {
			String convert = ""+valor;
			
		} catch (Exception e) {
			throw new ValorInvalidoException("Entrada inválida! - Erro ao validar texto!");
		}
		
	}

}
