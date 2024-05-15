package it.fucarino;

 public abstract class Animale {
	 
	 protected String nome;
	 protected String tipoAnimale;
	 
	 public abstract void setNome(String nomeInput);
	 public abstract void faiVerso();
	 public abstract void mangia();
	 public abstract void setTipoAnimale(String tipoAnimale);
	 
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
