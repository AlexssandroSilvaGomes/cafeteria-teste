package calculadoraImc;

import javax.swing.JOptionPane;

public class CalculadoraImc {

	public static void main(String[] args) {
		
		//variaveis
		int peso;
		double altura;
		String auxilio;
		String classificacao = "";
		
		auxilio = JOptionPane.showInputDialog(
				null, 
				"Digite a sua altura (use ponto): ", 
				"Calculadora IMC", 
				JOptionPane.QUESTION_MESSAGE);

		altura = Double.parseDouble(auxilio);
		
		auxilio = JOptionPane.showInputDialog(
				null, 
				"Digite seu peso: ", 
				"Calculadora IMC", 
				JOptionPane.QUESTION_MESSAGE);

		
		peso = Integer.parseInt(auxilio);
		
		double imc = peso / Math.pow(altura, 2.0);
		
		
		if (imc <= 18.5) {
			
			classificacao = "Classificação: abaixo do peso";
			
		} else if (imc > 18.5 && imc <= 24.9) {
			
			classificacao = "Classificação: peso ideal (parabéns)";
			
		} else if (imc > 24.9 && imc <= 29.9) {
			
			classificacao = "Classificação: levemente acima do peso";
			
		} else if (imc > 29.9 && imc <= 34.9) {
			
			classificacao = "Classificação: obesidade grau I";
			
		} else if (imc > 34.9 && imc <= 39.9) {
			
			classificacao = "Classificação: obesidade grau II (severa)";
			
		} else if (imc > 39.9) {
			
			classificacao = "Classificação: obesidade grau III (móbida)";
			
		}
		
		classificacao = classificacao + "\nSeu IMC é: " + String.format("%.1f", imc);
		
		JOptionPane.showMessageDialog(
				null, 
				classificacao,
				"Calculadora IMC", 
				JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}