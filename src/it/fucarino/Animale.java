package it.fucarino;

 public abstract class Animale implements Volatili, Marini {
	 
	 protected String nome;
	 protected String tipoAnimale;
	 
	 public abstract void setNome(String nomeInput);
	 public abstract void setTipoAnimale(String tipoAnimale);
	 public abstract void faiVerso();
	 public abstract void mangia();
	 
	 public void getNome() {
		 System.out.println("Il mio nome è " + nome);
	 }
	 
	 public void getTipoAnimale() {
		 System.out.println("Sono un: " + tipoAnimale);
	 }
	 

		public void dormi() {
			System.out.println("Buonanotte! Zzz...");
			
		}

	
}
