package it.fucarino;

public class Main {
	public static void main(String[] args) {
		
		Animale cane =  new Cane();
		
		cane.setTipoAnimale("Cane");
		cane.getTipoAnimale();
		cane.setNome("Fritz");
		cane.getNome();
		cane.faiVerso();
		cane.mangia();
		cane.dormi();
		
		System.out.println("\n");
		
		Animale passerotto = new Passerotto();
		
		
		passerotto.setTipoAnimale("Passerotto");
		passerotto.setNome("Noui");
		passerotto.getNome();
		passerotto.faiVerso();
		passerotto.mangia();
		passerotto.dormi();
	}
}
