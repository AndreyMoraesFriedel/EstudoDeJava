package conhecimento;

public class Aranha extends Animal{

    private int veneno;

    public Aranha(int vel, int massa, int forca, int veneno) {
		super(vel, massa, forca);
        this.veneno = veneno;
	}

    @Override
    public void atacar(Animal animalASerAtacado){
        if(this.isVivo()) {
			if(this.getForca() <= animalASerAtacado.getForca()) {
				this.setForca(this.getForca() + animalASerAtacado.getMassa());
			}
            if((this.getForca() + this.veneno) > animalASerAtacado.getForca()) {
				//this.setForca(this.getForca() + animalASerAtacado.getMassa());
                animalASerAtacado.setVivo(false);
			}else{
                this.setVivo(false);
            }
		}else {
			System.out.println("-----------------------");
			System.out.println("Este animal esta morto, não pode atacar!");
			System.out.println("-----------------------");
		}
    }
    
}