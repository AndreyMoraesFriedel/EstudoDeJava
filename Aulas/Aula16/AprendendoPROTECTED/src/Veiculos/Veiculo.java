package Veiculos;

public class Veiculo {
	protected String nome;
	protected int tipo;
	
	public Veiculo(String nome, int tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}
	
	public void info() {
		System.out.printf("Nome:%s%n",this.nome);
		System.out.printf("Nome:%d%n",this.tipo);
	}
}