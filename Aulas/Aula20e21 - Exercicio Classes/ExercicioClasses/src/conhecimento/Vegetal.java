package conhecimento;

public class Vegetal {
	
	private Boolean vivo;
	private int massa;
	
	public Vegetal(int massa) {
		this.vivo = true;
		this.massa = massa;
	}

	public Boolean getVivo() {
		return vivo;
	}

	public void setVivo(Boolean vivo) {
		this.vivo = vivo;
	}

	public int getMassa() {
		return massa;
	}

	public void setMassa(int massa) {
		this.massa = massa;
	}
	
	
    public void info() {
		System.out.printf("Tipo.:%s%n", this.getClass().toString());
		System.out.printf("Vivo.:%s%n", this.getVivo() ? "sim":"nao");
		System.out.printf("Massa.:%d%n", this.getMassa());
		System.out.println("-----------------------");
	}
	
	
}
