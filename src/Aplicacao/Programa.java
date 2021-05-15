package Aplicacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entidades.*;
public class Programa {
	public static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Contribuinte> lista = new ArrayList<>();
		
		
		System.out.print("****CALCULO DE IMPOSTOS****");
		System.out.print("\nInsira o número de contribuintes: ");
		int n = sc.nextInt();
		cadastro(n, lista);
		//exibindo contribuintes
		for(Contribuinte l: lista) {
			System.out.println("Nome: " + l.getNome());
			System.out.print("Impostos: ");
			l.calculoImposto();
			System.out.println();
		}
	}
	
	//metodo para cadastro na lista
	public static void cadastro(int n, List<Contribuinte> lista) {
		for(int i =0; i<n; i++) {
			System.out.print("Pessoa Física(1)  \nPessoa Juridica(2)");
			int opcao = sc.nextInt();
			//pessoa fisica
			if(opcao == 1) {
				System.out.println("PESSOA FISICA");
				System.out.println("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();	
				System.out.println("Renda anual: ");
				double renda = sc.nextDouble();
				System.out.println("Gastos com saúde: ");
				double gastos = sc.nextDouble();
				pessoaFisica pessoaF = new pessoaFisica(nome, renda, gastos);
				lista.add(pessoaF);	
			}
			//pessoa juridica
			else if(opcao == 2) {
				System.out.println("PESSOA JURIDICA");
				System.out.println("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.println("Renda anual: ");
				double renda = sc.nextDouble();
				System.out.println("Numero de funcionários: ");
				int numero = sc.nextInt();
				pessoaJuridica pessoaJ = new pessoaJuridica(nome, renda, numero);
				lista.add(pessoaJ);
			}
			else {
				System.out.println("OPÇÃO INVALIDA");
				cadastro(n, lista);
			}
			
		}

	}
	}


