package primeiroPrograma;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Random;

public class JokenpoGame {

	public static void main(String[] args) {
		
		//Definindo os icones
		ImageIcon pedra = new ImageIcon("src/primeiroPrograma/Img/pedra.png");
		ImageIcon papel = new ImageIcon("src/primeiroPrograma/Img/papel.png");
		ImageIcon tesoura = new ImageIcon("src/primeiroPrograma/Img/tesoura.png");
		ImageIcon logo = new ImageIcon("src/primeiroPrograma/Img/logoJokenpo.png");
		ImageIcon empate = new ImageIcon("src/primeiroPrograma/Img/empate.png");
		ImageIcon humanWin = new ImageIcon("src/primeiroPrograma/Img/humanWin.png");
		ImageIcon pcWin = new ImageIcon("src/primeiroPrograma/Img/pcWin.png");
		
		//tela incial
		JOptionPane.showMessageDialog(null, "Jokenpo Game", "*** J O K E N P O ***", JOptionPane.OK_OPTION, logo);
		
		
		//Escolha do Jogador
		Object escolhaJogador;		
		
		ImageIcon opcoesJokenpo[] = {pedra, papel, tesoura};
		
		escolhaJogador = JOptionPane.showInputDialog(
				null, 
				"Faça a sua escolha!", 
				"*** J O K E N P O ***", 
				JOptionPane.INFORMATION_MESSAGE, 
				logo, 
				opcoesJokenpo, 
				opcoesJokenpo[0]);
		
		
		if (escolhaJogador != pedra && escolhaJogador != papel && escolhaJogador != tesoura) {
			JOptionPane.showMessageDialog(null, "Você não selecionou uma das opções :(", "Fim de Jogo", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		//Escolha do Computador
		Random random = new Random();
		int escolhaComputador = random.nextInt(1, 4);
		
		
		if (escolhaJogador == pedra || escolhaJogador == papel || escolhaJogador == tesoura) {
			if (escolhaComputador == 1) {
				JOptionPane.showMessageDialog(null, "O Computado escolheu pedra", "Escolha do Computador", JOptionPane.OK_OPTION, pcWin);
			} else if (escolhaComputador == 2) {
				JOptionPane.showMessageDialog(null, "O Computado escolheu papel", "Escolha do Computador", JOptionPane.OK_OPTION, pcWin);	
			} else if (escolhaComputador == 3) {
				JOptionPane.showMessageDialog(null, "O Computado escolheu tesoura", "Escolha do Computador", JOptionPane.OK_OPTION, pcWin);
			}
		}
		
		
		//Resultado
		if (escolhaJogador == pedra) {
			
			if (escolhaComputador == 1) {
				JOptionPane.showMessageDialog(null, "Deu empate!", "Resultado", JOptionPane.OK_OPTION, empate);
			}
			if (escolhaComputador == 2) {
				JOptionPane.showMessageDialog(null, "Você perdeu!", "Resultado", JOptionPane.OK_OPTION, pcWin);
			}
			if (escolhaComputador == 3) {
				JOptionPane.showMessageDialog(null, "Você ganhou!", "Resultado", JOptionPane.OK_OPTION, humanWin);
			}
			
		}
		
		if (escolhaJogador == papel) {
			
			if (escolhaComputador == 1) {
				JOptionPane.showMessageDialog(null, "Você ganhou!", "Resultado", JOptionPane.OK_OPTION, humanWin);
			}
			if (escolhaComputador == 2) {
				JOptionPane.showMessageDialog(null, "Deu empate!", "Resultado", JOptionPane.OK_OPTION, empate);
			}
			if (escolhaComputador == 3) {
				JOptionPane.showMessageDialog(null, "Você perdeu!", "Resultado", JOptionPane.OK_OPTION, pcWin);
			}
			
		}
		
		if (escolhaJogador == tesoura) {
			
			if (escolhaComputador == 1) {
				JOptionPane.showMessageDialog(null, "Você perdeu!", "Resultado", JOptionPane.OK_OPTION, pcWin);
			}
			if (escolhaComputador == 2) {
				JOptionPane.showMessageDialog(null, "Você ganhou!", "Resultado", JOptionPane.OK_OPTION, humanWin);
			}
			if (escolhaComputador == 3) {
				JOptionPane.showMessageDialog(null, "Deu empate!", "Resultado", JOptionPane.OK_OPTION, empate);
			}
			
		}
		

	}

}
