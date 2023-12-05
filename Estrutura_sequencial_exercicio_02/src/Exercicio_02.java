import java.util.Scanner;
import java.util.Locale;

/*
 Faça um programa para ler o valor do raio de um círculo, e depois mostrar 
 o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
  */
public class Exercicio_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio,area;
		raio = sc.nextDouble();
		area = Math.pow(raio, 2) * Math.PI;
		
		System.out.printf("A=%.4f",area);
		
		sc.close();
		

	}

}
