package conhecimento;

abstract class Animal implements SerVivo{
	
	private Boolean vivo;
	private int massa;
	private int x;
	private int y;
	private int vel;
	private int forca;
	
	public Animal(int vel, int massa, int forca) {
		this.vivo = true;
		this.massa = massa;
		this.x = 0;
		this.y = 0;
		this.forca = forca;
		this.vel = vel;
	}
	
	
	
	
	public boolean isVivo() {
		return vivo;
	}




	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}




	public int getMassa() {
		return massa;
	}




	public void setMassa(int massa) {
		this.massa = massa;
	}




	public int getX() {
		return x;
	}




	public void setX(int x) {
		this.x = x;
	}




	public int getY() {
		return y;
	}




	public void setY(int y) {
		this.y = y;
	}




	public int getVel() {
		return vel;
	}




	public void setVel(int vel) {
		this.vel = vel;
	}




	public int getForca() {
		return forca;
	}



	public void setForca(int forca) {
		this.forca = forca;
	}

	public void atacar(Animal animalASerAtacado) {
		if(this.vivo) {
			if(this.forca > animalASerAtacado.getForca()) {
				this.forca += animalASerAtacado.getMassa();
				animalASerAtacado.setVivo(false);
			}else {
				this.vivo = false;
			}
		}else {
			System.out.println("-----------------------");
			System.out.println(this.getClass().toGenericString() + " esta morto, não pode atacar!");
			System.out.println("-----------------------");
		}
	}
	

	@Override
	public void mover() {
		if(this.isVivo()) {
			this.x += vel;
			this.y += vel;
		} else {
			System.out.println("-----------------------");
			System.out.println(this.getClass().toGenericString() + " esta morto, não pode mover!");
			System.out.println("-----------------------");
		}
	}
	
	@Override
    public void comer(int massa) {
		if(this.vivo = true) {
			this.forca += massa;
		} else {
			System.out.println("-----------------------");
			System.out.println(this.getClass().toGenericString() + " esta morto, não pode comer!");
			System.out.println("-----------------------");
		}
	}
	
	@Override
    public void info() {
		System.out.printf("Tipo.:%s%n", this.getClass().toString());
		System.out.printf("Vivo.:%s%n", this.isVivo() ? "sim":"nao");
		System.out.printf("Massa.:%d%n", this.getMassa());
		System.out.printf("Vel.:%d%n", this.getVel());
		System.out.printf("Forca.:%d%n", this.getForca());
		System.out.println("-----------------------");
	}
}