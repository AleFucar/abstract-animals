package it.fucarino;

public class Passerotto extends Animale {

	@Override
	public void setNome(String nomeInput) {
		super.nome = nomeInput;
		
	}

	@Override
	public void faiVerso() {
		System.out.println("Il mio verso è  'Cinguettio'");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mangio fiocchi d'avena, noci e nocciole, uvette e frutta");
		
	}

	@Override
	public void setTipoAnimale(String tipoAnimale) {
		System.out.println("Sono un Passerotto");
		
	}

}
