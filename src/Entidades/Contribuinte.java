package Entidades;

public abstract class Contribuinte {
	private String Nome;
	protected Double RendaAnual;
	
	public Contribuinte() {
		
	}
	
	public Contribuinte(String nome, Double rendaAnual) {
		Nome = nome;
		RendaAnual = rendaAnual;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Double getRendaAnual() {
		return RendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		RendaAnual = rendaAnual;
	}
	
	public abstract void calculoImposto();
	
	
}
