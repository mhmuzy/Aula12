package Hitss.Treinamento.Repositorio;

public class AveRepositorio extends AnimalRepositorio {

	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Frutas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Ave");
	}
	
	public void fazerNinho() {
		System.out.println("Construindo Ninho");
	}

}
