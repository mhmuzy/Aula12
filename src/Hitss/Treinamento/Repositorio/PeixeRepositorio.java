package Hitss.Treinamento.Repositorio;

public class PeixeRepositorio extends AnimalRepositorio {

	@Override
	public void locomover() {
		System.out.println("Nadando");	
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Substâncias");	
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}

}
