package ufpb.aps.main;

import ufpb.aps.decorator.EmailDecorator;
import ufpb.aps.decorator.LimitadorDeTamanhoDecorator;
import ufpb.aps.decorator.SenhaDecorator;
import ufpb.aps.entity.Campo;
import ufpb.aps.entity.Formulario;
import ufpb.aps.validador.ValidadorInteiro;
import ufpb.aps.validador.ValidadorTexto;

public class Main {
	
	public static void main(String[] args) {
		
		Formulario formulario = new Formulario("Cadastro PB-Prev");
		
		Campo c1 = new Campo("Login", new LimitadorDeTamanhoDecorator(6, 30, new ValidadorTexto()));
		Campo c2 = new Campo("Senha", new SenhaDecorator(new LimitadorDeTamanhoDecorator(5,15,new ValidadorTexto())));
		Campo c3 = new Campo("Idade", new ValidadorInteiro());
		Campo c4 = new Campo("Sexo", new LimitadorDeTamanhoDecorator(1, 1, new ValidadorTexto()));
		Campo c5 = new Campo("E-mail", new EmailDecorator(new ValidadorTexto()));
		
		c1.setValor("deyvison.oliveira2");
		c2.setValor("abbbb4533");
		c3.setValor("123");
		c4.setValor("M");
		c5.setValor("deyvison.melo@dce.ufpb.br");
		
		formulario.adicionarCampo(c1);
		formulario.adicionarCampo(c2);
		formulario.adicionarCampo(c3);
		formulario.adicionarCampo(c4);
		formulario.adicionarCampo(c5);
		
		formulario.validarFormulario();
		
	}
}
