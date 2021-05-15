package Entidades;

public class pessoaJuridica extends Contribuinte {
		private Integer nFuncionarios;

		public pessoaJuridica() {
			
		}
		
		public pessoaJuridica(String nome, Double rendaAnual, Integer nFuncionarios) {
			super(nome, rendaAnual);
			this.nFuncionarios = nFuncionarios;
		}

		@Override
		public void calculoImposto() {
			// TODO Auto-generated method stub
			if(nFuncionarios > 10) {
				double imposto = (RendaAnual * 14) / 100;
				System.out.println(imposto);
			}
			else {
				double imposto = (RendaAnual * 16) / 100;
				System.out.println(imposto);
			}
		}

		
		
		
}
