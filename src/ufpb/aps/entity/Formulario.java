package ufpb.aps.entity;
import java.util.ArrayList;
import java.util.List;

import ufpb.aps.exception.ValorInvalidoException;

public class Formulario {
	
	private String titulo;
	private List<Campo> campos;
	
	public Formulario(String titulo){
		this.titulo = titulo;
		this.campos = new ArrayList<Campo>();
	}
	
	public void adicionarCampo(Campo campo) {
		this.campos.add(campo);
	}

	public void validarFormulario() {
		
		for(Campo c : this.campos){
			
			try {
				c.getValidador().validar(c.getValor());
				
				
			} catch (ValorInvalidoException e) {
				
				System.out.println(e.getMessage());
				
			}
		}
		
	}
}
