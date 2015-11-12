package ufpb.aps.validador;
import ufpb.aps.exception.ValorInvalidoException;

public class ValidadorInteiro implements ValidadorCampo{

	@Override
	public void validar(String valor) throws ValorInvalidoException {
		
		try {
			Integer.parseInt(valor);
		} catch (Exception e) {
			throw new ValorInvalidoException("Entrada inválida! - Entre apenas com números!");
		}
		
	}

}
