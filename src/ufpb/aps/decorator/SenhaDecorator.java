package ufpb.aps.decorator;

import ufpb.aps.exception.ValorInvalidoException;
import ufpb.aps.validador.ValidadorCampo;

public class SenhaDecorator extends ValidadorDecorator {

	public SenhaDecorator(ValidadorCampo componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void validar(String valor) throws ValorInvalidoException {

		super.getComponente().validar(valor);

		int qtNum = 0;
		int qtLt = 0;

		for (Character c : valor.toCharArray()) {
			if (c.isDigit(c))
				qtNum++;
			if (c.isLetter(c))
				qtLt++;
			
		}
		
		if ((qtNum < 4 || qtLt < 3) || (qtNum >= 4 && qtLt < 3) || (qtNum < 4 && qtLt >= 3))
			throw new ValorInvalidoException("A senha deve ter no mínimo 4 números e 3 letras!");

	}

}
// verifica se a senha é texto
// verifica se a senha está no intervalo de tamanho min e max
// por fim verifica se a senha contém no mínimo 4 números e 3 letras
