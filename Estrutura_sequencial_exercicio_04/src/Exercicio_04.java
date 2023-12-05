
/*
 Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, 
 o valor que recebe por
 hora e calcula o salário desse funcionário. A seguir, mostre o número e 
 o salário do funcionário, com duas casas decimais.
  */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numeroFuncionario,horasTrabalhadas;
		double valorPorHora,salario;
		
		numeroFuncionario = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorPorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorPorHora;
		
		System.out.println("Number = " + numeroFuncionario);
		System.out.printf("Salary = U$ %.2f%n",salario);
		
		sc.close();
	}

}
