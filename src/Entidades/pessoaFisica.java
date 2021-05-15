package Entidades;

public class pessoaFisica extends Contribuinte {
	private Double gastoSaude;

	public pessoaFisica() {
		
	}
	
	public pessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	@Override
	//calculando impostos 
	public void calculoImposto() {
		
		if(RendaAnual < 20000) {
			double imposto = (RendaAnual * 15) / 100;
			if(gastoSaude > 0) {
				double desconto = (gastoSaude * 50) / 100;
				System.out.print( imposto - desconto);
			}
			else {
				System.out.print(imposto);
			}
			
		}
		//se renda for maior que 20k
		else if(RendaAnual > 20000) {
			double imposto = (RendaAnual * 25) / 100;
			if(gastoSaude > 0) {
				double desconto = (gastoSaude * 50) / 100;
				System.out.print( imposto - desconto);
			}
			else {
				System.out.print(imposto);
			}
		}
		
	}
	
	
	
	
}
