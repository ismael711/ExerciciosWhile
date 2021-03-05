import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// No parque Valter Dino World, os clientes podem ter a chance de passar uma noite no castelo da princesa Javarella. Para isso, devem acertar quantos feijões estão em um jarro (1238). Faça um programa que solicite a digitação da quantidade de feijões até que um cliente acerte
				int quantidadeFeijao = 0;
				
				Scanner leitor = new Scanner(System.in);
				
				System.out.println("Seja bem vindo ao Parque Valter Dino World");
				System.out.println("Por favor, informe a quantidade de feijões: ");
				quantidadeFeijao = leitor.nextInt();
				
				while(quantidadeFeijao != 1238) {
					System.out.println("Você errou, tente novamente!");
					System.out.println("Por favor, informe a quantidade de feijões: ");
					quantidadeFeijao = leitor.nextInt();
				}
				
				System.out.println("Você acertou, parabéns!"); 
				System.out.println("Por favor, dirija-se à portaria do Castelo da Princesa Javarella!");
				
				leitor.close();
	}

}
