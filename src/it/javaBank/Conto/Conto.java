package it.javaBank.Conto;

public class Conto {
	private double numConto;
	private String nome;
	private int saldo = 0;

	public Conto(double numConto, String nome) {
		this.numConto = numConto;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNumConto() {
		return numConto;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public double versareDenaro(String num) {
		return saldo = this.saldo + Integer.parseInt(num);

	}

	public double prelevareDenaro(String num) {
		if (this.saldo > Integer.parseInt(num))
			return saldo = this.saldo - Integer.parseInt(num);
		else
			return -1;
	}

}
