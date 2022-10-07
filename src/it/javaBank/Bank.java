package it.javaBank;

import java.util.Random;
import java.util.Scanner;

import it.javaBank.Conto.Conto;

public class Bank {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		boolean finished = false;
		System.out.print("Crea il tuo conto inserendo il tuo nome: ");
		Conto contoCorrente = new Conto(r.nextInt(), in.nextLine());
		do {
			System.out.print("Cosa vuoi fare? Prelevare? Depositare? Uscire? ");
			String risposta = in.nextLine();
			if (risposta.equals("Depositare")) {
				System.out.print("Quanto vuoi depositare? ");
				String deposito = in.nextLine();
				contoCorrente.versareDenaro(deposito);
				System.out.println("Il tuo saldo attuale é: " + contoCorrente.getSaldo() + "");

			} else if (risposta.equals("Prelevare")) {
				System.out.print("Quanto vuoi prelevare? ");
				String prelievo = in.nextLine();
				double current = contoCorrente.prelevareDenaro(prelievo); //Sennò non usciva -1 e non si capive il messaggio di errore!!!
				System.out.println("Il tuo saldo attuale é: " + current + "");

			} else {
				System.out.println("Sei uscito!");
				finished = true;
			}
		} while (!finished);
		in.close();

	}
}
