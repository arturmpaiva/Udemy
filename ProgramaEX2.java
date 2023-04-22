package application;

import java.util.Scanner;

import entities.Empregado;

public class ProgramaEX2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		
		System.out.println("Digite o nome e o salário bruto do empregado: ");
		empregado.nome = entrada.nextLine();
		empregado.salarioBruto = entrada.nextDouble();
		System.out.println("Digite o imposto a ser pago: ");
		empregado.imposto = entrada.nextDouble();
		
		System.out.println("Empregado: " + empregado.nome + ", $ " + empregado.salarioLiquido());
		
		System.out.println("Digite a porcentagem que o salário bruto receberá de aumento: ");
		double porcentagem = entrada.nextDouble();
		empregado.aumentoSalario(porcentagem);
		
		System.out.println("Dados atualizados: " + empregado);
		
	}

}
