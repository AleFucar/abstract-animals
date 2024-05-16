package it.fucarino;

public class Main {
	public static void main(String[] args) {
		
		Cane cane =  new Cane();
		
		cane.setTipoAnimale("Cane");
		cane.getTipoAnimale();
		cane.setNome("Fritz");
		cane.getNome();
		cane.faiVerso();
		cane.mangia();
		faiNuotare(cane);
		cane.dormi();
		
		System.out.println("\n\n");
		
		Passerotto passerotto = new Passerotto();
		
		
		passerotto.setTipoAnimale("Passerotto");
		passerotto.setNome("Noui");
		passerotto.getNome();
		passerotto.faiVerso();
		passerotto.mangia();
		passerotto.faiVolare();
		passerotto.dormi();
	}
	
	
	public static void faiNuotare(Marini animale) {
		animale.faiNuotare();
	}
	
	public static void faiVolare(Volatili animale) {
		animale.faiVolare();
	}
	
}
