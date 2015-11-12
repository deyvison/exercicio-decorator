package ufpb.aps.entity;
import ufpb.aps.validador.ValidadorCampo;

public class Campo {
	
	private String label;
	private ValidadorCampo validador;
	private String valor;
	
	public Campo(String label,ValidadorCampo validador){
		this.label = label;
		this.validador = validador;
	}

	public ValidadorCampo getValidador() {
		return this.validador;
	}
	
	public String getValor(){
		return this.valor;
	}
	
	public void setValor(String valor){
		this.valor = valor;
	}

}
