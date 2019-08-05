package com.example.calculadora.model;

public class Operacao {
	
	private int n1;
	private int n2;
	private String tipo;
	private int resultado;
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	public void executaOperacaoSoma() {
		this.setTipo("soma");
		this.setResultado(this.getN1() + this.getN2());		
	}
	
	public void executaOperacaoSubtracao() {
		this.setTipo("subtracao");
		this.setResultado(this.getN1() - this.getN2());		
	}
	
	public void executaOperacaoMultiplicacao() {
		this.setTipo("multipicacao");
		this.setResultado(this.getN1() * this.getN2());		
	}
	
	public void executaOperacaoDivisao() {
		this.setTipo("divisao");
		this.setResultado(this.getN1() / this.getN2());		
	}


}
