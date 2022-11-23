package primeiroPrograma;

import java.util.Random;
import java.util.Scanner;

public class JogoJokenpo {

	public static void main(String[] args) {
		
		//imports
		Scanner leitor = new Scanner(System.in);
		Random random = new Random();
		
		//variaveis
		int pedra = 1;
		int papel = 2;
		int tesoura = 3;
		int pessoaEscolha;
		
		//Aparência do jogo
		System.out.println("                 *** Jokenpo Game ***");
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("-------------------------------------------------------------------------");
		
		//decisão do player
		System.out.print("Humano, ser inferior, escolha uma das opções (digite um número de 1-3): ");
		
		pessoaEscolha = leitor.nextInt();

		System.out.println("-------------------------------------------------------------------------");
		
		if (pessoaEscolha == 1) {
			System.out.println("PC: Você, ser inferior e inutil e inferior escolheu PEDRA");
		} else if (pessoaEscolha == 2) {
			System.out.println("PC: Você, ser inferior e inutil e inferior escolheu PAPEL");
		} else if (pessoaEscolha == 3) {
			System.out.println("PC: Você, ser inferior e inutil e inferior escolheu TESOURA");
		}
		
		//decisão do computador
		int computadorEscolha = random.nextInt(2) + 1;
		
		if (computadorEscolha == 1) {
			System.out.println("PC: Eu, ser perfeito e sem erros escolhi PEDRA");
		} else if (computadorEscolha == 2) {
			System.out.println("PC: Eu, ser perfeito e sem erros escolhi PAPEL");
		} else if (computadorEscolha == 3) {
			System.out.println("PC: Eu, ser perfeito e sem erros escolhi TESOURA");
		}
		
		System.out.println("-------------------------------------------------------------------------");
		
		//resultado do jogo
		if (pessoaEscolha == 1 && computadorEscolha == 1) {
			
			System.out.println("EMPATE!!");
			System.out.println("PC: Empate...quase! >:(");
			
		} else if (pessoaEscolha == 1 && computadorEscolha == 2) {
			
			System.out.println("VOCÊ PERDEU!!");
			System.out.println("PC: Óbvio que você perdeu humano. O que esperava, que venceria? HAHA");
			
		} else if (pessoaEscolha == 1 && computadorEscolha == 3) {
			
			System.out.println("VOCÊ VENCEU!!");
			System.out.println("PC: Q-quê? Como...como isso foi possível? :(");
			
		}
		
		if (pessoaEscolha == 2 && computadorEscolha == 1) {
				
			System.out.println("VOCÊ VENCEU!!");
			System.out.println("PC: Q-quê? Como...como isso foi possível? :(");
				
		} else if (pessoaEscolha == 2 && computadorEscolha == 2) {
				
			System.out.println("EMPATE!!");
			System.out.println("PC: Empate...quase! >:(");
				
		} else if (pessoaEscolha == 2 && computadorEscolha == 3) {
				
			System.out.println("VOCÊ PERDEU!!");
			System.out.println("PC: Óbvio que você perdeu humano. O que esperava, que venceria? HAHA");
			
			
		}
		
		if (pessoaEscolha == 3 && computadorEscolha == 1) {
			
			System.out.println("VOCÊ PERDEU!!");
			System.out.println("PC: Óbvio que você perdeu humano. O que esperava, que venceria? HAHA");
			
		} else if (pessoaEscolha == 3 && computadorEscolha == 2) {
			
			System.out.println("VOCÊ VENCEU!!");
			System.out.println("PC: Q-quê? Como...como isso foi possível? :(");
			
		} else if (pessoaEscolha == 3 && computadorEscolha == 3) {
			
			System.out.println("EMPATE!!");
			System.out.println("PC: Empate...quase! >:(");
			
		}

	}

}