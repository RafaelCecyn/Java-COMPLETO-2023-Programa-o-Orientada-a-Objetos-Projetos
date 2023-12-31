
/*
 Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial,horaFinal,duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial == horaFinal) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		else if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
			System.out.printf("O JOGO DUROU %d HORAS(S)",duracao);
		}
		else {
			horaFinal = horaFinal + 24;
			duracao = horaFinal - horaInicial;
			System.out.printf("O JOGO DUROU %d HORAS(S)",duracao);
		}
		sc.close();

	}

}
