package Desafio;

import java.util.Scanner;

public class DesafioLogica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int prod = 15;
		double[] precoUnitProd = new double[prod];
		int[] quantidadeProd = new int[prod];
		char[] categoriaProd = new char[prod];
		
		double valorEstoqueM = 0;
		double valorEstoqueE = 0;
		double valorEstoqueV = 0;
		
		// Porcentagens para Impostos e Margem de Lucro
		double calcImpostoM = 0.3741;
		double calcImpostoE = 0.4314;
		double calcImpostoV = 0.3842;
		double calcMargemLucroM = 0.3;
		double calcMargemLucroE = 0.35;
		double calcMargemLucroV = 0.5;
		
		for	(int i = 0; i < prod; i++){
			System.out.println("Informe a categoria do produto: M = Cama, mesa e banho; E = Eletrodoméstico; V = Vestuário: ");
			categoriaProd[i] = sc.next().charAt(0);
			categoriaProd[i] = Character.toUpperCase(categoriaProd[i]);
			
			if (categoriaProd[i] == 'M') {
				System.out.printf("Informe o preço do produto nº " + (i+1) + "\n");
				precoUnitProd[i] = sc.nextDouble();
				System.out.println("Informe o quantidade de produtos: ");
				quantidadeProd[i] = sc.nextInt();
				valorEstoqueM += (precoUnitProd[i] * quantidadeProd[i]);
				
			}else if (categoriaProd[i] == 'E') {
				System.out.printf("Informe o preço do produto nº " + (i+1) + "\n");
				precoUnitProd[i] = sc.nextDouble();
				System.out.println("Informe o quantidade de produtos: ");
				quantidadeProd[i] = sc.nextInt();
				valorEstoqueE += (precoUnitProd[i] * quantidadeProd[i]);
				
			}else if (categoriaProd[i] == 'V') {
				System.out.printf("Informe o preço do produto nº " + (i+1) + "\n");
				precoUnitProd[i] = sc.nextDouble();
				System.out.println("Informe o quantidade de produtos: ");
				quantidadeProd[i] = sc.nextInt();
				valorEstoqueV += (precoUnitProd[i] * quantidadeProd[i]);
				
			}else {
				System.out.println("Informe uma categoria válida!");
				i--;
			}
		}
		// Valor dos impostos por categoria
		System.out.printf("Total de impostos da categoria M: R$%.2f\n", (valorEstoqueM * calcImpostoM));
		System.out.printf("Total de impostos da categoria E: R$%.2f\n", (valorEstoqueE * calcImpostoE));
		System.out.printf("Total de impostos da categoria V: R$%.2f\n", (valorEstoqueV * calcImpostoV));
		
		System.out.printf("Total da margem de lucro da categoria M: R$%.2f\n", (valorEstoqueM - (valorEstoqueM * calcImpostoM))*calcMargemLucroM);
		System.out.printf("Total da margem de lucro da categoria E: R$%.2f\n", (valorEstoqueE - (valorEstoqueE * calcImpostoE))*calcMargemLucroE);
		System.out.printf("Total da margem de lucro da categoria V: R$%.2f\n", (valorEstoqueV - (valorEstoqueV * calcImpostoV))*calcMargemLucroV);
		
		System.out.printf("Valor total de estoque, da categoria M: R$%.2f\n", (valorEstoqueM));
		System.out.printf("Valor total de estoque, da categoria E: R$%.2f\n", (valorEstoqueE));
		System.out.printf("Valor total de estoque, da categoria V: R$%.2f\n", (valorEstoqueV));
		
		sc.close();
	}

}
