package it.fucarino;

public class Cane extends Animale implements Marini{
	
	
	@Override
	public void faiVerso() {
		System.out.println("Il mio verso è: 'Abbaiare'");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangio carne e alcuni vegetali");
		
	}

	@Override
	public void setNome(String nomeInput) {
		
		super.nome = nomeInput;
		
	}

	@Override
	public void setTipoAnimale(String tipoAnimale) {
		super.tipoAnimale = tipoAnimale;
		
	}

	@Override
	public void faiNuotare() {
		System.out.println("Sto nuotando...");
		
	}
	
}

